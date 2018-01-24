public class ContactTestDriver {
	
	public static void main(String[] args) {
		
		//create a new Object named 'contact' from the Contact class
		Contact contact = new Contact();
		
		//assign values to the Object variables
		contact.firstName = "Robert";
		contact.lastName = "Weber";
		contact.phoneNumber = "800-999-0000";
		
			String firstName = "Robert";
			//give other methods the right to 'read from' or 'get' the variable 'firstName'
			contact.getFirstName(firstName);
			
			//give other methods the right to 'write to' or 'set' the variable 'firstName'
			contact.setFirstName(firstName);
			
			String lastName = "Weber";
			
			//give other methods the right to 'read from' or 'get' the variable 'lastName'
			contact.getLastName(lastName);
			
			//give other methods the right to 'write to' or 'set' the variable 'lastName'
			contact.setLastName(lastName);
			
			String phoneNumber = "800-999-0000";
			
			//give other methods the right to 'read from' or 'get' the variable 'phoneNumber'
			contact.getPhoneNumber(phoneNumber);
			
			//give other methods the right to 'write to' or 'set' the variable 'phoneNumber'
			contact.setPhoneNumber(phoneNumber);
			
			//execute a phone call w the 'call' method declared in the 'Contact' class
			
			contact.call(phoneNumber);
			
			return;
	}
}