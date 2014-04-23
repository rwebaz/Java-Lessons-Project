package oldtest;

/**
 * @param arg
 */

import product.Product_old;
import seller.Seller;

public class SellerImplTestDriver_old {

	public static void main(String[] args) {
			
		Seller seller = new Seller("Baker", new Product_old("Bread", 1.95));
			
			seller.getSellerName();
			
			seller.getProductName();
			
			seller.provideProduct();
			
			seller.sellProduct();
		}
}