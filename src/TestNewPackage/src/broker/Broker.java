package broker;

/**
 * The Broker class serves as a Product broker for Buyers. The Buyers register with 
 * the Broker. The Broker then attempts to locate a Seller who can provide the 
 * items that the Buyers are looking for.
 * Once the Broker has located a Seller with the item a Buyer is looking for, the 
 * Broker then arranges the sale of that item.
 *  
 * @author Laureate Development Team
 */

import seller.Seller;

import java.util.ArrayList;
import java.util.List;

/**
 * The 'Broker' class is a new class, primarily to create instances of broker objects
 * ============================================================================================
 * @param 1s.) String name - An object string parameter derived from the original (old)...
 * 'SellerInterface_old' class, now equal to the variable 'categoryName'
 * ============================================================================================
 * @param 2s.) Product product - An object product parameter derived from the original (old)...
 * 'SellerInterface_old' class, now equal to the variable 'itemProduct'
 * ============================================================================================
 * @author rwebaz http://about.me/rwebaz */

public class Broker {
	
		/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables.
		 * And, as such can be used within the class. Thus, variables declared as 'class' variables...
		 * Are available class-wide. */
		
		/* Note: Class variables can be identified (through their 'access modifiers')...
		 * As 'static' String(s), int(s), and double(s), but not as 'public'. */
		
		// The 'instance' variables for the new 'Broker' class
	
	// Other methods
	
		//The list of registered Sellers.
	 
			private List<Seller> sellers = new ArrayList<Seller>();
	
			// Register a Seller with the Broker.
			// @param seller - the Seller
	 
			public void addSeller(Seller seller) {
				sellers.add(seller);
			}
	
			// Register a Buyer with the Broker.
			// @param buyer - the Buyer
			 
			// public void addBuyer(Buyer buyer) {
			// buyers.add(buyer);
			// }			
	
			// Display the list of registered Sellers
	 
			public void displaySellers() {
				
				System.out.println();
				System.out.println("The sellers:");
				
				for (Seller seller : sellers) {
					System.out.println(seller.toString());
				}
				
				System.out.println(""); 
			}
			
			
}