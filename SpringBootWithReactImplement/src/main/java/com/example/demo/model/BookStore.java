package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bookstore")
public class BookStore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String bookName;
	private String authorName;
	private String serialNumber;
	
	public BookStore() {
		//default Constructor
	}
	
	public BookStore(String bookName, String authorName, String serialNumber) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.serialNumber = serialNumber;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getbookName() {
		return bookName;
	}
	public void setbookName(String bookName) {
		this.bookName = bookName;
	}
	public String getauthorName() {
		return authorName;
	}
	public void setauthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getserialNumber() {
		return serialNumber;
	}
	public void setserialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
	

}
