package seller;

public interface Seller
	{
	public String getName();
	public Product getProduct();
	public boolean provideProduct(String productName);
	public Product sellProduct();
	}
