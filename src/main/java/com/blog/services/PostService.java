package com.blog.services;

import java.util.List;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

public interface PostService {
    // create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    // update
    PostDto updatePost(PostDto postDto, Integer postId);

    // delete
    void deletePost(Integer postId);

    // get all posts
    PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

    // get single post
    PostDto getPostById(Integer postId);

    // get all posts by category
    List<PostDto> getAllPostsByCategory(Integer categoryId);

    // get all posts by user
    List<PostDto> getAllPostsByUser(Integer userId);

    // search posts
    List<PostDto> searchPosts(String keyword);
}
