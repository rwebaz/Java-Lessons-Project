package seller;

public class Product
	{
	protected String itemName;
	protected double itemPrice;
	
	public Product(String name, double price)
		{
		itemName = name;
		itemPrice = price;
		}
	
	public String getItemName()
		{
		return itemName;
		}
	public void setItemName(String itemName)
		{
		this.itemName = itemName;
		}
	public double getItemPrice()
		{
		return itemPrice;
		}
	public void setItemPrice(double itemPrice)
		{
		this.itemPrice = itemPrice;
		}
	}
