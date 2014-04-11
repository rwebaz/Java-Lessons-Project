package buyer;

import product.Product;

public class BuyerImplements implements BuyerInterface {
	
	// This class implements the BuyerInterface
	
	// Declare the 'instance' variables accessible to the class
	
		protected Product productName;
		protected Product productId;
		protected Product productPrice;
		
		protected String buyerName;
		protected String buyerId;
		protected int buyerLimit;
		
		protected String itemName;
		protected Product itemProduct;
			
	// Create a constructor
		public BuyerImplements(String b_name, String b_id, int b_limit, Product product) {
			
		/* Rename the instance variables to accommodate constructor this and to...
		 * instantiate the variables as local within the method 'BuyerImplements' */
				
			productName = product;
			productId = product;
			productPrice = product;
			
			buyerName = b_name;
			buyerId = b_id;
			buyerLimit = b_limit;
	}
		
	public Product getProduct() {
		return null;
	}

	public boolean provideProduct(String productName) {
		return false;
	}

	public Product sellProduct() {
		return null;
	}
		
	// per contract w interface 'BuyerInterface'
	@Override
	public String getBuyerName() {
		return buyerName;
	}
	
	// per contract w interface 'BuyerInterface'
	@Override
	public String getBuyerId() {
		return buyerId;
	}
	
	// per contract w interface 'BuyerInterface'
	@Override
	public int getBuyerLimit() {
		return buyerLimit;
	}
}