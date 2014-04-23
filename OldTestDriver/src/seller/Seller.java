package seller;

import product.Product_old;

public class Seller {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables and as such...
	 * can be used within the class. Therefore, variables declared as 'class' variables are available class-wide.
	 * Class variables are identified as 'static' String(s), int(s), and double(s), not 'public'. */
	
	// Declare the class or 'instance' variables of the 'Seller' class
	
		// The Seller's name of each instance of the subject 'Seller' class
			protected String sellerName;
			
		// The ID number of each Seller for each instance of the subject 'Seller' class
			protected String sellerId;
			
		// The ID number of each Seller for each instance of the subject 'Seller' class
			protected int sellerLimit;
			
	// Create the constructor for all future instances of the Seller class
			
			public Seller(String s_name, String s_id, int s_limit) {
				
				
			
			/* Rename the class variables to accommodate constructor this and to...
				instantiate the variables as 'local' variables of the constructor method Seller */
				
			sellerName = s_name;
			sellerId = s_id;
			sellerLimit = s_limit;
		}
			
	/* Note: Variable(s) declared within methods are deemed 'local' variable(s) and as such...
	 * can only be used by their parent method. */
			
	// Declare the method or 'local' variables of the 'Seller' class within their respective methods
			
			// Declare the getter methods of the 'Seller' class
			
			public Seller(String string, Product_old product_old) {
				// TODO Auto-generated constructor stub
			}

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
				this.sellerName = sellerName;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'sellerId' from the Seller class
			public void setSellerId(String sellerId) {
				this.sellerId = sellerId;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'sellerLimit' from the Seller class
			public void setSellerLimit(int sellerLimit) {
				this.sellerLimit = sellerLimit;
			}

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