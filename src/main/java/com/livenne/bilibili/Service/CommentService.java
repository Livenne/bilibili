package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService{
    List<Comment> getAllComment();
    Comment getCommentById(Integer id);
    void addComment(Comment comment);
    void updateComment(Comment comment);
    void deleteComment(Integer id);
}
