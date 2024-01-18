package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class CommentDTO {

    private int author;
    private String authorImage;
    private String authorFirstName;
    private int createAd;
    private int pk;
    private String text;
}
