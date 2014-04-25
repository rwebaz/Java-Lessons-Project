package product;

/**
 * This interface holds like 'ProductImplements' methods, both 'getters' and 'setters'
 * ====================================================================================
 * Thus, invoke this interface from the 'ProductImplements' class that implements this interface
 * ====================================================================================
 * @author rwebaz http://about.me/rwebaz */

public interface ProductInterface {
	
	// Declare the 'getter' methods of the 'ProductImplements' class
		public String getProductName();
		public String getProductId();
		public double getProductPrice();
	
	// Declare the 'setter' methods of the 'ProductImplements' class
		public void setProductName(String productName);
		public void setProductId(String productId);
		public void setProductPrice(double productPrice);
}