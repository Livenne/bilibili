package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.Comment;
import com.livenne.bilibili.Pojo.User;

public interface CommentService {
    Comment getCommentById(long id);
    void addComment(Comment comment);
    void updateComment(Comment comment);
    void deleteComment(long id);
}
