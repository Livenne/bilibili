package com.livenne.bilibili.Pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String content;
    private String releaseDate;
    @ManyToOne
    private User author;
    private int likeCount;
}
