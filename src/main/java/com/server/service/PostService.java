package com.server.service;

import java.util.List;

import com.server.entity.Post;

public interface PostService {

    public Post savePost(Post post);

    public List<Post> getAllPosts();

    public Post getPostById(Long id);
}
