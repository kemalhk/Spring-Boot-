package com.haydikodlayalim.pagitanion.repo;

import com.haydikodlayalim.pagitanion.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}