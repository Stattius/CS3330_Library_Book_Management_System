package libraryhome;

import libraryinfo.Book;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a test statement");
		
		
		Book obj = new Book();
		obj.bookPrint(obj);
		obj.setTitle(obj, "Return of the King");
		obj.setAuthor(obj, "Tolkien");
		obj.setISBN(obj, "abc123");
		obj.setPrice(obj, 50.07);
		obj.bookPrint(obj);
		//Book.NewBook(null);
		//Book.SetBook("Return of the king", "Tolkien", "123abc", , 0);
	}

}
//test test