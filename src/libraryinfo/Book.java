package libraryinfo;

public class Book {//book class
	String title ;
	String author ;
	String ISBN ;
	double price ;
	//test test


	public Book() {//default constructor
		
		
		
		String Set ="Unknown";
		title = Set;
		author = Set;
		ISBN = Set;
		price = 0.0;
	}
	public Book(Book BookName) {//copy constructor 
		
		 title = BookName.getTitle();
		 author = BookName.getAuthor();
		 ISBN = BookName.getISBN();
		 price = BookName.getPrice();
		
		
	}
	public Book(String title, String author, String ISBN, double price) {
		
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
		
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
	
	public String getTitle() {//get title method
		
		
		
		
		return title;
	}
	
	public String getAuthor() {//get author method
		
		
		return author;
	}
	
	public String getISBN() {//get ISBN method
		
		
		return ISBN;
	}
	
	public double getPrice() {//get Price method
		
		return price;
	}
	
	public void setTitle(String title) {//set title method
	
	this.title = title;
	
	}
	public void setAuthor(String author) {//set author method
		
		
		this.author = author;
	}
	public void setISBN( String ISBN) {//set ISBN method
		this.ISBN = ISBN;
		
	}
	public void setPrice(Double price) { //set price method
		
		this.price = price;
	}
	public void bookPrint() {//bookprint method
	
		System.out.println(this.getTitle());
		System.out.println(this.getAuthor());
		System.out.println(this.getISBN());
		System.out.println(this.getPrice());
		
	}
	public void setBook( String Title, String Author, String ISBN,Double Price) {//set book method
	
		this.setTitle(Title);
		
		this.setAuthor( Author);
		
		this.setISBN(ISBN);
		
		this.setPrice(Price);
		
		
	
	}
	public String toString() {//string method
		
		return title +" by " + author + " (ISBN:"+ISBN +", "+price+")";
	}
	
	public boolean equals(Book Book) {//equals boolean
		
		if(Book.getISBN() == this.getISBN()) {
			
		return true;
		}
		else
		return false;
	}
}