package buyer;

//import null.Null;

public class BuyerImplements implements BuyerInterface {
	
	// This class implements the BuyerInterface
	
	/* Declare the 'instance' variables that are accessible to the class.
	 * The BuyerImplements class (instance) variables are: */
		
		protected String null_buyer;
		protected String buyerName;
		protected String buyerType;
		protected String pay;
	
	// Create a constructor
		
		public BuyerImplements(String b_name, String b_type) {
			
			/* Rename the instance variables to accommodate constructor this and to...
			 * instantiate the variables as local within the method 'BuyerImplements' */
			
			buyerName = b_name;
			
			this.buyerName = b_name;
			
			buyerType = b_type;
			
			pay = "The buyer " + getBuyerName() + " is now paying by " + getBuyerType() + "...";
			
			System.out.println("A.) " + pay);
		}

	// per contract w interface 'BuyerInterface'
		@Override
		public String getBuyerName() {
			return buyerName;
		}
	
	// per contract w interface 'BuyerInterface'
		@Override
			public String getBuyerType() {
			return buyerType;
		}
		
	// per contract w interface 'BuyerInterface'
		@Override	
		public String buyerPayForItem() {
			return pay;
	}
}