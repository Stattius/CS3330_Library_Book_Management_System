package libraryinfo;

public class Book {//book class
	String Title ;
	String Author ;
	String ISBN ;
	double Price ;
	//test test


	public Book() {//default constructor
		
		
		
		String Set ="Unknown";
		Title = Set;
		Author = Set;
		ISBN = Set;
		Price = 0.0;
	}
	public Book(Book BookName) {//copy constructor 
		
		 Title = BookName.getTitle(BookName);
		 Author = BookName.getAuthor(BookName);
		 ISBN = BookName.getISBN(BookName);
		 Price = BookName.getPrice(BookName);
		
		
	}
	
	//public static void NewBook(String[] args) {
		
		//Book obj = new Book();
		
		
		
//	} 
	
	/*public static void SetBook(Book BookName, String Title, String Author, String ISBN, double Price) {
		
		BookName.Title = Title;
		BookName.Author = Author;
		BookName.ISBN = ISBN;
		BookName.Price = Price;
		
		System.out.println(BookName.Author + "\n" + BookName.Title);
		
	}*/	
	
	public String getTitle(Book BookName) {//get title method
		
		
		
		
		return BookName.Title;
	}
	
	public String getAuthor(Book BookName) {//get author method
		
		
		return BookName.Author;
	}
	
	public String getISBN(Book BookName) {//get ISBN method
		
		
		return BookName.ISBN;
	}
	
	public double getPrice(Book BookName) {//get Price method
		
		return BookName.Price;
	}
	
	public void setTitle(Book BookName, String Title) {//set title method
	
	BookName.Title = Title;
	
	}
	public void setAuthor(Book BookName, String Author) {//set author method
		
		
		BookName.Author = Author;
	}
	public void setISBN(Book BookName, String ISBN) {//set ISBN method
		BookName.ISBN = ISBN;
		
	}
	public void setPrice(Book BookName, Double Price) { //set price method
		
		BookName.Price = Price;
	}
	public void bookPrint(Book BookName) {//bookprint method
	
		System.out.println(BookName.getTitle(BookName));
		System.out.println(BookName.getAuthor(BookName));
		System.out.println(BookName.getISBN(BookName));
		System.out.println(BookName.getPrice(BookName));
		
	}
	public void setBook(Book BookName, String Title, String Author, String ISBN,Double Price) {//set book method
	
		BookName.setTitle(BookName, Title);
		
		BookName.setAuthor(BookName, Author);
		
		BookName.setISBN(BookName, ISBN);
		
		BookName.setPrice(BookName, Price);
		
		
	
	}
	public String toString() {//string method
		
		return "book" + Title + Author + ISBN + Price;
	}
	
	public boolean equals(Book Book1, Book Book2) {//equals boolean
		
		if(Book1.getISBN(Book2) == Book2.getISBN(Book2)) {
			
		return true;
		}
		else
		return false;
	}
}