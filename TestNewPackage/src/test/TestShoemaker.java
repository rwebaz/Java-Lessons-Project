package test;

import product.Product;

public class TestShoemaker {
	
	static String name;

	public static void main(String[] args) {

		System.out
				.println("==================================================================================");
		System.out
				.println("The 'Test Joe Shoemaker' (TJS) Program: Testing methods, arguments, and interfaces");
		System.out
				.println("==================================================================================");
		System.out
				.println("Run: Number Two 'Polymorphism' and 'Inheritance'");
		System.out
				.println("==================================================================================");

		// 1.) Create a new instance of the ShoeMaker class named 'joeshoemaker'
		// 2.) Pass argument(s) to the parameters of the new 'joeshoemaker' object

		ShoeMaker joeshoemaker = new ShoeMaker("shoes");
		
		Product product = new Product("Fancy shoes", 149.99);
		
		System.out
				.println("================================================================================================");
		
		System.out.println("1b) Joe the Shoe Maker wants to sell '"
				+ joeshoemaker.getName() + "'!");
		
		product.getProduct();

		return;
	}
}