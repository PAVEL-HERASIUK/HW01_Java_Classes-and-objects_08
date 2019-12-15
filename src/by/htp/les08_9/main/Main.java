package by.htp.les08_9.main;

import by.htp.les08_9.entity.Library;
import by.htp.les08_9.logic.LibraryLogic;
import by.htp.les08_9.entity.Book;
import by.htp.les08_9.view.LibraryView;

public class Main {
	
	public  static  void  main ( String [] args ) {

		Library library = new library (" Science Library ");
		
		library.setLibrary (new book (1234, " Java. Complete guide ", " Herbert Shildt ", " Dialectrics ", 2019, 1488, 100, "hard"));
		library.setLibrary (new book (5678, " Java. Effective programming", " Joshua J. Bloch ", " Sun ", 2001, 294 , 400, " hard "));
		library.setLibrary (new book (9123, " Object oriented programming in C ++ ", " Robert W. Lafore", " Peter ", 2019, 928, 1400, " hard "));
		
		LibraryLogic logic = new LibraryLogic();
		
		Library view = new LibraryView();
		
		see.PrintFindBooks(logic.FindAuthor(library, " Herbert Shildt "));
		see.PrintFindBooks(logic.FindPublishingHouse(library, " Dialectrics "));
		see.PrintFindBooks(logic.FindYearOfPublishing(library, 2019));
	}
}
