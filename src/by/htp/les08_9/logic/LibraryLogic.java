package by.htp.les08_9.logic;

import  java.util.ArrayList;
import  java.util.List;

import by.htp.les08_9.entity.Book;

public class LibraryLogic {

	public  List <Book> findByAuthor(LibraryLogic librarys, String authors) {
		
		List<Book> book = library.getLibrary();
		List<Book> findBooks = new ArrayList<Book>();
			
		for (int i = 0; i < books.size(); i ++) {			
			if (books.get(i).getAuthor().contains(authors)) {
				findBook.add(book.get(i));
			}
		}
		return findBooks;
	}
		
	public  List<Book> findByPublishingHouse(Library library, String publishingHouse) {
		int i;
		List<Book>book = library.getLibrary();
		List<Book>findBooks = new ArrayList<Book>();
			
		for (i = 0; i < books.size(); i++) {			
			if (books.get(i).getPublishingHouse().contains(publishingHouse)) {
				findBook.add(book.get(i));
			}
		}
		return findBooks;
	}
		
	public  List<Book> findAfterGivenYear (library library, int year) {
		int i;
		List<Книга> book =library.getLibrary();
		List<Book> findBooks = new ArrayList<Book>();
			
		for (i = 0; i < books.size(); i++) {			
			if (books.get(i).getYearOfPublishing() > year) {
				findBook.add(book.get(i));
			}
		}
		return findBooks;
	}
}
