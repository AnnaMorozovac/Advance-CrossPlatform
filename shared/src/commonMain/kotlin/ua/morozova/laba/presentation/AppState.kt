package ua.morozova.laba.presentation

import androidx.compose.runtime.Immutable
import ua.morozova.laba.data.posts.model.responses.Post

@Immutable
internal data class AppState(
    val isProgressVisible: Boolean = false,
    val posts: List<Post> = emptyList(),
    val result: String? = null,
    val error: String? = null,
)