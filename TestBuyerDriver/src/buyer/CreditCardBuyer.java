package buyer;

public class CreditCardBuyer extends BuyerImplements {
	
	/* Declare the 'instance' variables that are accessible to the class.
	 * The CreditCardBuyer class (instance) variables are: */
	
	protected String credit_buyer;
	
	// Declare the CreditCardBuyer class methods that extend the BuyerImplements class
	
	public CreditCardBuyer(String b_name, String b_type) {
		super(b_name, b_type);
	}	
}