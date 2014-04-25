package seller;

/**
 * This interface holds like 'SellerImplements' methods, both 'getters' and 'setters'
 * ====================================================================================
 * Thus, invoke this interface from the 'SellerImplements' class that implements this interface
 * ====================================================================================
 * @author rwebaz http://about.me/rwebaz */

public interface SellerInterface {
	
	// Declare the 'getter' methods of the 'SellerImplements' class
		public String getSellerName();
		public String getSellerId();
		public int getSellerLimit();
		
	// Declare the 'setter' methods of the 'SellerImplements' class
		public void setSellerName(String sellerName);
		public void setSellerId(String sellerId);
		public void setSellerLimit(int sellerLimit);
}