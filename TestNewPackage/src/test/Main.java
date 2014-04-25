package broker;

import seller.*;
import buyer.*;

/**
 * This class tests the Buyers and Sellers project by creating some Buyers and Sellers.
 * They are registered with the Broker who then attempts to locate the Products that
 * the Buyers want to purchase.
 * 
 * @author Laureate Development Team
 *
 */
public class Main
	{
	public static void main(String[] args)
		{
		// create the Broker
		Broker broker = new Broker();
		
		// create some sellers and register with the Broker
		Seller seller = new Baker("The Baker");
		broker.addSeller(seller);		
		seller = new Florist("The Florist");
		broker.addSeller(seller);
		
		// create some buyers and register with the Broker
		Buyer buyer = new CashBuyer("The Cash Shopper");
		buyer.addItemToShoppingList("Bread");
		buyer.addItemToShoppingList("Flowers");
		broker.addBuyer(buyer);
		
		buyer = new CreditCardBuyer("The Plastic Shopper");
		buyer.addItemToShoppingList("Bread");
		buyer.addItemToShoppingList("Flowers");
		buyer.addItemToShoppingList("Porsche");
		broker.addBuyer(buyer);

		// The Broker displays the Buyers and Sellers before making any sales 
		broker.displayBuyers();
		broker.displaySellers();
		
		// The Broker will now attempt to locate the items that the Buyers want to purchase
		broker.findItemsForBuyers();
		
		// The Broker displays the Buyers to see how much they purchased
		broker.displayBuyers();
		}

	}
