package ua.morozova.laba.domain.posts


import ua.morozova.laba.data.common.NetworkResult
import ua.morozova.laba.data.posts.PostApiService
import ua.morozova.laba.data.posts.model.requests.NewPost
import ua.morozova.laba.data.posts.model.responses.DeletedPost
import ua.morozova.laba.data.posts.model.responses.Post
import ua.morozova.laba.data.posts.model.responses.Posts

internal class AppPostRepository(
    private val postApiService: PostApiService
) : PostRepository {

    override suspend fun getAllPosts(): NetworkResult<Posts> {
        return postApiService.getAllPosts()
    }

    override suspend fun addPost(post: NewPost): NetworkResult<Post> {
        return postApiService.addPost(post)
    }

    override suspend fun updatePost(post: Post): NetworkResult<Post> {
        return postApiService.updatePost(post)
    }

    override suspend fun deletePost(postId: Int): NetworkResult<DeletedPost> {
        return postApiService.deletePost(postId)
    }
}