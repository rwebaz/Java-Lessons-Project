package product;

/**
 * @param 1p.) String p_name - A string parameter derived from the new Product class that represents...
 * any given product name, now equal to the variable 'productName'
 * @param 2p.) String p_id - A string parameter derived from the new Product class that represents...
 * any given product's identification schematic, now equal to the variable 'productId'
 * @param 3p.) double p_price - A primitive real (decimal) number parameter (8-bytes = 64 bits) derived from...
 * the new Product class that represents any given product's assigned gross price,
 * now equal to the variable 'productPrice' */

public class ExtendProduct extends Product {
	
	/* First, create a secondary constructor for all future instances of the 'ExtendProduct' class that...
	 * extends the superclass 'Product'. If a secondary constructor is not designated by the programmer...
	 * the compiler will create an automatic constructor w no parameters.
	 */
	
			public ExtendProduct(String p_name, String p_id, double p_price) {
				super(itemName, itemPrice);
				
	/* Note: Notice how class variables representing other parameters from the parent class that were not...
	 * used in the construction of the secondary constructor are nevertheless still available to...
	 * the extending subclass in the form of class variables of object type 'super'.
	 */
				
	/* Second, initialize as declared class variables of the parent class...
	 * The applicable parameters that were used to create the secondary constructor...
	 * In order to accommodate the 'local' keyword 'this'. */
				
			productName = p_name;
			productId = p_id;
			productPrice = p_price;
		
	}
}