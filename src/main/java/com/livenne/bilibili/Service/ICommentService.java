package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.Comment;
import com.livenne.bilibili.Pojo.User;

public interface ICommentService {
    Comment getCommentByCommentId(long commentId);
    User getUserByCommentId(long commentId);
    String getContentByCommentId(long commentId);
    String getReleaseDateByCommentId(long commentId);
    int getLikeCountByCommentId(long commentId);
}
