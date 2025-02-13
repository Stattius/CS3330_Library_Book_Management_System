package libraryhome;

import libraryinfo.Book;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a test statement");
		
		
		Book obj = new Book();
		System.out.println(obj.getTitle(obj));
		obj.setTitle(obj, "Return of the King");
		System.out.println(obj.getTitle(obj));
		//Book.NewBook(null);
		//Book.SetBook("Return of the king", "Tolkien", "123abc", , 0);
	}

}
//test test