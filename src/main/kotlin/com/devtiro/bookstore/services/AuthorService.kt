package com.willweimike.bookstore.services

import com.willweimike.bookstore.domain.AuthorUpdateRequest
import com.willweimike.bookstore.domain.entities.AuthorEntity

interface AuthorService {

    fun create(authorEntity: AuthorEntity): AuthorEntity

    fun list(): List<AuthorEntity>

    fun get(id: Long): AuthorEntity?

    fun fullUpdate(id: Long, authorEntity: AuthorEntity): AuthorEntity

    fun partialUpdate(id: Long, authorUpdate: AuthorUpdateRequest): AuthorEntity

    fun delete(id: Long)

}