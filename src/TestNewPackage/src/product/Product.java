package product;

/**
 * This class 'Product' starts off with the given parameters and primary constructor...
 * of the 'Product_old' class.
 * ============================================================================================
 * Yet, melds new parameters by way of the 'ProductImplements' subclass
 * ============================================================================================
 * @author rwebaz http://about.me/rwebaz */

public class Product {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables.
	 * And, as such can be used within the class.
	 * Thus, variables declared as 'class' variables are available class-wide.
	 * Class variables can be identified as 'static' or 'protected', but not 'public'.
	 * Class variables can also be of type String, int, or double. */
	
	// Declare the class or 'instance' variables set to represent the parameters of the 'Product' class
	
		// The item name for each product derived from an instance of the 'Product_old' class
		protected static String categoryName;
			
		// The item price for each product derived from an instance of the 'Product_old' class
		protected static double itemPrice;
		
	// Create the primary constructor derived from the 'Product' class
			
			public Product(String name, double price) {
				
				/* Rename the class variables to accommodate constructor this and to...
				instantiate the variables as 'local' variables of the constructor method Product */
				
				categoryName = name;
				itemPrice = price;

			}
			
	// The original methods form the (old) 'SellerImpl' class

			public boolean provideProduct(String productName) {
				return false;
			}

			public Product sellProduct() {
				return null;
			}
			
	// Declare the getter methods of the 'Product' class
			
		// Give other methods the right to 'read from' or 'get' the variable 'CategoryName' from the Product class
			
			public String getCategoryName() {
				// more to come...
				return categoryName;
			}
			
			// Give other methods the right to 'read from' or 'get' the variable 'itemPrice' from the Product class
			
			public double getItemPrice() {
				// more to come...
				return itemPrice;
			}
			
	// Declare the setter methods of the 'Product' class
			
		// Give other methods the right to 'write to' or 'set' the variable 'categoryName' from the Product class
			
			public void setCategoryName(String categoryName) {
				// more to come...?
				Product.categoryName = categoryName;
			}
			
		// Give other methods the right to 'write to' or 'set' the variable 'itemPrice' from the Product_old class
			
			public void setItemPrice(double itemPrice) {
				// more to come...?
				Product.itemPrice = itemPrice;
			}
			
	// Other methods
			
}

// From the course download

/**
*
package seller;

/**
 * The Product class represents an item with a name and a price.
 * 
 * @author Laureate Development Team
 *
 
public class Product
	{
	/**
	 * The name of the Product.
	 
	protected String itemName;
	
	/**
	 * The price of the Product.
	 
	protected double itemPrice;
	
	/**
	 * Create a new Product
	 * 
	 * @param name - the name of the Product
	 * @param price - the price of the Product
	 
	public Product(String name, double price)
		{
		itemName = name;
		itemPrice = price;
		}
	
	/**
	 * Get the name of the Product
	 * 
	 * @return - the name of the Product
	 
	public String getName()
		{
		return itemName;
		}
	
	/**
	 * Set the name of the Product
	 * 
	 * @param itemName - the name of the Product
	 
	public void setName(String itemName)
		{
		this.itemName = itemName;
		}
	
	/**
	 * Get the price of the Product
	 * 
	 * @return - the price of the Product
	 
	public double getPrice()
		{
		return itemPrice;
		}
	
	/**
	 * Set the price of the Product
	 * 
	 * @param itemPrice - the price of the Product
	 
	public void setPrice(double itemPrice)
		{
		this.itemPrice = itemPrice;
		}
	} */
