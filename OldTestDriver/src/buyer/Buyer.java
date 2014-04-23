package buyer;

public class Buyer {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables and as such...
	 * can be used within the class. Thus, variables declared as 'class' variables are available class-wide. */
	
	// Class variables are identified as 'static' or 'protected' String(s), int(s), and double(s), not 'public'. */
	
	// Declare the class or 'instance' variables of the 'Buyer' class
	
		// The Buyer's name of each instance of the subject 'Buyer' class
			protected String buyerName;
			
		// The ID number of each Buyer for each instance of the subject 'Buyer' class
			protected String buyerId;
			
		// The Limit bid of each Buyer for each instance of the subject 'Buyer' class
			protected int buyerLimit;
			
	// Create the constructor for all future instances of the Buyer class
			
			public Buyer(String b_name, String b_id, int b_limit) {
			
			/* Rename the class variables to accommodate constructor 'this' and to...
				instantiate the variables as 'local' variables of the constructor method Buyer */
				
			buyerName = b_name;
			buyerId = b_id;
			buyerLimit = b_limit;
		}
			
	/* Note: Variable(s) declared within methods are deemed 'local' variable(s) and as such...
	 * can only be used by their parent method. */
			
	// Declare the method or 'local' variables of the 'Buyer' class within their respective methods
			
			// Declare the getter methods of the 'Buyer' class
			
			// Give other methods the right to 'read from' or 'get' the variable 'buyerName' from the Buyer class
			public String getBuyerName() {
				return buyerName;
			}
			
			// Give other methods the right to 'read from' or 'get' the variable 'buyerId' from the Buyer class
			public String getBuyerId() {
				return buyerId;
			}
			
			// Give other methods the right to 'read from' or 'get' the variable 'buyerLimit' from the Buyer class
			public int getBuyerLimit() {
				return buyerLimit;
			}
			
			// Declare the setter methods of the 'Buyer' class
			
			// Give other methods the right to 'write to' or 'set' the variable 'buyerName' from the Buyer class
			public void setBuyerName(String buyerName) {
				this.buyerName = buyerName;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'buyerId' from the Buyer class
			public void setBuyerId(String buyerId) {
				this.buyerId = buyerId;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'buyerLimit' from the Buyer class
			public void setBuyerLimit(int buyerLimit) {
				this.buyerLimit = buyerLimit;
			}
}
