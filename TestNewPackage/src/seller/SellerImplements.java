package seller;

import product.Product;

public class SellerImplements implements SellerInterface {
	
	// This class implements the SellerInterface
	
	// Declare the 'instance' variables accessible to the class
	
		protected static String productName;
		protected static String productId;
		protected static double productPrice;
		
		protected static String sellerName;
		protected static String sellerId;
		protected static int sellerLimit;
		
		protected static String itemName;
		protected static Product itemProduct;
		
	// Create a constructor
		
		public SellerImplements(String s_name, String s_id, int s_limit, String p_name, String p_id, double p_price) {
		
		/* Rename the instance variables to accommodate constructor this and to...
		 * instantiate the variables as local within the method 'SellerImplements' */
			
			productName = p_name;
			productId = p_id;
			productPrice = p_price;
			
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