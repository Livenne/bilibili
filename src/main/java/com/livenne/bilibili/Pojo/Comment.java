package com.livenne.bilibili.Pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commentId;
    private String content;
    private String releaseDate;
    @ManyToOne
    private User author;
    private int likeCount;
}
