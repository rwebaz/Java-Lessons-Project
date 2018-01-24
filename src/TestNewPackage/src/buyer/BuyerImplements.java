package buyer;

/**
 * This class is a re-work of the given Buyer interface within the original BuyerImpl class.
 * ============================================================================================
 * The goal of the rework is to represent a generic type of Buyer.
 * ============================================================================================
 * However, subclasses may define more specific types of Buyers.
 * ============================================================================================
 * @param name - The name of the new Buyer
 * ============================================================================================
 * @param type - The 'type' of new Buyer (normally 'cash' or normally 'credit') 
 * ============================================================================================
 * @author Original: Laureate Development Team
 * ============================================================================================
 * @author Subsequent annotations and changes rwebaz http://about.me/rwebaz */
 
import java.util.ArrayList;
import java.util.List;

import product.Product;


public class BuyerImplements extends Buyer implements BuyerInterface {
	
	// This class implements the BuyerInterface
	
	/* Declare the 'instance' variables that are accessible to the class.
	 * The BuyerImplements class (instance) variables are: */
		
		protected String null_buyer;
		
		protected String name;
		
		
		protected int buyerLimit;
		
		protected String pay;
		
		protected String categoryName;
		protected String itemProduct;
	
		// Create the primary constructor for all future instances of the 'BuyerImplements' class
		
		public BuyerImplements(String b_name, String b_id, int b_limit) {
			// Choose one...
			super(buyerName, buyerType);
			// super(categoryName, itemProduct);
			
			/* Rename the class variables to accommodate constructor 'this' and to...
			instantiate the variables as 'local' variables of the constructor method Buyer */
			
			buyerName = b_name;
			buyerId = b_id;
			buyerLimit = b_limit;
		
		}
			
	// Other methods
			
		public static void addBuyer(Buyer buyer) {
			buyers.add(buyer);
		}
		
					
			// The shopping cart that contains all the items this Buyer has purchased.
					 
					private List<Product> shoppingCart = new ArrayList<Product>();
				
			// Methods that point to the contract interface w the 'BuyerInterface' class @Override

			// per contract w interface 'BuyerInterface'
			@Override
				public String getBuyerName() {
					return buyerName;
				}
			
			@Override
			// per contract w interface 'BuyerInterface'
				public String getBuyerType() {
					return buyerType;
				}
				
			// per contract w interface 'BuyerInterface'
				public String buyerPayForItem1() {
					pay = "The buyer " + getBuyerName() + " is now paying by " + getBuyerType() + "...";
					
					System.out.println("A.) " + pay);
					return pay;
			}
				
			// per contract w interface 'BuyerInterface'
				
				@Override
				
				// Display this Buyer and some of its information as a String.
				 
				public String toString()
					{
					String str = getBuyerName() + " wants to buy ";
					for (String productName : shoppingList)
						{
						str += productName + " ";
						}
					str += " has purchased ";
					
					for (Product product : shoppingCart)
						{
						str += product.getCategoryName() + " ";
						}
					return str;
					}

			
				
			// Pay for the item that the Buyer is purchasing
			// @param item - the Product that is being purchased
				 
				public void payForItem1(Product item) {
					System.out.println(getBuyerName() + " is paying for item " + item.getCategoryName());
					addItemToCart(item);
				}
				
			// Add an item to the shopping list
			// @param itemName - the name of the item to add to the shopping list
				 
				public void addItemToShoppingList1(String itemName) {
					shoppingList.add(itemName);
				}
				
			// Add a Product to the shopping cart.
			// @param item the Product to add to the shopping cart
				 
				public void addItemToCart1(Product item) {
					shoppingCart.add(item);
				}

			
				@Override
				public String buyerPayForItem() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public void payForItem(Product item) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void addItemToShoppingList(String itemName) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void addItemToCart(Product item) {
					// TODO Auto-generated method stub
					
				}

				// The list of registered Buyers.
				 
				public static List<Buyer> buyers = new ArrayList<Buyer>();
				
				// Get the shopping list of items that the Buyer wants to purchase.
				// @return the list of items in the shopping list
					
					@Override

					public List<String> getShoppingList() {
						return shoppingList;
					}
					
					/* Attempt to locate the Products that the Buyers are looking for.
					 * When the Product is located, the Broker arranges for the Seller
					 * to sell the Product, and for the Buyer to pay for it. */
					 
					

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
				
				// The shopping list array that contains all the items this Buyer wants to purchase
				 
				private List<String> shoppingList = new ArrayList<String>();
				
				public void findItemsForBuyers() {
					
					for (Buyer buyer : buyers) {
						
						for (String productName : this.getShoppingList()) {
							String itemName = productName;
							Product theProduct = findItem(itemName);
						// Nest If loop in 1st For loop	
						if (theProduct != null) {
							buyer.payForItem(theProduct);
						}
						// Close 2nd For loop
						}
					}
				}
				
				// Display the list of registered Buyers
				 
				public static void displayBuyers()
					{
					System.out.println();
					System.out.println("The buyers:");
					for (Buyer buyer : buyers)
						{
						System.out.println(buyer.toString());
						}
					System.out.println("");
					}

				
				
				
				
				
}