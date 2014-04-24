package product;

public class Product_Implements_old implements Product_Interface_old {
	
	// This class implements the ProductInterface
	
		// Declare the 'instance' variables accessible to the class
		
			protected String productName;
			protected String productId;
			protected double productPrice;
			
		// Create a secondary constructor
			public Product_Implements_old(String p_name, String p_id, double p_price) {
			
			/* Rename the instance variables to accommodate constructor this and to...
			 * instantiate the variables as local within the method 'SellerImplements' */
				
				productName = p_name;
				productId = p_id;
				productPrice = p_price;
		}
			
		// Other methods
			
			public void getProduct() {
				
				System.out.println("The new Seller's name is " + this.getProductName() +
						"; Seller ID: " + this.getProductId() +
						"; USD Limit: $" + this.getProductPrice() + ".");
				System.out.println("===============================================================================");
		}
			
			
		// per contract w interface 'ProductInterface'
			
			@Override
			public String getProductName() {
				return productName;
			}
			
		// per contract w interface 'ProductInterface'
			
			@Override
			public String getProductId() {
				return productId;
			}
			
		// per contract w interface 'ProductInterface'
			
			@Override
			public double getProductPrice() {
				return productPrice;
			}
}