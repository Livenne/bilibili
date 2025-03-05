package com.livenne.bilibili.Pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long playCount;
    private String tags;
    private String title;
    private String author;
    private String description;
    private String releaseDate;
    private String duration;
    private String videoUrl;
    @OneToMany
    private List<Comment> comments;
    private int collection;
    private int coin;
    private int likeCount;
}
