package com.library.bookify;

import com.library.bookify.Book;
import com.library.bookify.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}