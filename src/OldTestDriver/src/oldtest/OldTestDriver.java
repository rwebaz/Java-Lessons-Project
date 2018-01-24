package oldtest;

import buyer.Buyer_class_old;
import product.Product_class_old;
import seller.Seller_class_old;

public class OldTestDriver {
			
			/* create a new instance of the Seller class named 'newSeller1' and...
			 * pass arguments to the parameters of the Seller class */
			
			Seller_class_old newSeller1 = new Seller_class_old("James Baker", "S-000-1001", 90_000);
			
			/* Create a new instance of the Product class named 'newProduct1' and...
			 * pass arguments to the parameters of the Product class */
			
			Product_class_old newProduct1 = new Product_class_old("Concrete Block, 4\" x 6\", 10pk", 10.75);
			
			/* Create a new instance of the Buyer class named 'newBuyer1' and...
			 * pass arguments to the parameters of the Buyer class */
			
			Buyer_class_old newBuyer1 = new Buyer_class_old("Tony Wells", "B-000-1002", 50_000);
			
			// TODO: Write a test for the getName() method
			
			// TODO: Write a test for the getProduct() method
			
			// TODO: Write a test for the provideProduct() method
			
			// TODO: Write a test for the sellProduct() method
			
}