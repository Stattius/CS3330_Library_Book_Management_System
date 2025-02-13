package libraryhome;

import libraryinfo.Library;

public class LibraryApp {

	public static void main(String[] args) {

	/**
	 * Library object is created out of Library
	 */
	Library library = new Library();
		
	/**
	 * method calls to add a book to the array
	 */
	System.out.println("Adding books... ");
	library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99));
    library.addBook(new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99));
    library.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 45.99));
	
	
   	/**
   	 * call to find book based off of ISBN
   	 */
    String search = "978-0135166307";
    System.out.println("Searching for book with ISBN: " + search);
    Book found = library.searchByISBN(search);
    if(found != null) {
    	System.out.println("Book found: " + found);
    }

   	/**
   	 * printing off all available books in the array
   	 */
    System.out.println("All books in the library:");
    library.displayBooks();
    
    /**
     * calls for removal of a book from the system
     */
    System.out.println("Removing book: Design patterns");
    library.removeBook(new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99));
	
    /**
     * printing off all available books in the array
     */
    System.out.println("All books in the library:");
    library.displayBooks();
    
    /**
     * trying to remove another book that does not exist
     */
    System.out.println("Removing book: Design patterns");
    library.removeBook(new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99));
	}

}
