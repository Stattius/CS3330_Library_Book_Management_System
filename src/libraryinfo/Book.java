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
	
	
	public static void NewBook(String[] args) {
		
		Book obj = new Book();
		
		
		
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
}