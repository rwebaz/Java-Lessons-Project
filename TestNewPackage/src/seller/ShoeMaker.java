package seller;

/**
 * The 'ShoeMaker' class extends and overrides the 'Seller' class
 * ================================================================================
 * 'Joe the Shoe Maker' is a merchandise seller who specializes in the category of 'Shoes'.
 * ================================================================================
 * Per original @author Deny Morlino the @param name (the parameter 'name') of the ShoeMaker class...
 * Is also the 'product' name
 * ================================================================================
 * However, this author chooses to change the @param name to be...
 * The 'product' category
 * ================================================================================
 * This way, when a seller comes knocking, the seller must declare the category they wish to trade...
 * in either as a buyer or a seller.
 * ================================================================================
 * @author rwebaz http://about.me/rwebaz */

public class ShoeMaker extends Seller {
	
	static String category;
	
	// Create a new constructor method here that overrides the constructor method from the class 'Seller'

	public ShoeMaker(String name) {
		super(categoryName, itemProduct);
		
		System.out.println("Seller/Buyer Chooses A Product Category | Joe the Shoe Maker wants to override the 'Seller' class with '" + name + "'!");
		System.out.println("================================================================================================================");
		
		category = name;
	}
	
	// Give other methods the right to 'read from' or 'get' the parameter 'name' from the JoeShoeMaker class
	public String getName() {
		return category;
	}
}
