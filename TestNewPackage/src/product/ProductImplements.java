package product;

/**
 * The 'ProductImplements' class is a newly written class that,
 * extends the base Product class, and implements the ProductInterface class
 * =========================================================================
 * @param 1p.) String p_name - A string parameter derived from the new Product class that represents...
 * any given product name, now equal to the variable 'productName'
 * =========================================================================
 * @param 2p.) String p_id - A string parameter derived from the new Product class that represents...
 * any given product's identification schematic, now equal to the variable 'productId'
 * =========================================================================
 * @param 3p.) double p_price - A primitive real (decimal) number parameter (8-bytes = 64 bits) derived from...
 * the new Product class that represents any given product's assigned gross price,
 * now equal to the variable 'productPrice'
 * =========================================================================
 * @author rwebaz http://about.me/rwebaz */

public class ProductImplements extends Product implements ProductInterface {
	
	// This class implements the ProductInterface
	
		/* Declare the 'instance' (class) variables accessible to the 'ProductImplements' class
		 * The class variables are set to represent the parameters of the 'ProductImplements' class
		 */
		
		// The Product's name for each instance of the 'ProductImplements' class shall be
			protected String productName;
			
		// The Product's Id for each instance of the 'ProductImplements' class shall be
			protected String productId;
			
		// The Product's Price for each instance of the 'ProductImplements' class shall be
			protected double productPrice;
			
		/* Create a secondary constructor for the 'ProductImplements' class that...
		 * Overrides or enhances the 'super' class 'Product'
		 * Note: If a secondary constructor is not designated by the programmer,
		 * Then, the compiler will create an automatic constructor w no parameters. */
			
			public ProductImplements(String p_name, String p_id, double p_price) {
				super(categoryName, itemPrice);
				
			/* Rename the instance variables to accommodate the keyword 'this' and to...
			 * instantiate the variables as local within the method 'SellerImplements' */
				
				productName = p_name;
				productId = p_id;
				productPrice = p_price;
				
		}
			
	// Other methods
			
			public void getProductInfo() {
				
				System.out.println("Product Information | The new product name is '" + this.getProductName() + " " + this.getCategoryName() + "' and the unit price per loaf in dollars USD is '$" + this.getProductPrice() + "'.");
				System.out.println("=======================================================================================================================");
				
			}
			
		// Declare the getter methods of the 'ProductImplements' class
			
			/* Per contract w interface 'ProductInterface'...
			 * Give other methods the right to 'read from' or 'get' the variable 'productName'...
			 * From the 'ProductImplements' class */
			
			@Override
			public String getProductName() {
				return productName;
			}
			
			/* Per contract w interface 'ProductInterface'...
			 * Give other methods the right to 'read from' or 'get' the variable 'productId'...
			 * From the 'ProductImplements' class */
			
			@Override
			public String getProductId() {
				return productId;
			}
			
			/* Per contract w interface 'ProductInterface'...
			 * Give other methods the right to 'read from' or 'get' the variable 'productPrice'...
			 * From the 'ProductImplements' class */
			
			@Override
			public double getProductPrice() {
				return productPrice;
			}
			
		// Declare the setter methods of the 'ProductImplements' class
			
			/* Per contract w interface 'ProductInterface'...
			 * Give other methods the right to 'write to' or 'set' the variable 'productName'...
			 * From the 'ProductImplements' class */
			
			@Override
			public void setProductName(String productName) {
				this.productName = productName;
			}
			
			/* Per contract w interface 'ProductInterface'...
			 * Give other methods the right to 'write to' or 'set' the variable 'productId'...
			 * From the 'ProductImplements' class */
						
			@Override
			public void setProductId(String productId) {
				this.productId = productId;
			}
			
			/* Per contract w interface 'ProductInterface'...
			 * Give other methods the right to 'write to' or 'set' the variable 'productPrice'...
			 * From the 'ProductImplements' class */
						
			@Override
			public void setProductPrice(double productPrice) {
				this.productPrice = productPrice;
			}
}