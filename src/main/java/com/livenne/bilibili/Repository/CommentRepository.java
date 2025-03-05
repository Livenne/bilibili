package com.livenne.bilibili.Repository;

import com.livenne.bilibili.Pojo.Comment;
import com.livenne.bilibili.Pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
