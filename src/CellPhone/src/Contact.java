public class Contact {
	
	//instantiate the Object variable 'firstName'
	public String firstName;
	
	//establish getter y setter methods for each Object field
	
	//give other methods the right to 'read from' or 'get' the variable 'firstName'
	public String getFirstName(String firstName) {	
		return firstName;
	}
	
	//give other methods the right to 'write to' or 'set' the variable 'firstName'
	public String setFirstName(String firstName) {
		//write progress to the console
		System.out.println("First Name Initialized To: " + firstName);
		//return a String
		return "First Name Set To: " + firstName;
	}
	
	//instantiate the Object variable 'lastName'
	public String lastName;
	
	//give other methods the right to 'read from' or 'get' the variable 'lastName'
		public String getLastName(String lastName) {
			return lastName;
		}
	
	//give other methods the right to 'write to' or 'set' the variable 'lastName'
	public String setLastName(String lastName) {
		//write progress to the console
		System.out.println("Last Name Initialized To: " + lastName);
		//return a String
		return "Last Name Set To: " + lastName;
	}
	
	//instantiate the Object variable 'phoneNumber'
		public String phoneNumber;
	
	//give other methods the right to 'read from' or 'get' the variable 'phoneNumber'
		public String getPhoneNumber(String phoneNumber) {
			return phoneNumber;
		}
	
		//give other methods the right to 'write to' or 'set' the variable 'phoneNumber'
		public String setPhoneNumber(String phoneNumber) {
		//write progress to the console
		System.out.println("Telephone Number Initialized To: " + phoneNumber);
		//return a String
		return "Phone Number Set To: " + phoneNumber;
	}
	
	//establish the 'call' method to execute a phone call
		public String call(String phoneNumber) {
		//write progress to the console
		System.out.println("Calling: " + phoneNumber + " now!");
		//return a String
		return "Calling " + phoneNumber + " now!";
	}
}