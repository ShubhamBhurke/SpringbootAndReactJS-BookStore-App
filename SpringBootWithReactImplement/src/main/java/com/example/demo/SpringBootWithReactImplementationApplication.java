package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.BookRepository;
import com.example.demo.model.BookStore;

@SpringBootApplication
public class SpringBootWithReactImplementationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithReactImplementationApplication.class, args);
	}
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public void run(String...args) throws Exception{
		 bookRepository.save(new BookStore("HalfGirlfriend","Chetan Bhagat","66775"));
		 bookRepository.save(new BookStore("Can love happen twice?","Ravi Tagore","77885"));
		 bookRepository.save(new BookStore("Bhagvadgeetha","Maharishi Vyas","22334"));
		 bookRepository.save(new BookStore("Ramayan","Ganesh","55668"));
		 bookRepository.save(new BookStore("C Programming","Dennis Ritchie","88776"));
		 bookRepository.save(new BookStore("Java: The Complete Reference","Herbert Schildt","88775"));
	}

}
