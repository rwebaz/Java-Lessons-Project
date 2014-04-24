package seller;

import product.Product_class_old;

public interface Seller_interface_old {
	
	public String getName();
	public Product_class_old getProduct();
	public boolean provideProduct(String productName);
	public Product_class_old sellProduct();
	
}