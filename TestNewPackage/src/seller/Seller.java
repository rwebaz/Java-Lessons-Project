package seller;

import product.Product;

/**
 * The 'Seller' class is a re-write of the given (old) 'SellerInterface_old' class
 * ============================================================================================
 * @param 1s.) String name - An object string parameter derived from the original (old)...
 * 'SellerInterface_old' class, now equal to the variable 'categoryName'
 * ============================================================================================
 * @param 2s.) Product product - An object product parameter derived from the original (old)...
 * 'SellerInterface_old' class, now equal to the variable 'itemProduct'
 * ============================================================================================
 * @author rwebaz http://about.me/rwebaz */

public class Seller {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables.
	 * And, as such can be used within the class.
	 * Thus, variables declared as 'class' variables are available class-wide. */
	
	// Note: Class variables can be identified as 'static' String(s), int(s), and double(s), not 'public'. */
	
	// The original 'instance' variables form the (old) 'SellerImpl' class
	
			protected static String name;
			protected static Product product;
			
		// A re-naming of the original 'instance' variables form the (old) 'SellerImpl' class
			
			protected static String categoryName;
			protected static Product itemProduct;
			
	// Create the primary constructor for the 'Seller' class
			
			public Seller(String name, Product product) {
			
			/* Rename the class variables to accommodate constructor this and to...
				instantiate the variables as 'local' variables of the constructor method Seller */
				
				categoryName = name;
				itemProduct = product;
			
		}
			
	/* Note: Variable(s) declared within methods are deemed 'local' variable(s) and as such...
	 * can only be used by their parent method. */
			
	// Declare other methods

			public void provideProduct() {
				// TODO Auto-generated method stub
				
			}

			public void sellProduct() {
				// TODO Auto-generated method stub
				
			}
}