package product;

public class Product {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables.
	 * And, as such can be used within the class. Thus, variables declared as 'class' variables are available class-wide. */
	
	// Class variables are identified as 'static' String(s), int(s), and double(s), not 'public'. */
	
	// Declare the class or 'instance' variables of the 'Product' class
		
		// The Product's name for each instance of the 'Product' class
		protected String productName;
		
		// The Product's Id for each instance of the 'Product' class
		protected String productId;
		
		// The Product's Price for each instance of the 'Product' class
		protected double productPrice;
	
	// Create the constructor for all future instances of the Product class
		
		public Product(String p_name, String p_id, double p_price) {
		
		/* Rename the class variables to accommodate constructor this and to...
			instantiate the variables as 'local' variables of the constructor method Product */
			
		productName = p_name;
		productId = p_id;
		productPrice = p_price;
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
}