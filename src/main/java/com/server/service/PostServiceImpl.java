package com.server.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.entity.Post;
import com.server.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post) {
        post.setLikeCount(0);
        post.setViewCount(0);
        post.setDate(new Date());
        
        return postRepository.save(post);
    }
}
