package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BookStore;

@Repository
public interface BookRepository extends JpaRepository<BookStore, Long> {

}
