package com.michelleco.pos.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.michelleco.pos.domain.Book;

public class HardCodedDataSource {

	private List<Book> books;

	public HardCodedDataSource(List<Book> books) {
		super();
		this.books = books;
	}

	public HardCodedDataSource() {
		super();
		books = new ArrayList<>();
		books.add(new Book("111", "Catcher and the Rye", new Date(1960, 11, 04)));
		books.add(new Book("112", "Other Book", new Date(1975, 04, 04)));
		books.add(new Book("113", "Another Book", new Date(1925, 03, 14)));
		books.add(new Book("114", "Still More Books", new Date(1960, 02, 23)));
	}
	
	
	public List<Book> findBooksByDate(Date date){
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : books) {
			if(book.getPublishDate().compareTo(date) < 0) {
				result.add(book);
			}
		}
		
		
		return result;
	}
	
	
}
