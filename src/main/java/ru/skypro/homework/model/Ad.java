package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "ads")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    @JoinColumn(name = "author_id")
    @ManyToOne
    private User author;
    private String image;
    private int price;
    private String title;
    private String description;
}
