package com.willweimike.bookstore.repositories

import com.willweimike.bookstore.domain.entities.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: JpaRepository<BookEntity, String> {

    fun findByAuthorEntityId(id: Long): List<BookEntity>

}
