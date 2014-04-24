package product;

/**
 * This class 'Product' starts off with the given parameters and primary constructor of the 'Product_old' class.
 * Yet, melds new parameters by way of the 'ExtendProduct' subclass
 * @author rwebaz http://about.me/rwebaz
 **/

public class Product {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables.
	 * And, as such can be used within the class.
	 * Thus, variables declared as 'class' variables are available class-wide.
	 * Class variables can be identified as 'static' or 'protected', but not 'public'.
	 * Class variables can also be of type String, int, or double. */
	
	// Declare the class or 'instance' variables set to represent the parameters of the 'Product' class
	
		// The item name for each product derived from an instance of the 'Product_old' class
		protected static String itemName;
			
		// The item price for each product derived from an instance of the 'Product_old' class
		protected static double itemPrice;
		
		// The class variables set to represent the parameters of the subclass 'ExtendProduct'
		
			// The Product's name for each instance of the 'Product' class
			protected String productName;
		
			// The Product's Id for each instance of the 'Product' class
			protected String productId;
		
			// The Product's Price for each instance of the 'Product' class
			protected double productPrice;
		
	// Create the primary constructor derived from the 'Product_old' class
			
			public Product(String name, double price) {
				
				/* Rename the class variables to accommodate constructor this and to...
				instantiate the variables as 'local' variables of the constructor method Product */
				
				itemName = name;
				itemPrice = price;
				
				System.out.println("2a) Joe the Shoe Maker wants to register '" + itemName + "' for sale at a per unit price of '$" + itemPrice + "'.");
			}
			
	// Declare the getter methods of the 'Product' class
			
			// Give other methods the right to 'read from' or 'get' the variable 'productName' from the Product class
			public String getProductName() {
				return productName;
			}
			
			// Give other methods the right to 'read from' or 'get' the variable 'productId' from the Product class
			public String getProductId() {
				return productId;
			}
			
			// Give other methods the right to 'read from' or 'get' the variable 'productPrice' from the Product class
			public double getProductPrice() {
				return productPrice;
			}
			
			// Give other methods the right to 'read from' or 'get' the variable 'itemName' from the Product_old class
			public String getItemName() {
				return itemName;
			}
			
			// Give other methods the right to 'read from' or 'get' the variable 'itemPrice' from the Product_old class
			public double getItemPrice() {
				return itemPrice;
			}
			
	// Declare the setter methods of the 'Product' class
			
			// Give other methods the right to 'write to' or 'set' the variable 'productName' from the Product class
			public void setProductName(String productName) {
				this.productName = productName;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'productId' from the Product class
			public void setProductId(String productId) {
				this.productId = productId;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'productPrice' from the Product class
			public void setProductPrice(double productPrice) {
				this.productPrice = productPrice;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'itemName' from the Product_old class
			public void setItemName(String itemName) {
				Product.itemName = itemName;
			}
			
			// Give other methods the right to 'write to' or 'set' the variable 'itemPrice' from the Product_old class
			public void setItemPrice(double itemPrice) {
				Product.itemPrice = itemPrice;
			}
			
	// Other methods
			
			// The original methods form the (old) 'SellerImpl' class

			public boolean provideProduct(String productName) {
				return false;
			}

			public Product sellProduct() {
				return null;
			}
			
			public void getProduct() {
				
				System.out.println("2b) The new product name is '" + this.getItemName() + "' and the unit price in dollars USD is '$" + this.getItemPrice() + "'.");
				System.out.println("========================================================================================");
			}
}