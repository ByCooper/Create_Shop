package ru.skypro.homework.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.CommentDTO;
import ru.skypro.homework.dto.CreateOrUpdateCommentDTO;
import ru.skypro.homework.service.CommentService;

/**
 * Класс-контроллер для запуска эндпоинтов, относящихся к комментариям объявлений
 *
 * @author Куприянов Анатолий
 */
@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("ads")
public class CommentController {

    //private final CommentService commentService;

//    public CommentController(CommentService commentService) {
//        this.commentService = commentService;
//    }

    /**
     * Метод для получения всех комментариев к объявлению
     */
    @GetMapping(path = "/{id}/comments")
    public ResponseEntity<CommentDTO> getComments(@PathVariable Integer id) {
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
     * Метод для добавления комментария к объявлению
     */
    @PostMapping(path = "/{id}/comments")
    public ResponseEntity<CreateOrUpdateCommentDTO> addComments(@PathVariable Integer id) {
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
     * Метод для удаления комментария у объявления
     */
    @DeleteMapping(path = "/{adId}/comments/{commentId}")
    public ResponseEntity<CommentDTO> deleteComment(@PathVariable Integer id,
                                                    @PathVariable Integer commentId) {
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
     * Метод для обновления комментария у объявления
     */
    @PatchMapping(path = "/{adId}/comments/{commentId}")
    public ResponseEntity<CreateOrUpdateCommentDTO> updateComment(@PathVariable Integer id,
                                                                  @PathVariable Integer commentId) {
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


}
