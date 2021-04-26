package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookRepository;
import com.example.demo.model.BookStore;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StoreController {
	
	@Autowired
	BookRepository storeRespository;
	
	
	@GetMapping("//Bookstore")
	public List<BookStore> listofStores() {
		return storeRespository.findAll();
		
	}
}
