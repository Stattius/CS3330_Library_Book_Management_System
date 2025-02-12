package libraryinfo;

public class Book {
	String Title = "_";
	String Author = "_";
	String ISBN = "_";
	double Price = 0.0;
	//test test


	public Book() {
		String Set ="Unknown";
		Title = Set;
		Author = Set;
		ISBN = Set;
		Price = 0.0;
	}
	
	
	public static void NewBook(String[] args) {
		
		Book rotk = new Book();
		System.out.println(rotk.Author + "\n" + rotk.Title);
		
	}
	
	public static void SetBook(Book BookName, String Title, String Author, String ISBN, double Price) {
		
		BookName.Title = Title;
		BookName.Author = Author;
		BookName.ISBN = ISBN;
		BookName.Price = Price;
		
		System.out.println(BookName.Author + "\n" + BookName.Title);
		
	}	
}