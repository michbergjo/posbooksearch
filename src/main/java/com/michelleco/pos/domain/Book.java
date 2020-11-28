package com.michelleco.pos.domain;

import java.util.Date;

public class Book {

	private String isbn;
	private String title;
	private Date publishDate;
	
	
	public Book(String isbn, String title, Date publishDate) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.publishDate = publishDate;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	
}
