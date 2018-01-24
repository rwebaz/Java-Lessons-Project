
public class GasOlitre {
	// declare the instance variables of the class
	private static double x, y, z;

	// invoke the main() method
	public static void main(String[] args) {
	// declare the instance variables of the main() method
		double gall = x;
		double litre = y;
		double dollar = z;
		
		litre = (3.7854 * gall);

	}
	
	/* back to the scope of the class
		(or, back to a new code block not part of the main method...
			yet still part of the class?) */
	{
	
	if(x > 0) {
		x = x + 1; // can be written as a 'compound assignment operator' or CAO (short hand)
		x += 1; // this is the CAO (short hand) version of 'x' equals 'x' plus '1'
	}
	else {
		/* execute this code if the condition shown in the 'if' statement above...
			evaluates to 'not' true */
	}
	
	}
}