package test;

import product.Product_class_old;

import seller.Seller_class_old;

public class SellerImplTestDriver_old {

	public static void main(String[] args) {
		
		System.out.println("====================================================================================");
		System.out.println("The 'Auction Test Driver Program' (ATDP): Testing methods, arguments, and interfaces");
		System.out.println("====================================================================================");
		
		Seller_class_old seller = new Seller_class_old("Baker", new Product_class_old("Bread", 1.95));
			
			seller.getSellerName();
			
			seller.getProductName();
			
			seller.provideProduct();
			
			seller.sellProduct();
			
			
			
		}
	
	
}