package test;

/**
 * This 'TestMain' class tests the 'Buyers and Sellers' project by creating some instances of...
 * Both buyers and sellers. The buyers and sellers are then registered with the broker...
 * Who then attempts to locate the products that the buyers want to purchase.
 * ============================================================================================
 * @author | Original code by The Laureate Development Team
 ============================================================================================
 * @author | Subsequent changes and annotations by rwebaz http://about.me/rwebaz */

import product.Product;
import seller.Seller;

import broker.Broker;

import buyer.Buyer;

public class TestMain {

	public static void main(String[] args) {
		
		// Create an instance of the 'Broker' class
				Broker broker = new Broker();
				
		// Create a couple of instances of the 'Seller' class
				
				Seller joebaker = new Seller("Jet Airplanes", new Product("Gulfstream V", 100_000));
				
				Seller sallyflorist = new Seller("Electric Cars", new Product("Tesla X", 40_000));
				
				Seller billshoemaker = new Seller("Tortillas", new Product("Round tostados", 4.99));
				
			// Register the sellers w the broker
				
					broker.addSeller(joebaker);		
				
					broker.addSeller(sallyflorist);
					
					broker.addSeller(billshoemaker);
				
		// Create a couple instances of the 'Buyer' class
				
				Buyer jimshopper = new Buyer("Jim Shopper", "credit");
					
					// Register the Buyer ' Jim Shopper ' w the broker
				
					broker.addBuyer(jimshopper);
				
				
				// The products the ' Jim Shopper ' buyer wishes to purchase are, as follows:
				
					jimshopper.addItemToShoppingList("Bread");
					jimshopper.addItemToShoppingList("Flowers");
				
				Buyer creditcardbuyer = new Buyer("Simon Cardswell", "credit");
				
					// Register the credit card buyer ' Simon Cardswell ' w the broker
				
					broker.addBuyer(creditcardbuyer);
				
				// The products the credit card buyer ' Simon Cardswell ' wishes to purchase are, as follows:
				
					creditcardbuyer.addItemToShoppingList("Bread");
					creditcardbuyer.addItemToShoppingList("Flowers");
					creditcardbuyer.addItemToShoppingList("Porsche");
						
		// The Broker displays the Buyers and Sellers before making any sales
				
				broker.displayBuyers();
				broker.displaySellers();
				
		// The Broker will now attempt to locate the items that the Buyers want to purchase
				
				broker.findItemsForBuyers();
				
		// The Broker displays the Buyers to see how much they purchased
				
				broker.displayBuyers();
				
	}

}
