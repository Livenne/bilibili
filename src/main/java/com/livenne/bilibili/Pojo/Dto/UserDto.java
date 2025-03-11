package com.livenne.bilibili.Pojo.Dto;

import com.livenne.bilibili.Pojo.User;

public class UserDto {
    private Integer id;
    private String nickName;
    private String signature;
    private String avatarUrl;
    private Integer gender;
    private Long xp;
    private Integer coin;

    public static UserDto userToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setNickname(user.getNickName());
        userDto.setSignature(user.getSignature());
        userDto.setAvatarUrl(user.getAvatarUrl());
        userDto.setGender(user.getGender());
        userDto.setXp(user.getXp());
        userDto.setCoin(user.getCoin());
        return userDto;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", signature='" + signature + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", gender=" + gender +
                ", xp=" + xp +
                ", coin=" + coin +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickname(String nickname) {
        this.nickName = nickname;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public long getXp() {
        return xp;
    }

    public void setXp(long xp) {
        this.xp = xp;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
