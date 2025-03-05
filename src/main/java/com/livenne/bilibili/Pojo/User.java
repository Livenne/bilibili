package com.livenne.bilibili.Pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.awt.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long xp;
    private String userName;
    private String password;
    private String signature;
    private String phoneNumber;
    private String headImageUrl;
    @OneToMany
    @JsonIgnore
    private List<User> followers;
    @OneToMany
    @JsonIgnore
    private List<User> following;
    @OneToMany
    @JsonIgnore
    private List<Video> videos;
    @OneToMany
    @JsonIgnore
    private List<Video> collectionVideo;
    private int level;
    private int coin;

}
