package com.livenne.bilibili.Service.Impl;

import com.livenne.bilibili.Pojo.Comment;
import com.livenne.bilibili.Service.CommentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl extends BaseService implements CommentService {
    @Override
    public List<Comment> getAllComment() {
        List<Comment> comments = new ArrayList<>();
        commentRepository.findAll().forEach(comments::add);
        return comments;
    }

    @Override
    public Comment getCommentById(Integer id) {
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
    public void deleteComment(Integer id) {
        commentRepository.deleteById(id);
    }
}
