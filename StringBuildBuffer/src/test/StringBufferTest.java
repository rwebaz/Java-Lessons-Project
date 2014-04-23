package test;

import java.lang.StringBuffer;

public class StringBufferTest {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables and as such...
	 * can be used within the class. Thus, variables declared as 'class' variables are available class-wide. */
	
	// Class variables are identified as 'static' or 'protected' String(s), int(s), and double(s), not 'public'. */
	
	// Declare the class or 'instance' variables of the 'Buyer' class
	
	// Declare a string-block 'x, y, z'
	
		static String x;
		static String y;
		static String z;

	public static void main(String[] args) {
		
		// Java includes a built-in class named 'StringBuffer'
		// The class 'StringBuffer' has methods that allow the programmer to build long strings and to append block by block
		
		// The introduction to the program
		System.out.println("=================================================================================================");
		System.out.println("This program will now test the building of a long string using the built-in 'StringBuffer' class.");
		System.out.println("=================================================================================================");
		
		// Create a new Object instance of the StringBuffer class named 'buffer'
		StringBuffer buffer = new StringBuffer();
		
		// Instantiate the declared string-block class variable 'x'
		x = "Let's talk about you baby, let's talk about you and me, let's talk about all the things";
		
		// Add the string 'x' to the buffer
		buffer.append(x);
		
		// Convert the buffer to a string
		buffer.toString();
		
		// Print out the current contents of the buffer to the console
		System.out.println(buffer);
		System.out.println("=================================================================================================");
		
		// Instantiate the declared string-block class variable 'y'
		y = "...";
		
		// Insert the string 'y' after length value (9) of current string buffer
		buffer.insert(10,y);
		
		// Append the string 'y' to the end of the buffer
		buffer.append(y);
		
		// Convert the buffer to a string
		buffer.toString();
		
		// Print out the current contents of the buffer to the console
		System.out.println(buffer);
		System.out.println("=================================================================================================");
		
		// Instantiate the declared string-block class variable 'z'
		z = "and, this represents a string-block that can be appended to an existing string to make it an even longer string.";
		
		// Append the string 'z' to the end of the buffer
		buffer.append(z);
		
		// Convert the buffer to a string
		buffer.toString();
		
		// Print out the current contents of the buffer to the console
		System.out.println(buffer);
		System.out.println("=================================================================================================");
		
	}
}