package ua.morozova.laba.data.posts

import ua.morozova.laba.data.common.NetworkResult
import ua.morozova.laba.data.posts.model.requests.NewPost
import ua.morozova.laba.data.posts.model.responses.DeletedPost
import ua.morozova.laba.data.posts.model.responses.Post
import ua.morozova.laba.data.posts.model.responses.Posts

internal const val BASE_URL = "https://dummyjson.com/"
internal const val POSTS_API = "posts"

internal const val ADD_POST = "add"

internal interface PostApiService {
    suspend fun getAllPosts(): NetworkResult<Posts>
    suspend fun addPost(post: NewPost): NetworkResult<Post>
    suspend fun updatePost(post: Post): NetworkResult<Post>
    suspend fun deletePost(postId: Int): NetworkResult<DeletedPost>
}