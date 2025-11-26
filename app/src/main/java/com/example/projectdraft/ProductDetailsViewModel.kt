package com.example.projectdraft

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.util.UUID

data class Comment(
    val id: String,
    val productId: String,
    val userName: String,
    val text: String,
    val timestamp: Long
)

class ProductDetailViewModel : ViewModel() {
    private val _comments = MutableStateFlow<List<Comment>>(emptyList())
    val comments: StateFlow<List<Comment>> = _comments

    fun addComment(productId: String, userName: String, text: String) {
        val newComment = Comment(
            id = UUID.randomUUID().toString(),
            productId = productId,
            userName = userName,
            text = text,
            timestamp = System.currentTimeMillis()
        )
        _comments.value = _comments.value + newComment
    }
}