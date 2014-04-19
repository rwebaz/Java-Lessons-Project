package buyer;

public class CashBuyer extends BuyerImplements {
	
	/* Declare the 'instance' variables that are accessible to the class.
	 * The CashBuyer class (instance) variables are: */
	
	protected String cash_buyer;
	
	// Declare the CashBuyer class methods that extend the BuyerImplements class
	
	public CashBuyer(String b_name, String b_type) {
		super(b_name, b_type);
	}
}