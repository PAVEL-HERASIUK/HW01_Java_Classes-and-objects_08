package by.htp.les08_9.view;

import java.util.List;
import by.htp.les08_9.entity.Book;

public class LibraryView {
			
	public  void  printFindBooks(List<Book> books) {
		int i;

		System.out.println(" Найти книги: ");
		for (i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
	}	
}
