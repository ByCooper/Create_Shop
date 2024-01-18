package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    @JoinColumn(name = "author_id")
    @ManyToOne
    private User author;
    private String authorImage;
    private String authorFirstName;
    private long createdAt;
    private String text;
    @JoinColumn(name = "ad_id")
    @ManyToOne
    private Ad ad;

}
