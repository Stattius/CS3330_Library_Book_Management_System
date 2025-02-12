package libraryinfo;

public class Library {
	
	/**
	* this is the attributes that make up our library
	* book is set as an array of books
	*/
	private Book[] books;
	private int count;

	/**
	*this is a Library construct with the values of attributes
	*books and count, setting the value to 0 and the array
	*to a maximum of 5
	*/
	public Library() {
		this.books = new Book[5];
		this.count = 0;
	}
	
	/**
	* this method will add a book
	* @param book
	* 		this argument is the book object thats added
	* @return
	* 		return false if the array is full
	* 		return true if the book was added correctly
	*/
	public boolean addBook(Book book) {
		if (count < books.length) {
			books[count] = book;
			count++;
			return true;
		}
		return false;
	}
	
	/**
	* this method deletes a book from the system
	* @param book
	* 		this argument is the book object that is deleted
	* @return
	* 		returns true if the book is within the system and can be deleted
	* 		returns false if the book is not within the system
	*/
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
	
	
	/**
	* this method searches the array of books and
	* compares ISBN to find the appropriate book
	* @param ISBN
	* 		this argument will be compared to other ISBNs in the array
	* 		and search for it
	* @return
	* 		returns the ISBN if it is found
	* 		returns null if the book is neither within the system or is null value
	*/
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
	
	/**
	* this method loops through the array of books
	* and displays each book's information
	*/
	public void displayBooks() {
		for(int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". " + books[i]);
		}
	}
}