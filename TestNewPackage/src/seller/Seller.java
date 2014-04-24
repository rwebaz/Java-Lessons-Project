package seller;

/**
* @param 1s.) String s_name - An object string parameter derived from the re-written Seller class that represents...
* any given seller's name, now equal to the variable 'sellerName'
* @param 2s.) String s_id - A object string parameter derived from the re-written Seller class that represents...
* any given seller's identification schematic, now equal to the variable 'sellerId'
* @param 3s.) int s_limit - A primitive integer parameter (4-bytes = 32 bits) derived from...
* the re-written Seller class that represents any given seller's assigned credit or gross dollar bid limit,
* now equal to the variable 'sellerLimit' */

public class Seller {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables.
	 * And, as such can be used within the class.
	 * Thus, variables declared as 'class' variables are available class-wide. */
	
	// Note: Class variables can be identified as 'static' String(s), int(s), and double(s), not 'public'. */
	
	// Declare the class or 'instance' variables of the 'Seller' class
	
		// The Seller's name of each instance of the subject 'Seller' class
			protected static String sellerName;
			
		// The ID number of each Seller for each instance of the subject 'Seller' class
			protected static String sellerId;
			
		// The ID number of each Seller for each instance of the subject 'Seller' class
			protected static int sellerLimit;
			
	// Create the primary constructor for all future instances of the Seller class
			
			public Seller(String s_name, String s_id, int s_limit) {
			
			/* Rename the class variables to accommodate constructor this and to...
				instantiate the variables as 'local' variables of the constructor method Seller */
				
			sellerName = s_name;
			sellerId = s_id;
			sellerLimit = s_limit;
			
		}
			
	/* Note: Variable(s) declared within methods are deemed 'local' variable(s) and as such...
	 * can only be used by their parent method. */
			
	// Declare the getter methods of the 'Seller' class

			// Give other methods the right to 'read from' or 'get' the variable 'sellerName' from the Seller class
			public String getSellerName() {
				return sellerName;
			}
			
			// Give other methods the right to 'read from' or 'get' the variable 'sellerId' from the Seller class
			public String getSellerId() {
				return sellerId;
			}
			
			// Give other methods the right to 'read from' or 'get' the variable 'sellerId' from the Seller class
			public int getSellerLimit() {
				return sellerLimit;
			}
			
	// Declare the setter methods of the 'Seller' class
			
			// Give other methods the right to 'write to' or 'set' the variable 'sellerName' from the Seller class
			public void setSellerName(String sellerName) {
				Seller.sellerName = sellerName;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'sellerId' from the Seller class
			public void setSellerId(String sellerId) {
				Seller.sellerId = sellerId;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'sellerLimit' from the Seller class
			public void setSellerLimit(int sellerLimit) {
				Seller.sellerLimit = sellerLimit;
			}
			
	// Declare other methods

			public void getProductName() {
				// TODO Auto-generated method stub
				
			}

			public void provideProduct() {
				// TODO Auto-generated method stub
				
			}

			public void sellProduct() {
				// TODO Auto-generated method stub
				
			}
}
