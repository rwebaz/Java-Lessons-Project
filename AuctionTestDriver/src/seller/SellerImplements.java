package seller;

import product.Product;

public class SellerImplements implements SellerInterface {
	
	// This class implements the SellerInterface
	
	// Declare the 'instance' variables accessible to the class
	
		protected Product productName;
		protected Product productId;
		protected Product productPrice;
		
		protected String sellerName;
		protected String sellerId;
		protected int sellerLimit;
		
		protected String itemName;
		protected Product itemProduct;
		
	// Create a constructor
		
		public SellerImplements(String s_name, String s_id, int s_limit, Product product) {
		
		/* Rename the instance variables to accommodate constructor this and to...
		 * instantiate the variables as local within the method 'SellerImplements' */
			
			productName = product;
			productId = product;
			productPrice = product;
			
			sellerName = s_name;
			sellerId = s_id;
			sellerLimit = s_limit;
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
	
	// per contract w interface 'SellerInterface'
	@Override
	public String getSellerName() {
		return sellerName;
	}
	
	// per contract w interface 'SellerInterface'
	@Override
	public String getSellerId() {
		return sellerId;
	}
	
	// per contract w interface 'SellerInterface'
	@Override
	public int getSellerLimit() {
		return sellerLimit;
	}
}