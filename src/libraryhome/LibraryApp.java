package libraryhome;

import libraryinfo.Book;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a test statement");
		
		
		Book obj = new Book();
		obj.bookPrint();
		obj.setTitle("Return of the King");
		obj.setAuthor( "Tolkien");
		obj.setISBN("abc123");
		obj.setPrice( 50.07);
		obj.bookPrint();
		
		Book obj2 = new Book();
		obj2.setBook("The Blade itself", "Abercrombie", "efg456", 52.45);
		obj2.bookPrint();
		Book copy = new Book(obj);
		copy.bookPrint();
		String S1 = copy.toString();
		System.out.println(copy.toString());
		//Book.NewBook(null);
		//Book.SetBook("Return of the king", "Tolkien", "123abc", , 0);
	}

}
//test test