package oldtest;

import buyer.Buyer;
import seller.Seller;
import product.Product;

public class OldTestDriver {
	
	

			System.out.println("====================================================================================");
			System.out.println("The 'Auction Test Driver Program' (ATDP): Testing methods, arguments, and interfaces");
			System.out.println("====================================================================================");
			
			 create a new instance of the Seller class named 'newSeller1' and...
			 * pass arguments to the parameters of the Seller class 
			
			Seller newSeller1 = new Seller("James Baker", "S-000-1001", 90000);
			
			System.out.println("The new Seller's name is " + newSeller1.getSellerName() +
					"; Seller ID: " + newSeller1.getSellerId() +
					"; USD Limit: $" + newSeller1.getSellerLimit() + ".");
			System.out.println("===============================================================================");
			
			 create a new instance of the Buyer class named 'newBuyer1' and...
			 * pass arguments to the parameters of the Buyer class 
			
			Buyer newBuyer1 = new Buyer("Robert Smith", "B-000-1002", 20000);
			
			System.out.println("The new Buyer's name is " + newBuyer1.getBuyerName() +
					"; Seller ID: " + newBuyer1.getBuyerId() +
					"; USD Limit: $" + newBuyer1.getBuyerLimit() + ".");
			System.out.println("==================================================================================================");
			
			 create a new instance of the Product class named 'newProduct1' and...
			 * pass arguments to the parameters of the Product class 
			
			Product newProduct1 = new Product("Concrete Block, 4\" x 6\", 10pk", "P-000-1003", 10.75);
			
			System.out.println("The new Product's name is " + newProduct1.getProductName() +
					"; Product ID: " + newProduct1.getProductId() +
					"; USD Price: $" + newProduct1.getProductPrice() + ".");
			System.out.println("==================================================================================================");
			
			// TODO: Write a test for the getName() method
			
			// TODO: Write a test for the getProduct() method
			
			// TODO: Write a test for the provideProduct() method
			
			// TODO: Write a test for the sellProduct() method
			
			}
	} 