
public class Bid {
	
	//Declare and instantiate the Integer variable 'bid' of Bid to 'Integer.' or 100
	public int bid = 100;
	
	//give other methods the right to 'read from' or 'get' the variable 'bid' from the Bid class
	public int getBid(int bid) {	
		return bid;
	}
	
	//Declare the Integer array 'bids' of Bid
	public int[] bids;
	
	//give other methods the right to 'read from' or 'get' the values within the 'bids' array
	public void getBids(int[] bids) {	
		return;
	}
	
	// Draft the Bid class method 'findLowBid	
		public int findLowBid(int bids[]) {
			
			for (int i = 0; i < bids.length; i++) {
				int min = bids[i];
				if(bid < min) 
				min = bid;  
			}
			
			// Print the progress of the method	
			System.out.println("The lowest bid within the given array of bids is: " + bid);

			return bid;
		}
}