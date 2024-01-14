package ru.skypro.homework.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.Ads;
import ru.skypro.homework.dto.CreateOrUpdateAd;
import java.io.IOException;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("ads")
public class AdsController {

    @GetMapping
    public ResponseEntity<Ads> getAllAds() {
//        if () {
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
        return null;
    }

    @PostMapping
    public ResponseEntity<CreateOrUpdateAd> addAd(@RequestBody Ads ads) {
//        if () {
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
        return null;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CreateOrUpdateAd> getAds(@PathVariable Integer id) {
//        if () {
//            return ResponseEntity.ok().build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND);
//        }
        return null;
    }

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

    @PatchMapping(path = "/{id}")
    public ResponseEntity<CreateOrUpdateAd> updateAds(@PathVariable Integer id) {
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

    @GetMapping(path = "/me")
    public ResponseEntity<Ads> getAdsMe(@RequestParam("login") String login) {
//        if () {
//            return ResponseEntity.ok().build();
//        } else if () {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
        return null;
    }

    @PatchMapping(path = "/{id}/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<CreateOrUpdateAd> updateImage(@PathVariable Integer id,
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
}
