package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.Comment;
import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Pojo.Video;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements IVideoService {
    @Override
    public Video getVideoByVideoId(long videoId) {
        return null;
    }

    @Override
    public List<Comment> getCommentByVideoId(long videoId) {
        return List.of();
    }

    @Override
    public User getUserByVideoId(long videoId) {
        return null;
    }

    @Override
    public String getTitleByVideoId(long videoId) {
        return "";
    }

    @Override
    public String getReleaseDateByVideoId(long videoId) {
        return "";
    }

    @Override
    public String getDescriptionByVideoId(long videoId) {
        return "";
    }

    @Override
    public String getDurationByVideoId(long videoId) {
        return "";
    }

    @Override
    public String getVideoUrlByVideoId(long videoId) {
        return "";
    }

    @Override
    public String[] getTagByVideoId(long videoId) {
        return new String[0];
    }

    @Override
    public long getPlayCountByVideoId(long videoId) {
        return 0;
    }

    @Override
    public int getCollectionByVideoId(long videoId) {
        return 0;
    }

    @Override
    public int getLikeCountByVideoId(long videoId) {
        return 0;
    }

    @Override
    public int getCoinByVideoId(long videoId) {
        return 0;
    }
}
