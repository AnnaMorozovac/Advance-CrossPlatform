package ua.morozova.laba.domain.posts

import ua.morozova.laba.data.common.NetworkResult
import ua.morozova.laba.data.posts.model.requests.NewPost
import ua.morozova.laba.data.posts.model.responses.DeletedPost
import ua.morozova.laba.data.posts.model.responses.Post
import ua.morozova.laba.data.posts.model.responses.Posts

internal interface PostRepository {
    suspend fun getAllPosts(): NetworkResult<Posts>
    suspend fun addPost(post: NewPost): NetworkResult<Post>
    suspend fun updatePost(post: Post): NetworkResult<Post>
    suspend fun deletePost(postId: Int): NetworkResult<DeletedPost>
}