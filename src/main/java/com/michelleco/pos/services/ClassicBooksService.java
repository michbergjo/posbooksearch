package com.michelleco.pos.services;

import java.util.Date;
import java.util.List;

import com.michelleco.pos.data.HardCodedDataSource;
import com.michelleco.pos.domain.Book;
/***
 * 
 * @author mberg
 * this is pre-dependency injection 
 *
 */
public class ClassicBooksService {

	private HardCodedDataSource hardCodedDataSource = new HardCodedDataSource();
	
	public String nameClassicBooks() {
		List<Book> classicBooks = hardCodedDataSource.findBooksByDate(new Date(1970, 01, 01)); 
		StringBuilder result = new StringBuilder(); 
		result.append("Our Classic Books Are:");
		
		for (Book book : classicBooks) {
			result.append(book.getTitle());
			result.append(" ");
		}
		
		
		return result.toString();
	}
} 
