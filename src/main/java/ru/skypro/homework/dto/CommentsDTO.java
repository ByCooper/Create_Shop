package ru.skypro.homework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.skypro.homework.model.Comment;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentsDTO {
    private int count;
    private List<Comment> results;
}
