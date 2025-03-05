package com.livenne.bilibili.Pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private long xp;
    private String userName;
    private String password;
    private String signature;
    private String phoneNumber;
    private String headImageUrl;
    @OneToMany
    private List<User> followers;
    @OneToMany
    private List<User> following;
    @OneToMany
    private List<Video> videos;
    @OneToMany
    private List<Video> collectionVideo;
    private int level;
    private int coin;
}
