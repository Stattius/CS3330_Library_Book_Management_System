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
	
		//method to delete a book from the system
	public boolean removeBook(Book book) {
		for(int i = 0; i < count; i++) {
			if (books[i].equals(book)){
				books[i] = books[count - 1];
				books[count - 1] = null;
				count--;
				return true;
			}
		}
		System.out.println("Cannot Remove book: " + book + "book does not exist");
		return false;
	}
	
	
		//searching the ISBN method implement
	public Book searchByISBN(String ISBN) {
		if(ISBN == null) {
			return null;
		}
		for(int i = 0; i < count; i++) {
			if (books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		return null;
	}
	
	
		//display library method
	public void displayBooks() {
		for(int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". " + books[i]);
		}
	}
}