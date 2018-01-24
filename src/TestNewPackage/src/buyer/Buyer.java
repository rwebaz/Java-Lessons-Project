package buyer;

import product.Product;

/**
 *  This interface describes a Buyer who wants to purchase some items.
 *	============================================================================================
 *  <p> Description: A buyer has a shopping list which is a collection of items that the buyer wishes to purchase.
 *  You the developer can add items to the shopping list.
 *  ============================================================================================
 *  A method is available to get a list of the shopping list items.
 *  A buyer also has a shopping cart which contains all the products they have purchased.
 *  ============================================================================================
 *  Each Buyer must be able to:
 *  </p>
 *  <ol>
 *  <li>Provide their collection of products they want to purchase</li>
 *  <li>Provide their name</li>
 *  <li>Provide the collection of products they have purchased</li>
 *  <li>Add a new product to their collection of purchased items</li>
 *  </ol>
 *  ============================================================================================
 *  Usage Example:
 *  ============================================================================================
 *  <pre>
 *		// Create a new Buyer
 *		Buyer buyer = ...
 *
 *		//  Add to the cart
 *		buyer.addItemToShoppingList("Bread");
 *
 *		//
 *		//  Get a list of shopping cart items
 *		//
 *		List&lt;Product&gt; items = buyer.getShoppingList();
 *  </pre>
 * @author Original: Laureate Development Team
 * ============================================================================================
 * @author Subsequent annotations and changes: rwebaz http://about.me/rwebaz */

public class Buyer {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables..
	 * And, as such can be used within the class.
	 * Thus, variables declared as 'class' variables are available class-wide. */
	
	// Class variables are identified as 'static' or 'protected' String(s), int(s), and double(s), not 'public'. */
	
	// Declare the class or 'instance' variables of the 'Buyer' class
	
		// The Buyer's name of each instance of the subject 'Buyer' class
			protected static String buyerName;
			
		// The ID number of each Buyer for each instance of the subject 'Buyer' class
			protected String buyerId;
			
		// The Limit bid of each Buyer for each instance of the subject 'Buyer' class
			protected int buyerLimit;
			
		// The type of each Buyer for each instance of the subject 'Buyer' class
			protected static String buyerType;
			
		// The pay of each Buyer for each instance of the subject 'Buyer' class
			protected String pay;
			
			
		//
			
			
	// Create the primary constructor for all future instances of the Buyer class
			
			public Buyer(String b_name, String b_type) {
				
			/* Rename the class variables to accommodate constructor this and to...
			instantiate the variables as 'local' variables of the constructor method Seller */
					
			buyerName = b_name;
			buyerType = b_type;

			}
			
			// Buyer buyer = Buyer(buyerName, buyerType);
	
	// Other methods
		
	/* Note: Variable(s) declared within methods are deemed 'local' variable(s) and as such...
	 * can only be used by their parent method. */
			
	// Declare the method or 'local' variables of the 'Buyer' class within their respective methods
			
			// Declare the getter methods of the 'Buyer' class

			// Give other methods the right to 'read from' or 'get' the variable 'buyerName' from the Buyer class
			public String getBuyerName() {
				return buyerName;
			}
			
			// Give other methods the right to 'read from' or 'get' the variable 'buyerName' from the Buyer class
			public String getBuyerType() {
				return buyerType;
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
				Buyer.buyerName = buyerName;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'buyerName' from the Buyer class
			public void setBuyerType(String buyerType) {
				Buyer.buyerType = buyerType;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'buyerId' from the Buyer class
			public void setBuyerId(String buyerId) {
				this.buyerId = buyerId;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'buyerLimit' from the Buyer class
			public void setBuyerLimit(int buyerLimit) {
				this.buyerLimit = buyerLimit;
			}

			public Object getShoppingList() {
				// TODO Auto-generated method stub
				return null;
			}

			public void payForItem(Product theProduct) {
				// TODO Auto-generated method stub
				
			}

			public void addItemToShoppingList(String string) {
				// TODO Auto-generated method stub
				
			}
}


 
