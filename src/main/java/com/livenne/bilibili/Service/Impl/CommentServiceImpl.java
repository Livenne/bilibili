package com.livenne.bilibili.Service.Impl;

import com.livenne.bilibili.Pojo.Comment;
import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends BaseService implements CommentService {

    @Override
    public Comment getCommentById(long id) {
        return commentRepository.findById(id).orElseThrow();
    }

    @Override
    public void addComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void updateComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void deleteComment(long id) {
        commentRepository.deleteById(id);
    }

}
