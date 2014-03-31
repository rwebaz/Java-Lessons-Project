public class BidEvaluator {
	
	public static void main(String[] args) {
				
		// Create a new Object named 'bidWin' from the Bid class
				BidBook bidWin = new BidBook();
				
		// Initialize the String type variable 'projectName'
				bidWin.setProjectName("\"Dig-A-Ditch\" project");
				
		// Initialize the String type variable 'projectMessage'
				bidWin.setProjectMessage("Welcome to the project bid book for the ");
				
		// Initialize the String type variable 'projectIntro'
				bidWin.setProjectIntro("Welcome to the project bid book for the \"Dig-A-Ditch\" project");
				
		// Initialize the Integer type variable 'bid' to the system 'Integer.MAX_VALUE'
				bidWin.setBid(Integer.MAX_VALUE);
				
		// Initialize the Integer type variable 'lowBid' to the system 'Integer.MAX_VALUE'
				bidWin.setLowBid(Integer.MAX_VALUE);
				
		// Initialize the Integer type Object array 'bidsArray' with the tendered bids
				
				int[] bidsArray = {42,23,99,67,55};
				bidWin.setBidsArray(bidsArray);
						
		// Return the test results to the screen
				bidWin.findLowBid(bidsArray);
		
		return;
	}
}