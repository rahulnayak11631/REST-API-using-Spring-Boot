package com.example.rest_api_spring_boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.rest_api_spring_boot.Entities.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{
    public Book findById(int id);
}
