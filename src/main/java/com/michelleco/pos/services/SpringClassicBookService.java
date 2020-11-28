package com.michelleco.pos.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michelleco.pos.data.SpringHardCodedDataSource;
import com.michelleco.pos.domain.Book;

@Service
public class SpringClassicBookService {
	@Autowired
	private SpringHardCodedDataSource hardCodedDataSource;



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
