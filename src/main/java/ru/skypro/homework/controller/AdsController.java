package ru.skypro.homework.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.AdsDTO;
import ru.skypro.homework.dto.CreateOrUpdateAdDTO;
import ru.skypro.homework.service.AdService;

import java.io.IOException;
/**
 * Класс-контроллер для запуска эндпоинтов, относящихся к объявлениям
 *
 * @author Куприянов Анатолий
 */

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
//@RequiredArgsConstructor
//@AllArgsConstructor
@RequestMapping("ads")
public class AdsController {


    /**
     * Получение всех объявлений
     */
    @GetMapping
    public ResponseEntity<AdsDTO> getAllAds() {
//        if () {
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
        return null;
    }

    /**
     * Добавление объявления
     */
    @PostMapping
    public ResponseEntity<CreateOrUpdateAdDTO> addAd(@RequestBody AdsDTO ads) {
//        if () {
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
        return null;
    }

    //public AdsDto addAds(@Valid @RequestPart(name = "properties") CreateAdsDto ads, @RequestPart("image") MultipartFile file);

    /**
     * Получение информации об объявлении
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<CreateOrUpdateAdDTO> getAds(@PathVariable Integer id) {
//        if () {
//            return ResponseEntity.ok().build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND);
//        }
        return null;
    }

    /**
     * Удаление объявления
     */
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> removeAd(@PathVariable Integer id) {
//        if () {
//            return ResponseEntity.ok().build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.FORBIDDEN);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND);
//        }
        return null;
    }

    /**
     * Обновление информации об объявлении
     */
    @PatchMapping(path = "/{id}")
    public ResponseEntity<CreateOrUpdateAdDTO> updateAds(@PathVariable Integer id) {
//        if () {
//            return ResponseEntity.ok().build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.FORBIDDEN);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND);
//        }
        return null;
    }

    /**
     * Получение объявлений авторизованного пользователя
     */
    @GetMapping(path = "/me")
    public ResponseEntity<AdsDTO> getAdsMe(@RequestParam("login") String login) {
//        if () {
//            return ResponseEntity.ok().build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
        return null;
    }

    /**
     * Обновление картинки объявления
     */
    @PatchMapping(path = "/{id}/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<CreateOrUpdateAdDTO> updateImage(@PathVariable Integer id,
                                                           @RequestParam MultipartFile avatar) throws IOException {
//        if () {
//            return ResponseEntity.ok().build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.FORBIDDEN);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND);
//        }
        return null;
    }

    /**
     * Получение картинки объявления
     */
    @GetMapping(value = "/{id}/image", produces = {MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_GIF_VALUE, "image/*"})
    public byte[] getImage(@PathVariable("id") String id) {
//        return adService.getImage(id);
        return null;
    }

}
