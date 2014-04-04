package library;

// import java.util.ArrayList;

public class BookTestDriver {
	
	public static void main(String[] args) {
		
		// Create a new Object named 'newBook1' from the Book class
				Book newBook1 = new Book("Java: How to program (9th ed)", "Deitel, P. J., & Deitel, H. M.", "978-0-13-257566-9", 32.50);
				
		// Write progress for 'newBook1' to the console via the 'whatBook' method of the 'Book' class
		
				newBook1.whatBook();
	
		// Create a new Object named 'newBook2' from the Book class
				Book newBook2 = new Book("Head first Java | A brain friendly guide (2nd ed)", "Sierra, K., & Bates, B.", "978-0-596-00920-5", 25.50);
		
		// Write progress for 'newBook2' to the console via the 'whatBook' method of the 'Book' class
				
				newBook2.whatBook();
	
		// Create a new Object named 'newBook3' from the Book class
				Book newBook3 = new Book("Sam's Teach Yourself Java 6 in 21 days (5th ed)", "Cadenhead, R., & Lemay, L.", "978-0-672-32943-2", 37.50);
		
		// Write progress for 'newBook3' to the console via the 'whatBook' method of the 'Book' class
				
				newBook3.whatBook();
		
		// Instantiate the declared Object String array named 'booksArrayData' from the Book class
				
				String[][] booksArrayData = new String[3][3];
				
				booksArrayData[0][0] = "Java: How to program (9th ed)";
				booksArrayData[0][1] = "Head first Java | A brain friendly guide (2nd ed)";
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
		
		// Write progress for 'newBook1, newBook2, newBook3' to the console via the 'printTitleAuthor' method of the 'Book' class	
				newBook1.printArrayTitleAuthor(booksArrayData);
				newBook2.printArrayTitleAuthor(booksArrayData);
				newBook3.printArrayTitleAuthor(booksArrayData);
				
				newBook1.printArrayListTitleAuthor(booksArrayData);
				newBook2.printArrayListTitleAuthor(booksArrayData);
				newBook3.printArrayListTitleAuthor(booksArrayData);
				
		}
}