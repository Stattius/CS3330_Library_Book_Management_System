package libraryinfo;

public class Library {
	
		//attributes
	private Book[] books;
	private int count;

		//Library construct to set values
	public Library() {
		this.books = new Book[5];
		this.count = 0;
	}
	
	//method to add a book
	public boolean addBook(Book book) {
	if (count < books.length) {
		books[count] = book;
		count++;
		return true;
	}
	return false;
}
	
	
	
	
}
