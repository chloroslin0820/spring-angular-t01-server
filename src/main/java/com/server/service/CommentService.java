package com.server.service;

import com.server.entity.Comment;

public interface CommentService {

    public Comment createComment(Long postId, String postedBy, String content);
}
