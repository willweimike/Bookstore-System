package com.willweimike.bookstore.domain

data class BookUpdateRequest(
    val title: String? = null,
    val description: String? = null,
    val image: String? = null,
)