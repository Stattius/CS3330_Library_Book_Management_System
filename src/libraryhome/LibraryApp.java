package libraryhome;

import libraryinfo.Book;
import libraryinfo.Library;

public class LibraryApp {

	public static void main(String[] args) {

	/**
	 * Library object is created out of Library
	 */
	Library library = new Library();
		
		//adding 3 new books
	System.out.println("Adding books... ");
	library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99));
    library.addBook(new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99));
    library.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 45.99));
	
	
   		//searching for the book by ISBN
    String search = "978-0135166307";
    System.out.println("Searching for book with ISBN: " + search);
    Book found = library.searchByISBN(search);
    if(found != null) {
    	System.out.println("Book found: " + found);
    }

	
	
	
	
	
	}

}
