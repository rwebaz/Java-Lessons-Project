package seller;

/**
 * This class represents a instance of the 'Seller' named 'Joe Baker' who sells 'Bread'
 * ================================================================================
 * @param name - The String 'name' represents the name of the Baker
 * ============================================================================================
 * Directive: Using the Baker class as an example...
 * ============================================================================================
 * Create a new Java class that extends the 'SellerImpl' class.
 * ============================================================================================
 * This class should print to the console the 'name' of the product being sold.
 * ============================================================================================
 * @author Original: Laureate Development Team
 * ============================================================================================
 * @author Subsequent: rwebaz http://about.me/rwebaz */



public class JoeBaker extends Seller {
	
	protected String name;
	protected String categoryName;
	
	// Create a primary constructor for the 'JoeBaker' class
	
	public JoeBaker(String name) {
		super(name, product);
		
		categoryName = name;
	}

	// Give other methods the right to 'read from' or 'get' the parameter 'name' from the Baker class
		public String getName() {
			return categoryName;
	}
}