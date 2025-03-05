package com.livenne.bilibili.Controller;

import com.livenne.bilibili.Pojo.Comment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comment")
public class CommentController extends BaseController {

    @PostMapping
    public void addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable int id) {
        commentService.deleteComment(id);
    }

    @PutMapping
    public void updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
    }

    @GetMapping("/{id}")
    public Comment getComment(@PathVariable int id) {
        return commentService.getCommentById(id);
    }
}
