package seller;

/**
 * The 'SellerImplements' class is a re-write of the given (old) 'SellerImpl' class
 * @param 1si.) String name - An object string parameter derived from the original (old) 'SellerImpl' class,
 * now equal to the variable 'itemName'
 * @param 2si.) Product product - An object product parameter derived from the original (old) 'SellerImpl' class,
 * now equal to the variable 'itemProduct'
 * @author rwebaz http://about.me/rwebaz */

import product.Product;

public class SellerImplements extends Seller implements SellerInterface {
	
	// This class implements the SellerInterface
		
	// The original 'instance' variables form the (old) 'SellerImpl' class
		
		protected static String name;
		protected static Product product;
		
	// A re-naming of the original 'instance' variables form the (old) 'SellerImpl' class
		
		protected static String itemName;
		protected static Product itemProduct;
		
	// Create a primary constructor
		
		public SellerImplements(String name, Product product) {
			super(sellerName, sellerId, sellerLimit);
			
		/* Rename the instance variables of the 'SellerImplements' secondary constructor method...
		 * To accommodate keyword 'this' and to...
		 * Instantiate the variables as local within the primary constructor method 'SellerImplements' */
			
			itemName = name;
			itemProduct = product;

		}
		
	
		
			
	// A new method
	
	public void getSeller() {
		System.out.println("The new Seller's name is " + this.getSellerName() +
				"; Seller ID: " + this.getSellerId() +
				"; USD Limit: $" + this.getSellerLimit() + ".");
		System.out.println("===============================================================================");
	}
	
	
	// per contract w interface 'SellerInterface'
	@Override
	public String getSellerName() {
		return this.getSellerName();
		//more to come;
	}
	
	// per contract w interface 'SellerInterface'
	@Override
	public String getSellerId() {
		return this.getSellerId();
	}
	
	// per contract w interface 'SellerInterface'
	@Override
	public int getSellerLimit() {
		return this.getSellerLimit();
	}
}