package seller;

/**
 * The 'SellerImplements' class is a re-write of the given (old) 'SellerImpl_old' class.
 * ====================================================================================================
 * The 'SellerImplements' class extends the base Seller class, and implements the SellerInterface class.
 * ====================================================================================================
 * @param 1si.) String s_name - An object string parameter that represents the seller's name,
 * now equal to the variable 'sellerName'
 * ====================================================================================================
 * @param 2si.) String s_id - A object string parameter that represents the seller's identification schematic,
 * now equal to the variable 'sellerId'
 * ====================================================================================================
 * @param 3si.) int s_limit - A primitive integer parameter (4-bytes = 32 bits) that represents...
 * the seller's assigned credit or gross dollar bid limit, now equal to the variable 'sellerLimit'
 * ====================================================================================================
 * @author rwebaz http://about.me/rwebaz */

public class SellerImplements extends Seller implements SellerInterface {
	
	// This class implements the SellerInterface
	
	// Declare the class or 'instance' variables of the 'SellerImplements' class
	
			// The Seller's name of each instance of the subject 'Seller' class
				protected String sellerName;
				
			// The ID number of each Seller for each instance of the subject 'Seller' class
				protected String sellerId;
				
			// The ID number of each Seller for each instance of the subject 'Seller' class
				protected int sellerLimit;
		
	// Create a primary constructor for the 'SellerImplements' class
		
		public SellerImplements(String s_name, String s_id, int s_limit) {
			super(categoryName, itemProduct);
			
		/* Rename the instance variables of the 'SellerImplements' secondary constructor method...
		 * To accommodate keyword 'this' and to...
		 * Instantiate the variables as local within the primary constructor method 'SellerImplements' */
			
			sellerName = s_name;
			sellerId = s_id;
			sellerLimit = s_limit;
			
		}
			
	// Other methods
		
	public void getSeller() {
		System.out.println("The new Seller's name is " + this.getSellerName() +
				"; Seller ID: " + this.getSellerId() +
				"; USD Limit: $" + this.getSellerLimit() + ".");
		System.out.println("===============================================================================");
	}
	
	// Declare the getter methods of the 'Seller' class
	
		/* Per contract w interface 'SellerInterface'...
		 * Give other methods the right to 'read from' or 'get' the variable 'sellerName'...
		 * From the 'SellerImplements' class */
	
		@Override
		public String getSellerName() {
			return sellerName;
		}
		
		/* Per contract w interface 'SellerInterface'...
		 * Give other methods the right to 'read from' or 'get' the variable 'sellerId'...
		 * From the 'SellerImplements' class */
		
		@Override
		public String getSellerId() {
			return sellerId;
		}
		
		/* Per contract w interface 'SellerInterface'...
		 * Give other methods the right to 'read from' or 'get' the variable 'sellerLimit'...
		 * From the 'SellerImplements' class */
		
		@Override
		public int getSellerLimit() {
			return sellerLimit;
		}
		
	// Declare the setter methods of the 'Seller' class
		
		/* Per contract w interface 'SellerInterface'...
		 * Give other methods the right to 'write to' or 'set' the variable 'sellerName'...
		 * From the 'SellerImplements' class */
				
		@Override		
		public void setSellerName(String sellerName) {
			this.sellerName = sellerName;
		}
		
		/* Per contract w interface 'SellerInterface'...
		 * Give other methods the right to 'write to' or 'set' the variable 'sellerId'...
		 * From the 'SellerImplements' class */
				
		@Override	
		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
		}
		
		/* Per contract w interface 'SellerInterface'...
		 * Give other methods the right to 'write to' or 'set' the variable 'sellerLimit'...
		 * From the 'SellerImplements' class */
		
		@Override
		public void setSellerLimit(int sellerLimit) {
			this.sellerLimit = sellerLimit;
		}
}

// the source code from the course download

/**
package seller;

/**
 * This class is an implementation of the Seller interface. It represents a generic type of Seller. 
 * Subclasses may define more specific types of Sellers.
 * 
 * @author Laureate Development Team
 *

public class SellerImpl implements Seller
	{
	/**
	 * The name of the Seller
	 
	protected String name;
	
	/**
	 * The Product that this Seller offers for sale.
	 
	protected Product product;

	/**
	 * Create a new SellerImpl
	 * 
	 * @param name - The name of the Seller
	 * @param product - The Product this Seller offers
	 
	public SellerImpl(String name, Product product)
		{
		this.name = name;
		this.product = product;
		}

	/**
	 * Get the name of this Seller
	 * 
	 * @return the name of the Seller
	 
	public String getName()
		{
		return name;
		}

	/**
	 * Get the Product this Seller offers for sale.
	 * 
	 * @return the Product for sale
	 
	public Product getProduct()
		{
		return product;
		}

	/**
	 * Does this Seller provide a particular Product?
	 * 
	 * @return true, if the Seller does provide the requested product
	 *         false, otherwise
	 
	public boolean provideProduct(String productName)
		{
		String theProductName = product.getName();
		return theProductName.equals(productName);
		}

	/**
	 * Make a sale of the Product this Seller offers.
	 * 
	 * @return the Product that this Seller offers
	 
	public Product sellProduct()
		{
		System.out.println("Making a sale: " + name + " is selling " + product.getName());
		
		return product;
		}

	@Override
	/**
	 * Display this SellerImpl as a String
	 * 
	 * @return the SellerImpl information as a String
	 
	public String toString()
		{
		return name + " offers " + product.getName() + " for sale.";
		}

	}
*/