package buyer;

import product.Product_class_old;

public class BuyerImplements implements BuyerInterface {
	
	// This class implements the BuyerInterface
	
	// Declare the 'instance' variables accessible to the class
	
		protected Product_class_old productName;
		protected Product_class_old productId;
		protected Product_class_old productPrice;
		
		protected String buyerName;
		protected String buyerId;
		protected int buyerLimit;
		
		protected String itemName;
		protected Product_class_old itemProduct;
			
	// Create a constructor
		public BuyerImplements(String b_name, String b_id, int b_limit, Product_class_old product) {
			
		/* Rename the instance variables to accommodate constructor this and to...
		 * instantiate the variables as local within the method 'BuyerImplements' */
				
			this.productName = product;
			this.productId = product;
			this.productPrice = product;
			
			productName = product;
			productId = product;
			productPrice = product;
			
			this.buyerName = b_name;
			this.buyerId = b_id;
			this.buyerLimit = b_limit;
			
			buyerName = b_name;
			buyerId = b_id;
			buyerLimit = b_limit;
	}
		
	public Product_class_old getProduct() {
		
		
		
		return null;
	}
	
	public void getBuyer() {
		System.out.println("The new Buyer's name is " + this.getBuyerName() +
				"; Seller ID: " + this.getBuyerId() +
				"; USD Limit: $" + this.getBuyerLimit() + ".");
		System.out.println("==================================================================================================");
	}

	public boolean provideProduct(String productName) {
		return false;
	}

	public Product_class_old sellProduct() {
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