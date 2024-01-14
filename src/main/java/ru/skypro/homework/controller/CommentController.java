package ru.skypro.homework.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.Comment;
import ru.skypro.homework.dto.CreateOrUpdateComment;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("ads")
public class CommentController {

    @GetMapping(path = "/{id}/comments")
    public ResponseEntity<Comment> getComments(@PathVariable Integer id) {
//        if () {
//            return ResponseEntity.ok().build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND);
//        }
        return null;
    }
    @PostMapping(path = "/{id}/comments")
    public ResponseEntity<CreateOrUpdateComment> addComments(@PathVariable Integer id) {
//        if () {
//            return ResponseEntity.ok().build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND);
//        }
        return null;
    }
    @DeleteMapping(path = "/{adId}/comments/{commentId}")
    public ResponseEntity<Comment> deleteComment(@PathVariable Integer id,
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
    @PatchMapping(path = "/{adId}/comments/{commentId}")
    public ResponseEntity<CreateOrUpdateComment> updateComment(@PathVariable Integer id,
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
