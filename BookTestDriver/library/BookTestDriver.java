package library;

import java.util.ArrayList;

// import java.util.ArrayList;

public class BookTestDriver {
			
	public static void main(String[] args) {
		
		// Write introduction to the console
		
		System.out.println("Begin");
		System.out.println("===========================");
		System.out.println("The programmer will now attempt to print a statement that includes all pertinent variables for each instance (3) of the Book class.");
		System.out.println("Notice how the String data (title, author) and the double integer data (price) are segregated into two separate arrays.");
		
		// Instantiate a new Object ArrayList 'booksList' to hold both string data and double integer data
		
			ArrayList<Book> booksList = new ArrayList<Book>();
		
		// Create a new Object named 'newBook1' from the Book class
				Book newBook1 = new Book("Java: How to program (9th ed)", "Deitel, P. J., & Deitel, H. M.", "978-0-13-257566-9", 32.50);
		
		// Write progress for 'newBook1' to the console via the 'whatBook' method of the 'Book' class
				
				newBook1.whatBook();
				
		// Add the Object 'newBook1' to the booksList ArrayList
				
				booksList.add(newBook1);
				
		// Create a new Object named 'newBook2' from the Book class
				Book newBook2 = new Book("Head first Java | A brain friendly guide (2nd ed)", "Sierra, K., & Bates, B.", "978-0-596-00920-5", 25.50);
		
		// Write progress for 'newBook2' to the console via the 'whatBook' method of the 'Book' class
				
				newBook2.whatBook();
				
		// Add the Object 'newBook2' to the booksList ArrayList
				
				booksList.add(newBook2);
	
		// Create a new Object named 'newBook3' from the Book class
				Book newBook3 = new Book("Sam's Teach Yourself Java 6 in 21 days (5th ed)", "Cadenhead, R., & Lemay, L.", "978-0-672-32943-2", 37.50);
		
		// Write progress for 'newBook3' to the console via the 'whatBook' method of the 'Book' class
				
				newBook3.whatBook();
				
		// Add the Object 'newBook3' to the booksList ArrayList
				
				booksList.add(newBook3);
				
		// Instantiate the declared Object String array named 'booksArrayData' from the Book class
				
				String[][] booksArrayData = new String[3][3];
				
				booksArrayData[0][0] = "Java: How to program (9th ed)";
				booksArrayData[0][1] = "Head first Java: A brain friendly guide (2nd ed)";
				booksArrayData[0][2] = "Sam's Teach Yourself Java 6 in 21 days (5th ed)";
				
				booksArrayData[1][0] = "Deitel, P. J., & Deitel, H. M.";
				booksArrayData[1][1] = "Sierra, K., & Bates, B.";
				booksArrayData[1][2] = "Cadenhead, R., & Lemay, L.";
				
				booksArrayData[2][0] = "978-0-13-257566-9";
				booksArrayData[2][1] = "978-0-596-00920-5";
				booksArrayData[2][2] = "978-0-672-32943-2";
			
		// Instantiate the declared Object double array named 'booksArrayPrice' from the Book class
				double[] booksArrayPrice = new double[3];
				booksArrayPrice[0] = 32.50;
				booksArrayPrice[1] = 25.50;
				booksArrayPrice[2] = 37.50;
		
//		// Write progress for 'newBook1, newBook2, newBook3' to the console via the 'printTitleAuthor' method of the 'Book' class	
//				newBook1.printArrayTitleAuthor(booksArrayData);
//				newBook2.printArrayTitleAuthor(booksArrayData);
//				newBook3.printArrayTitleAuthor(booksArrayData);
//				
//				newBook1.printArrayListTitleAuthor(booksArrayData);
//				newBook2.printArrayListTitleAuthor(booksArrayData);
//				newBook3.printArrayListTitleAuthor(booksArrayData);
				
		// Set up a counter for loop to iterate through the entire array and print out each element
				
				System.out.println("==================================================================================================");
				System.out.println("The programmer will now print the titles to the three books on the first line separated by a pipe from the Array 'booksArrayData.");
				System.out.println("Next, the titles to the three respective authors of the three books will print on the second line separated by a pipe also from the Array 'booksArrayData'.");
				System.out.println("And, thirdly, the corresponding ISBN numbers will print on the third line also separated by a pipe, also from the Array 'booksArrayData'.");
				System.out.println("==================================================================================================");
				
				for ( int i = 0; i < 3; i++) {
					
					for ( int j = 0; j < 3; j++) {
								
						System.out.print(booksArrayData[i][j] + " | ");
					}
					System.out.println("");
				}
				
				System.out.println("==================================================================================================");
				
		// Set up an enhanced 'for' loop to iterate through the titles of the books
				
				System.out.println("Here, the programmer will print the titles to the three books separately");
				System.out.println("=================================================");
				
				for( String temp1 : booksArrayData[0] ) {
						System.out.println( temp1 );
				}
						
				System.out.println("=================================================");
						
					
		// Set up an enhanced 'for' loop to iterate through the names of the authors
				
				System.out.println("Here, the programmer will print the authors to the three books separately");
				System.out.println("=================================================");
				
				for( String temp2 : booksArrayData[1] ) {
					System.out.println( temp2 );
				}
				
				System.out.println("===========================");
				
		// Write the elements of the ArrayList 'bookList' to the console
				
				// Establish a for loop to iterate through the elements of the ArraysList 'bookList' method
				System.out.println("Here, the programmer will attempt to print to the console the Object references (both the type and hashcode)");
				System.out.println(" or, the elements to the size three books from the ArrayList 'booksList' separated each by a pipe.");
				System.out.println("=================================================");
				
					int y = booksList.size();
					
					System.out.printf("Size: %s\n", y);
					
					for(int i = 0; i < y; i++) {
						System.out.printf(" %s", booksList.get(i) + " | ");
						System.out.println("");
					}
					
				System.out.println("=================================================");
					
				System.out.println("Here, the programmer will iterate through the ArraysList 'booksList' to print to the console the elements of each book.");
				System.out.println("=================================================");
					
				// Invoke the overridden `toString()` method from the Book class
				
					for(Book book: booksList) {
					    System.out.println(book);  
					}
	}		
}