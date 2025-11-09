package com.example.blogmanagement.service;

import com.example.blogmanagement.dto.PagedResponse;
import com.example.blogmanagement.dto.PostRequestDto;
import com.example.blogmanagement.dto.PostResponseDto;


public interface PostService {


    PostResponseDto createPost(PostRequestDto request);


    PostResponseDto getPost(String postId);


    PostResponseDto updatePost(String postId, PostRequestDto request);


    void deletePost(String postId);


    PagedResponse<PostResponseDto> listPosts(int page, int size, String search);
}