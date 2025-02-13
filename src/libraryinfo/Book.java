package libraryinfo;

public class Book {
	String Title ;
	String Author ;
	String ISBN ;
	double Price ;
	//test test


	public Book() {
		
		
		
		String Set ="Unknown";
		Title = Set;
		Author = Set;
		ISBN = Set;
		Price = 0.0;
	}
	public Book(Book BookName) {
		
		 Title = BookName.getTitle(BookName);
		 Author = BookName.getAuthor(BookName);
		 ISBN = BookName.getISBN(BookName);
		 Price = BookName.getPrice(BookName);
		
		
	}
	
	public static void NewBook(String[] args) {
		
		//Book obj = new Book();
		
		
		
	}
	
	/*public static void SetBook(Book BookName, String Title, String Author, String ISBN, double Price) {
		
		BookName.Title = Title;
		BookName.Author = Author;
		BookName.ISBN = ISBN;
		BookName.Price = Price;
		
		System.out.println(BookName.Author + "\n" + BookName.Title);
		
	}*/	
	
	public String getTitle(Book BookName) {
		
		
		
		
		return BookName.Title;
	}
	
	public String getAuthor(Book BookName) {
		
		
		return BookName.Author;
	}
	
	public String getISBN(Book BookName) {
		
		
		return BookName.ISBN;
	}
	
	public double getPrice(Book BookName) {
		
		return BookName.Price;
	}
	
	public void setTitle(Book BookName, String Title) {
	
	BookName.Title = Title;
	
	}
	public void setAuthor(Book BookName, String Author) {
		
		
		BookName.Author = Author;
	}
	public void setISBN(Book BookName, String ISBN) {
		BookName.ISBN = ISBN;
		
	}
	public void setPrice(Book BookName, Double Price) {
		
		BookName.Price = Price;
	}
	public void bookPrint(Book BookName) {
	
		System.out.println(BookName.getTitle(BookName));
		System.out.println(BookName.getAuthor(BookName));
		System.out.println(BookName.getISBN(BookName));
		System.out.println(BookName.getPrice(BookName));
		
	}
	public void setBook(Book BookName, String Title, String Author, String ISBN,Double Price) {
	
		BookName.setTitle(BookName, Title);
		
		BookName.setAuthor(BookName, Author);
		
		BookName.setISBN(BookName, ISBN);
		
		BookName.setPrice(BookName, Price);
		
		
	
	}
	public String toString() {
		
		return "book" + Title + Author + ISBN + Price;
	}
	
}