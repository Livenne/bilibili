package com.livenne.bilibili.Pojo;

import java.util.List;

public class Video {
    private long videoId;
    private long playCount;
    private String[] tags;
    private String title;
    private String author;
    private String description;
    private String releaseDate;
    private String duration;
    private String videoUrl;
    private List<Comment> comments;
    private int collection;
    private int coin;
    private int likeCount;
}
