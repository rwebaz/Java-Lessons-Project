package seller;

import product.Product_class_old;

public class SellerImpl_old extends Seller_class_old implements Seller_interface_old {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables.
	 * And, as such can be used within the class. Thus, variables declared as 'class' variables are available class-wide. */
	
	// Class variables are identified as 'static' String(s), int(s), and double(s), not 'public'. */
	
	// Declare the class or 'instance' variables of the 'SellerImpl_old' class
	
		protected String name;
		protected Product_class_old product;

	// TODO: Complete this constructor
	
	public SellerImpl_old(String name, Product_class_old product) {
		super(sellerName, sellerId, sellerLimit);
		/* Rename the instance variables to accommodate constructor this and to...
		 * instantiate the variables as local within the method 'SellerImplements' */

	}

	// TODO: Complete these methods 
	public String getName() {
		return name;
	}

	public Product_class_old getProduct() {
		return null;
	}

	public boolean provideProduct(String productName) {
		return false;
	}

	public Product_class_old sellProduct() {
		return product;
	}
}