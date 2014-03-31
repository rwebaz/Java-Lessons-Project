public class BidBook {
	
	// Declare the variables of the 'BidBook' class
	
	// The name of the subject 'BidBook' project
		public String projectName;
		
	// The message of the subject 'BidBook' project
		public String projectMessage;
		
	// The message of the subject 'BidBook' project
		public String projectIntro;
	
	// The Integer variable 'bid' of the BidBook class
		public int i;
		
	// Declare the variable 'lowBid' of Integer type
		public int lowBid;
		
	//	Declare the Object array(s) of the 'BidBook' class
	
	/* Declare the Object array 'bidsArray' of Integer type to represent the tendered bids for...
		the 'projectName' project */
		
		public int[] bidsArray;
	
	// Declare the getter methods of the 'BidBook' class
		
	// Give other methods the right to 'read from' or 'get' the variable 'projectName' from the BidBook class
		public String getProjectName(String projectName) {	
			return projectName;
		}
		
	// Give other methods the right to 'read from' or 'get' the variable 'projectMessage' from the BidBook class
		public String getMessage(String projectMessage) {	
			return projectMessage;
		}
		
	// Give other methods the right to 'read from' or 'get' the variable 'projectIntro' from the BidBook class
		public String getProjectIntro(String projectIntro) {
			projectIntro = projectMessage + projectName; 
			return projectIntro;
		}
		
	// Give other methods the right to 'read from' or 'get' the variable 'bid' from the Bid class
		public int getBid(int bid) {	
			return bid;
		}
		
	// Give other methods the right to 'read from' or 'get' the variable 'lowBid' from the BidBook class
		public int getLowBid(int lowBid) {	
			return lowBid;
		}
		
	// Give other methods the right to 'read from' or 'get' the values within the 'bids' array
		public Object getBidsArray(int[] bidsArray) {	
			return bidsArray;
		}
		
	// Declare the setter methods of the 'BidBook' class
		
	// Give other methods the right to 'write to' or 'set' the variable 'projectName' from the BidBook class
		public String setProjectName(String projectName) {
		
			//write progress to the console
			System.out.println("The String variable 'projectName' has been initialized to: " + projectName);
		
			//return a String
			return projectName;
		}
	
	// Give other methods the right to 'write to' or 'set' the variable 'projectMessage' from the BidBook class
		public String setProjectMessage(String projectMessage) {
					
			//write progress to the console
			System.out.println("The String variable 'projectMessage' has been initialized to: " + projectMessage);
					
			//return a String
			return projectMessage;
		}
		
	// Give other methods the right to 'write to' or 'set' the variable 'projectIntro' from the BidBook class
		public String setProjectIntro(String projectIntro) {
			
			projectIntro = projectMessage + projectName;
			
			//write progress to the console
			System.out.println("The String variable 'projectIntro' has been initialized to: " + projectIntro);
					
			//return a String
			return projectIntro;
		}
		
	// Give other methods the right to 'write to' or 'set' the variable 'bid' from the BidBook class
		public int setBid(int bid) {
				
			//write progress to the console
			System.out.println("The Integer variable 'bid' has been initialized to: " + bid);
				
			//return a String
			return bid;
		}
		
	//give other methods the right to 'write to' or 'set' the variable 'lowBid' from the BidBook class
		public int setLowBid(int lowBid) {
				
			//write progress to the console
			System.out.println("The Integer variable 'lowBid' has been initialized to: " + lowBid);
				
			//return a String
			return lowBid;
		}
		
	
	//give other methods the right to 'write to' or 'set' the Object array 'bidsArray' from the BidBook class
		/* Comment out...
		 * public Object setBidsArray(int [] bidsArray) {
		 * bidsArray = new int[5];
		 * public void setBidsArray(int i, int j, int k, int l, int m) {
		 */
		
		public Object setBidsArray(int[] bidsArray) {
			
			
			
			//write progress to the console
			System.out.println("The Object array 'bidsArray' has been initialized to the Object reference: " + bidsArray);
			
			// Print column headings
			System.out.println("The computer will now print both the index and current value of each element within the 'bidsArray'...");
			System.out.println("=========================================================");
			System.out.printf( "%s%8s\n",  "Index", "Value" );
			System.out.println("=========================================================");
			
			// Output each value for each element of the 'bidsArray' array
			for( int counter = 0; counter < bidsArray.length; counter++)
				System.out.printf( "%5d%8d\n",  counter, bidsArray[counter]);
				System.out.println("=========================================================");
			
			//return an Object
			return bidsArray;
		}

	// Declare the other methods of the 'BidBook' class
		
	//Write the project introduction to the screen	
		public String writeProjectIntro(String projectIntro) {
			
			projectIntro = projectMessage + projectName;
			
			System.out.println(projectIntro);
			
			//return a String
			return projectIntro;
		}
		
	/* Output the values of the 'bidsArray'...
	 * Comment Out: for(int bid : bidsArray) {
	 */
	
		public int findLowBid(int[] bidsArray) {
						
			for(int i=0; i < bidsArray.length; i++) {
				
				System.out.println("The computer will now evaluate Index: " + i + ", Value: " + bidsArray[i] + " of the 'bidsArray' versus the current value of the variable 'lowBid'");
				System.out.println("The current value of 'lowBid' is equal to " + getLowBid(lowBid) + ".");
				System.out.println("=========================================================");
							
				if( bidsArray[i] < getLowBid(lowBid) ) {
					
					int bid = bidsArray[i];
					
					lowBid = bid;
					
					System.out.println("The lowest bid within the given array of bids is currently: " + lowBid);
				}
				
				else {
					System.out.println("Answer: " + bidsArray[i] + " is NOT less than " + lowBid + ". Therefore, skip through the iteration of Index: " + i);
					System.out.println("=========================================================");
				}
			}
			
			//return an Integer
			return lowBid;	
		}
}