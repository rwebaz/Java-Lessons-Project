package library;

import java.util.ArrayList;

public class Book {
	
	/* Note: Variables declared within methods are deemed 'local' variables.
	 * Note: Variables declared outside of methods are deemed to be 'instance' variables
	 * =================================================================================
	 * Note: Variables declared as 'class' variables are available class-wide.
	 * Note: Class variables are identified as 'static' String(s), int(s), and double(s), not 'public'.
	 */
	
	// Declare the class variables of the 'Book' class
	
		// The title of each instance of the subject 'Book' class
			static String title;
		
		// The author name of each instance of the subject 'Book' class
			static String author;
			
		// The ISBN number of each instance of the subject 'Book' class
			static String isbn;
			
		// The price of each instance of the subject 'Book' class
			static double price;
			
	// Declare the getter methods of the 'Book' class
			
		/* Give other methods the right to 'read from' or 'get'
		 * the variable 'title' from the Book class
		 */
			public String getTitle(String title) {	
				return title;
		}
			
		/* Give other methods the right to 'read from' or 'get'
		 * the variable 'author' from the Book class
		 */
			public String getAuthor(String author) {	
				return author;
		}
				
		/* Give other methods the right to 'read from' or 'get'
		 * the variable 'isbn' from the Book class
		 */
			public String getIsbn(String isbn) {	
				return isbn;
		}
			
		/* Give other methods the right to 'read from' or 'get'
		 * the variable 'price' from the Book class
		 */
			public double getPrice(double price) {	
				return price;
		}

	// Declare the setter methods of the 'Book' class
			
		/* Give other methods the right to 'write to' or 'set'
		 * the variable 'title' from the Book class
		 */
			public String setTitle(String title) {
				
			//write progress to the console
			System.out.println("The String variable 'title' has been initialized to: " + title);
				
			//return a String
			return title;
		}
			
		/* Give other methods the right to 'write to' or 'set'
		 * the variable 'author' from the Book class
		 */
			public String setAuthor(String author) {
					
			//write progress to the console
			System.out.println("The String variable 'author' has been initialized to: " + author);
					
			//return a String
			return author;
		}
			
		/* Give other methods the right to 'write to' or 'set'
		 * the variable 'isbn' from the Book class
		 */
			public String setIsbn(String isbn) {
						
			//write progress to the console
			System.out.println("The String variable 'isbn' has been initialized to: " + isbn);
						
			//return a String
			return isbn;
		}
			
		/* Give other methods the right to 'write to' or 'set'
		 * the variable 'price' from the Book class
		 */
			public double setPrice(double price) {
						
			//write progress to the console
			System.out.println("The double variable 'price' has been initialized to: $" + price + "USD");
						
			//return a double
			return price;
		}
	
	// Declare the Object arrays 'booksArrayData' for string data and 'booksArrayPrice' for double integer data
	 
			String[][] booksArrayData;
			
			double[] booksArrayPrice;
	
	// Declare the Object ArrayList 'booksList' for both string data and double integer data
			
			public ArrayList<Book> booksList;
	
	// Declare the other methods of the 'Book' class
		
		// Establish the 'Book' constructor method to return the title, author, isbn, and price of a new book instance(s)
			public Book(String title, String author, String isbn, double price) {
				return;
		}
		
		// Establish the 'whatBook' other method to return the title, author, isbn, and price of a new book instance
			public String whatBook() {
				
				System.out.println("=================================================");
				// Write progress to the console
				System.out.println("" + title + ", a book by " + author + " has an ISBN number of " + isbn + ".");
				System.out.println("The price of " + title + " is $" + price + " USD.");
				
					return title + author + isbn;
		}
		
//		// Establish the 'printArrayTitleAuthor' other method to return the title and author of each book instance
//			public void printArrayTitleAuthor(String[][] booksArrayData) {
//				for (int i = 0; i < booksArrayData.length; i++) {
//					// Write progress to the console
//					System.out.println("" + title + ", a book by " + author + ".");
//					System.out.println("=================================================");
//					return;
//				}
//		}
//			
//		// Establish the 'printArrayListTitleAuthor' other method to return the title and author of each book instance
//			public void printArrayListTitleAuthor(String[][] booksArrayData) {
//				for(int row = 0; row < booksArrayData.length; row++) {
//					for (int column = 0; column < booksArrayData[row].length; column++ );
//						System.out.println();
//				}
			
		// Set up an over-ride to require String representation for each of the four class variables
			
			@Override
			   public String toString() {
			        return ("Title of Book:"+this.getTitle(title))+
			                    " Author: "+ this.getAuthor(author) +
			                    " ISBN: "+ this.getIsbn(isbn) +
			                    " Price : " + this.getPrice(price);
		}
}
