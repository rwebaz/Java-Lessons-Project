package buyer;

/**
 * This is a rework of the public interface 'Buyer'
 * ============================================================================================
 * 
 * ============================================================================================
 * @author rwebaz http://about.me/rwebaz */

import java.util.List;

import product.Product;

public interface BuyerInterface {
	
	/* This interface holds like 'BuyerImplements' methods.
	 * Invoke this interface from a class that implements this interface */
	
		public String getBuyerName();
		
		public String getBuyerType();
		
		public String buyerPayForItem();
		
		// Pay for an item.
		// @param item - the item that the Buyer is paying for.
		 
		public void payForItem(Product item);
		
		// Add an item to the Buyer's shopping list.
		// @param itemName - the name of the item to add to the shopping list
		 
		public void addItemToShoppingList(String itemName);
		
		// Add an item to the shopping cart of purchased items.
		// @param item - the Product to add to the shopping cart
		 
		public void addItemToCart(Product item);
		
		// Return the shopping list of items this Buyer wants to purchase.
		// @return The shopping list for this Buyer.
		 
		public List<String> getShoppingList();
		
		
		

}