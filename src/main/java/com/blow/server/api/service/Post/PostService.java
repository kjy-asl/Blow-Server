package com.blow.server.api.service.Post;

import com.blow.server.api.dto.Post.request.PostCreateRequestDTO;
import com.blow.server.api.dto.Post.request.PostDeleteRequestDTO;
import com.blow.server.api.dto.Post.request.PostEditRequestDTO;
import com.blow.server.api.dto.Post.response.PostResponseDTO;

public interface PostService {
    PostResponseDTO getPosts();
    PostResponseDTO getPostsByCategory(String category);
    void createPost(Long userId, PostCreateRequestDTO request);
    void deletePost(Long userId, PostDeleteRequestDTO request);
    void updatePost(Long userId, PostEditRequestDTO request);
}
