package seller;

import product.Product;

public interface Seller_old {
	
	public String getName();
	public Product getProduct();
	public boolean provideProduct(String productName);
	public Product sellProduct();
	
}