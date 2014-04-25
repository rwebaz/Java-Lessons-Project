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