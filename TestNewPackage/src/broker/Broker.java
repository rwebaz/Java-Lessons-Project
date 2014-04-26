package broker;

/**
 * The Broker class serves as a Product broker for Buyers. The Buyers register with 
 * the Broker. The Broker then attempts to locate a Seller who can provide the 
 * items that the Buyers are looking for.
 * Once the Broker has located a Seller with the item a Buyer is looking for, the 
 * Broker then arranges the sale of that item.
 *  
 * @author Laureate Development Team
 */

import seller.Seller;

import java.util.ArrayList;
import java.util.List;

import product.Product;

import buyer.Buyer;

/**
 * The 'Broker' class is a new class, primarily to create instances of broker objects
 * ============================================================================================
 * @param 1s.) String name - An object string parameter derived from the original (old)...
 * 'SellerInterface_old' class, now equal to the variable 'categoryName'
 * ============================================================================================
 * @param 2s.) Product product - An object product parameter derived from the original (old)...
 * 'SellerInterface_old' class, now equal to the variable 'itemProduct'
 * ============================================================================================
 * @author rwebaz http://about.me/rwebaz */

public class Broker {
	
		/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables.
		 * And, as such can be used within the class. Thus, variables declared as 'class' variables...
		 * Are available class-wide. */
		
		/* Note: Class variables can be identified (through their 'access modifiers')...
		 * As 'static' String(s), int(s), and double(s), but not as 'public'. */
		
		// The 'instance' variables for the new 'Broker' class
	
	// Other methods
	
	public void addSeller(Seller joebaker) {
		// TODO Auto-generated method stub
		
	}
	
	//The list of registered Sellers.
	 
	private List<Seller> sellers = new ArrayList<Seller>();
	
	// The list of registered Buyers.
	 
	private List<Buyer> buyers = new ArrayList<Buyer>();
	
	/* Attempt to locate the Products that the Buyers are looking for.
	 * When the Product is located, the Broker arranges for the Seller
	 * to sell the Product, and for the Buyer to pay for it. */
	 
	public void findItemsForBuyers()
		{
		// for (Buyer buyer : buyers)
			{
			// for (String productName : buyer.getShoppingList())
				{
				// String itemName = productName;
				// Product theProduct = findItem(itemName);
				// if (theProduct != null)
					{
					// buyer.payForItem(theProduct);
					}
				}
			}
		}

	// Locate a Seller who can provide the desired Product.
	// @param itemName - the name of the Product
	// @return - the Product, if a Seller is located null, if no Seller provides this Product
	 
	public Product findItem(String itemName)
		{
		Product item = null;
		
		// for (Seller seller : sellers)
			{
			// if (seller.provideProduct(itemName))
				{
				// item = seller.sellProduct();				
				// break;
				}
			}
		
		return item;
		}
	
	// Register a Buyer with the Broker.
	// @param buyer - the Buyer
	 
	public void addBuyer(Buyer buyer) {
		buyers.add(buyer);
	}
	
	// Display the list of registered Buyers
	 
	public void displayBuyers()
		{
		System.out.println();
		System.out.println("The buyers:");
		for (Buyer buyer : buyers)
			{
			System.out.println(buyer.toString());
			}
		System.out.println("");
		}
	
	// Register a Seller with the Broker.
	// @param seller - the Seller
	 
	public void addSeller1(Seller seller) {
		sellers.add(seller);
	}
	
	// Display the list of registered Sellers
	 
	public void displaySellers()
		{
		System.out.println();
		System.out.println("The sellers:");
		for (Seller seller : sellers)
			{
			System.out.println(seller.toString());
			}
		System.out.println(""); 
		}

}