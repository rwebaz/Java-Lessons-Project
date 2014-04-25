package test;

/**
 * The 'TestShoeMaker' class is a 'main' method test that reports back to the console
 * ============================================================================================
 * After creating an instance of the 'ShoeMaker' class and passing argument(s)...
 * To the constructor of the 'ShoeMaker' class...
 * The program returns back to this 'TestJoeShoeMaker' class to print to the console...
 * the item 'name' of the product being sold.
 * ============================================================================================
 * Next, the program creates an instance of the 'SellerImplements' class and...
 * Passes argument(s) to the 'SellerImplements' class constructor.
 * ============================================================================================
 * After printing out a confirmation of both the 'ShoeMaker' class 'name' AND the instance of the...
 * 'SellerImplements' class 'itemName'...
 * ============================================================================================
 * The program creates an instance of the 'Products' class and...
 * Passes argument(s) to the 'Products' class constructor.
 * ============================================================================================
 * Next, the program creates couple of new instances of the 'ProductImplements' and...
 * Passes argument(s) to the parameters of the new 'productimplements' object
 * ============================================================================================
 * The program then calculates the average product price for the category and prints to...
 * The console a summation of the item information being sold.
 * ============================================================================================
 * Exits the program via the 'return' statement after printing a summation statement.
 * ============================================================================================
 * @author rwebaz http://about.me/rwebaz */

import seller.SellerImplements;
import seller.ShoeMaker;
import product.Product;
import product.ProductImplements;

public class TestShoeMaker {
	
	static String name;

	public static void main(String[] args) {
		
	// Test program Introduction

		System.out
			.println("==================================================================================");
		System.out
			.println("The 'Test New Package' (TNP) Program: Testing methods, arguments, and interfaces");
		System.out
			.println("==================================================================================");
		System.out
			.println("Test Number Two (revised: 04-24-14 | 'Joe the Shoe Maker' Declares A Category of Merchandise to Sell");
		System.out
			.println("====================================================================================================");

		/* Create a new instance of the ShoeMaker class named 'joeshoemaker' and...
		pass argument(s) to the parameters of the new 'joeshoemaker' object */

		ShoeMaker joeshoemaker = new ShoeMaker("Shoes");
		
		System.out.println("Category Name | 'Joe the Shoe Maker' wants to sell '"
				+ joeshoemaker.getName() + "'!");
		System.out
			.println("===========================================================");
		
		/* Create a new instance of the 'Seller' class named 'seller' and...
		pass argument(s) to the parameters of the new 'seller' object */
		
		SellerImplements sellerimplements = new SellerImplements("Joe Shoe Maker", "10009", 250_000);
		
		/* Create a new instance of the 'Product' class named 'product' and...
		pass argument(s) to the parameters of the new 'product' object */
		
		Product product = new Product("Shoes", 164.99);
	
		/* Create a couple of new instances of the 'ProductImplements' class named 'productimplements' and...
		pass argument(s) to the parameters of the new 'productimplements' object */
		
		ProductImplements productimplements1 = new ProductImplements("Womens fancy shoes", "10008", 179.99);
		
		ProductImplements productimplements2 = new ProductImplements("Mens fancy shoes", "10009", 149.99);
		
		// Calculate the average product price for the category
		
		System.out.println("Average Unit Price | The average price of " + joeshoemaker.getName() + " at '" + sellerimplements.getSellerName() + "'s store is $" + (productimplements1.getProductPrice() + productimplements2.getProductPrice())/2 + ".");
				
		System.out
			.println("=====================================================================================");
		
		// Print to the console a summation of the item information being sold
		
		productimplements1.getProductInfo();
		
		productimplements2.getProductInfo();
		
		System.out
			.println("The product category has been '" + product.getCategoryName() + "' and the average price per pair at '" + sellerimplements.getSellerName() + "'s store is $" + product.getItemPrice() + ".");
		
		System.out
			.println("===========================================================================================================");
		
		System.out.println("@author rwebaz http://about.me/rwebaz");
		
		return;
	}
}