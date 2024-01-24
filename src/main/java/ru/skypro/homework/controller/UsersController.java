package ru.skypro.homework.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.NewPasswordDTO;
import ru.skypro.homework.dto.UpdateUserDTO;
import ru.skypro.homework.service.UserService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Класс-контроллер для запуска эндпоинтов, относящихся к созданию и редактированию пользователей
 *
 * @author Куприянов Анатолий
 */
@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
//@RequiredArgsConstructor
//@AllArgsConstructor
@RequestMapping("users")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/set_passwords")
    public ResponseEntity setPassword(@RequestBody NewPasswordDTO newPassword, Authentication authentication) {
        if (newPassword.getCurrentPassword() != null && newPassword.getNewPassword() != null && !newPassword.getNewPassword().isBlank()) {
            userService.updatePassword(newPassword, authentication.getName());
            return ResponseEntity.ok().build();
        } else if (newPassword.getCurrentPassword() == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }

    @GetMapping(path = "/me")
    public ResponseEntity getUserMe(Authentication authentication) {
        if (authentication.getName() != null) {
            userService.getUserMe(authentication.getName());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @PatchMapping(path = "/me")
    public ResponseEntity<UpdateUserDTO> updateUser(@RequestBody UpdateUserDTO updateUser){
       UpdateUserDTO user = userService.updateUser(updateUser);
        if (user != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @PostMapping(path = "/me/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadUserImage(@RequestPart MultipartFile avatar) throws IOException {
        avatar.getBytes();
        Files.write(Path.of("/avatar/" + avatar.getName()), avatar.getBytes());
        if (avatar.getSize() > 1024 * 300) {
            return ResponseEntity.badRequest().body("Превышен размер файла");
        }else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
