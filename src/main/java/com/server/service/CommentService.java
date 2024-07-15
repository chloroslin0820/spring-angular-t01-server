package com.server.service;

import java.util.List;

import com.server.entity.Comment;

public interface CommentService {

    public Comment createComment(Long postId, String postedBy, String content);

    public List<Comment> getCommentsByPostId(Long postId);
}
