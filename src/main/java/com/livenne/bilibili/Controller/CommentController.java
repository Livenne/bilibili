package com.livenne.bilibili.Controller;

import com.livenne.bilibili.Pojo.Comment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentController extends BaseController {
    @GetMapping
    public List<Comment> getAllComment() {
        return commentService.getAllComment();
    }

    @GetMapping("/{id}")
    public Comment getComment(@PathVariable int id) {
        return commentService.getCommentById(id);
    }

    @PostMapping
    public void addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);
    }

    @PutMapping
    public void updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable int id) {
        commentService.deleteComment(id);
    }
}
