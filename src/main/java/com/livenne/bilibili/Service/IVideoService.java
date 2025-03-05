package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.Comment;
import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Pojo.Video;

import java.util.List;

public interface IVideoService {
    Video getVideoByVideoId(long videoId);
    List<Comment> getCommentByVideoId(long videoId);
    User getUserByVideoId(long videoId);
    String getTitleByVideoId(long videoId);
    String getReleaseDateByVideoId(long videoId);
    String getDescriptionByVideoId(long videoId);
    String getDurationByVideoId(long videoId);
    String getVideoUrlByVideoId(long videoId);
    String[] getTagByVideoId(long videoId);
    long getPlayCountByVideoId(long videoId);
    int getCollectionByVideoId(long videoId);
    int getLikeCountByVideoId(long videoId);
    int getCoinByVideoId(long videoId);

}
