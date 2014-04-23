package test;

import seller.SellerImplements;

/**
 * ShoeMaker class overrides SellerImplements
 * ShoeMaker is a seller that sells Shoes.
 * @param name - The parameter 'name' of the ShoeMaker
 * @author Deny Morlino */

public class ShoeMaker extends SellerImplements {
	
	static String product;
	
	// Create a new constructor method here that overrides the constructor method from SellerImplements

	public ShoeMaker(String name) {
		super(sellerName, sellerId, sellerLimit, productName, productId, productPrice);
		System.out.println("Joe the Shoe Maker wants to override with " + name + "!");
		product = name;
	}
	
	// Give other methods the right to 'read from' or 'get' the parameter 'name' from the JoeShoeMaker class
	public String getName() {
		return product;
	}
}
