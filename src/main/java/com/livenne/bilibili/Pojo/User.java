package com.livenne.bilibili.Pojo;

import java.awt.*;
import java.util.List;

public class User {
    private long userId;
    private long xp;
    private String userName;
    private String password;
    private String signature;
    private String phoneNumber;
    private String headImageUrl;
    private List<User> followers;
    private List<User> following;
    private List<Video> videos;
    private List<Video> collectionVideo;
    private int level;
    private int coin;
}
