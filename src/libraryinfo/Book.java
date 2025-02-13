package libraryinfo;
/**
 * creates book class
 */
public class Book {//book class
	String title ;
	String author ;
	String ISBN ;
	double price ;
	//test test

/**
 * the default constructor for book class
 */
	public Book() {//default constructor
		
		
		
		String Set ="Unknown";
		title = Set;
		author = Set;
		ISBN = Set;
		price = 0.0;
	}
	/**
	 * constructor that copies a book
	 * @param BookName
	 * copies the book variables into new book
	 */
	public Book(Book BookName) {//copy constructor 
		
		 title = BookName.getTitle();
		 author = BookName.getAuthor();
		 ISBN = BookName.getISBN();
		 price = BookName.getPrice();
		
		
	}
	/**
	 *  book constructor
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param price
	 * 
	 * takes parameters and fill them into the new book
	 */
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
	/**
	 * all getmethods function the same
	 * @return
	 * 
	 * getTittle returns books title
	 * getAuthor returns author
	 * the other methods return their respective variables 
	 */
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
	/**
	 * sets the title of the book with the parameter passed into it
	 * @param title
	 * 
	 * setTitle sets the book title
	 * setAuthor sets the author and so on with the other sets
	 */
	public void setTitle(String title) {//set title method
	
	this.title = title;
	
	}
	public void setAuthor(String author) {//set author method
		
		
		this.author = author;
	}
	public void setISBN( String ISBN) {//set ISBN method
		this.ISBN = ISBN;
		
	}
	public void setPrice(double price) { //set price method
		
		this.price = price;
	}
	/**
	 * test function that I use to print the whole book name
	 */
	public void bookPrint() {//bookprint method
	
		System.out.println(this.getTitle());
		System.out.println(this.getAuthor());
		System.out.println(this.getISBN());
		System.out.println(this.getPrice());
		
	}
	/**
	 * tst function I use to set the book variables
	 * @param Title
	 * @param Author
	 * @param ISBN
	 * @param Price
	 */
	public void setBook( String Title, String Author, String ISBN,double Price) {//set book method
	
		this.setTitle(Title);
		
		this.setAuthor( Author);
		
		this.setISBN(ISBN);
		
		this.setPrice(Price);
		
		
	
	}
	/**
	 * prints book information
	 */
	public String toString() {//string method
		
		return title +" by " + author + " (ISBN:"+ISBN +", "+price+")";
	}
	/**
	 * 
	 * @param Object
	 * boolean for comparing two book ISBNs
	 */
	public boolean equals(Object obj) {//equals boolean
		
		if(obj== null) {return false;
		
	}
		Book book = (Book) obj;
		
		if(this == obj)	{
			return true;
		}
		
		return this.ISBN.equals(book.ISBN);
	}
		
}