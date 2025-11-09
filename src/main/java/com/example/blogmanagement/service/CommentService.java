package com.example.blogmanagement.service;

import com.example.blogmanagement.dto.CommentRequestDto;
import com.example.blogmanagement.dto.CommentResponseDto;
import com.example.blogmanagement.dto.PagedResponse;


public interface CommentService {


    CommentResponseDto createComment(CommentRequestDto request);


    CommentResponseDto getComment(String commentId);


    CommentResponseDto updateComment(String commentId, CommentRequestDto request);


    void deleteComment(String commentId);


    PagedResponse<CommentResponseDto> listCommentsByPostId(String postId, int page, int size);
}