package ru.skypro.homework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {

    private int author;
    private String authorImage;
    private String authorFirstName;
    private int createAd;
    private int pk;
    private String text;
}
