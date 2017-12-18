package com.gundam.springboot.springbootweb;

public class Book {

	private Long id;
	private String name;
	private String author;
	
	
	public Long getId() {
		return id;
	}
	public Book(Long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
