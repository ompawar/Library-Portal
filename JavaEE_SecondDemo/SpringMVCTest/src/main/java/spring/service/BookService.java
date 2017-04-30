package spring.service;

import java.util.List;

import spring.model.Book;
import spring.model.Person;


public interface BookService {

	public void addBook(Book b);
	public void removeBook(int id);
	public boolean checkBook(int id);
	public Book getBookById(int id);
}
