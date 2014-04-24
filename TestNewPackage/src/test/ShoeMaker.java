package test;

/**
 * ShoeMaker class overrides Seller
 * ShoeMaker is a seller that sells Shoes.
 * @param name - The parameter 'name' of the ShoeMaker class is the 'product' name
 * @author Deny Morlino */

import seller.Seller;

public class ShoeMaker extends Seller {
	
	static String product;
	
	// Create a new constructor method here that overrides the constructor method from SellerImplements

	public ShoeMaker(String name) {
		super(sellerName, sellerId, sellerLimit);
		System.out.println("1a) Joe the Shoe Maker wants to override with '" + name + "'!");
		product = name;
	}
	
	// Give other methods the right to 'read from' or 'get' the parameter 'name' from the JoeShoeMaker class
	public String getName() {
		return product;
	}
}
