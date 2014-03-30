public class BidEvaluator {
	
	public static void main(String[] args) {
		
		// Create a new Object named 'bidWin' from the Bid class
		Bid bidWin = new Bid();
		
		// Create an array of bid estimates named 'bids'
		int[] bids = new int[] {
			42, 23, 99, 67, 55
		};
		
		// Test the 'findLowBid' method of the Bid class by evaluating the bids array
		bidWin.findLowBid(bids);
		
		return;
	}
}