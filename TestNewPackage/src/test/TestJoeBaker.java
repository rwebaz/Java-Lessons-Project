package test;

/**
 * The 'TestJoeBaker' class is a 'main' method test that reports back to the console
 * ============================================================================================
 * After creating an instance of the 'JoeBaker' class and passing argument(s)...
 * To the constructor of the 'JoeBaker' class...
 * The program returns back to this 'TestJoeBaker' class to print to the console...
 * the item 'name' of the product being sold.
 * ============================================================================================
 * Next, the program creates an instance of the 'Product' class and...
 * Passes argument(s) to the 'Product' class constructor.
 * ============================================================================================
 * After printing out a confirmation of both the 'JoeBaker' class 'name' AND the instance of the...
 * 'Product' class 'itemName'...
 * ============================================================================================
 * The program executes the elusive 'getProduct' (info) method in order to return the parameters of...
 * The 'Product' class to the console for the new instance of 'breadproduct' and then...
 * ============================================================================================
 * Exits the program via the 'return' statement.
 * ============================================================================================
 * @author rwebaz http://about.me/rwebaz */

import product.Product;
import product.ProductImplements;
import seller.JoeBaker;
import seller.Seller;
import seller.SellerImplements;

public class TestJoeBaker {
	
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
			.println("Test: Number Three | Show The Product Name Seller 'Joe Baker' Is So Proud Of");
		System.out
			.println("==================================================================================");
		
		/* Create a new instance of the JoeBaker class named 'joebaker' and...
		pass argument(s) to the parameters of the new 'joebaker' object */
		
		JoeBaker joebaker = new JoeBaker("Bread");
		
		/* Create a couple of new instances of the Seller class named 'seller1', 'seller2', and 'seller3'...
		 * And, pass argument(s) to the parameters of the new 'seller' objects */
		
		Seller seller1 = new Seller("Bread", new Product("Whole Wheat bread", 1.59));
		
		Seller seller2 = new Seller("Bread", new Product("Honey Wheat bread", 2.99));
		
		Seller seller3 = new Seller("Bread", new Product("Sunflower Wheat Bread", 2.99));
		
		/* Create a couple of new instances of the 'ProductImplements' class named 'productimplements1', 'productimplements2', and 'productimplements3'...
		 * And, pass argument(s) to the parameters of the new 'productimplements' object */
		
		ProductImplements productimplements1 = new ProductImplements("Whole Wheat", "20005", 1.59);
		
		ProductImplements productimplements2 = new ProductImplements("Honey Wheat", "20006", 2.99);
		
		ProductImplements productimplements3 = new ProductImplements("Sunflower Wheat", "20007", 3.49);
		
		/* Create a new instance of the SellerImplements class named 'sellerimplements' and...
		pass argument(s) to the parameters of the new 'sellerimplements' object */
		
		SellerImplements sellerimplements = new SellerImplements("Joe Baker", "10009", 100_000);
	
		/* Create a new instance of the 'Product' class named 'product' and...
		pass argument(s) to the parameters of the new 'product' object */
		
		Product product = new Product("Bread", 2.99);
		
		// Print to the console the item name of the product being sold
		
		System.out.println("Summation: '" + sellerimplements.getSellerName() + "' wants to sell '"
				+ joebaker.getName() + "'!");
		
		System.out
				.println("================================================================================================");
		
		System.out.println("" + sellerimplements.getSellerName() + "'s favorites are his new products... "
				+ productimplements1.getProductName() +", " + productimplements2.getProductName() + ", "
						+ "and " + productimplements3.getProductName() + " " + product.getCategoryName() + "s.");
		
		System.out
			.println("================================================================================================");
		
		System.out
			.println("The hash codes for each instance of the seller class are " + seller1.hashCode() + ", " + seller2.hashCode() + ", and " + seller3.hashCode() + ".");
		
		System.out
			.println("================================================================================================");
		
		productimplements1.getProductInfo();
		
		productimplements2.getProductInfo();
		
		productimplements3.getProductInfo();
		
		System.out
			.println("The product category we have been working with is '" + product.getCategoryName() + "' at an average price of $" + (productimplements1.getProductPrice() + productimplements2.getProductPrice() + productimplements3.getProductPrice())/3 + " per loaf.");
		
		System.out
			.println("===============================================================================================");
	
		
		return;

	}
}
