package product;

/**
 * This is the given Product_old class
 * @author rwebaz
 **/

public class Product_class_old {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables.
	 * And, as such can be used within the class. Thus, variables declared as 'class' variables are available class-wide. */
	
	// Class variables are identified as 'static' String(s), int(s), and double(s), not 'public'. */
	
	// Declare the class or 'instance' variables of the 'Product_old' class
	
	// The item name for each product declared within an instance of the 'Product_old' class
		protected String itemName;
		
	// The item price for each product declared within an instance of the 'Product_old' class
		protected double itemPrice;
		
	// Create the primary constructor for all future instances of the Product_old class
	
	public Product_class_old(String name, double price) {
		
		/* Rename the class variables to accommodate constructor this and to...
		instantiate the variables as 'local' variables of the constructor method Product_old */
		
		itemName = name;
		itemPrice = price;
	}
	
	// Declare the getter methods of the 'Product' class
	
	// Give other methods the right to 'read from' or 'get' the variable 'itemName' from the Product_old class
	public String getItemName() {
		return itemName;
	}
	
	// Give other methods the right to 'read from' or 'get' the variable 'itemPrice' from the Product_old class
	public double getItemPrice() {
		return itemPrice;
	}
	
	// Declare the setter methods of the 'Product_old' class
	
	// Give other methods the right to 'write to' or 'set' the variable 'itemName' from the Product_old class
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	// Give other methods the right to 'write to' or 'set' the variable 'itemPrice' from the Product_old class
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
}