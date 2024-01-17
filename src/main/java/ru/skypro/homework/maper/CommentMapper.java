package ru.skypro.homework.maper;

import org.mapstruct.Mapper;
import ru.skypro.homework.dto.CommentDTO;
import ru.skypro.homework.dto.CommentsDTO;
import ru.skypro.homework.dto.CreateOrUpdateCommentDTO;
import ru.skypro.homework.model.Comment;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    Comment commentDTOToComment(CommentDTO commentDTO);
    CommentDTO commentToCommentDTO(Comment model);
    Comment commentsDTOToComment(CommentsDTO comment);
    CommentsDTO commentToCommentsDTO(Comment model);
    Comment createOrUpdateCommentDTOToComment(CreateOrUpdateCommentDTO comment);
    CreateOrUpdateCommentDTO commentTocreateOrUpdateCommentDTO(Comment model);
}
