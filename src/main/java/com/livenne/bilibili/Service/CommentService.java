package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.Comment;
import com.livenne.bilibili.Pojo.User;
import org.springframework.stereotype.Service;

@Service
public class CommentService implements ICommentService {
    @Override
    public Comment getCommentByCommentId(long commentId) {
        return null;
    }

    @Override
    public User getUserByCommentId(long commentId) {
        return null;
    }

    @Override
    public String getContentByCommentId(long commentId) {
        return "";
    }

    @Override
    public String getReleaseDateByCommentId(long commentId) {
        return "";
    }

    @Override
    public int getLikeCountByCommentId(long commentId) {
        return 0;
    }
}
