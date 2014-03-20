import java.util.*;

public class AddressBook
	{
	private List<Contact> contactList = new ArrayList<Contact>();
	private int fontSize = 10;

	public Contact findContact(String searchString)
		{
		Contact theContact = null;
		for (Contact contact : contactList)
			{
				if (contact.getFirstName(searchString).equals(searchString)) 
					{
						theContact = contact;
						break;
					}
					
			}
		
		return theContact;
		}
	
	public Contact addNewContact(String firstName, String lastName, String phoneNumber) {
		Contact theContact = new Contact();
		theContact.setFirstName(firstName);
		theContact.setLastName(lastName);
		theContact.setPhoneNumber(phoneNumber);
		contactList.add(theContact);
		
		return theContact;
	}
	
	public Contact editContact (Contact theContact, String newFirstName, String newLastName, String newPhoneNumber) {
		theContact.setFirstName(newFirstName);
		theContact.setLastName(newLastName);
		theContact.setPhoneNumber(newPhoneNumber);		
		
		return theContact;			
	}
	
	public void deleteContact (Contact contact)
		{
		contactList.remove(contact);			
		}
	
	public void synchronizeWithComputer()
		{
		// cool feature to be added later		
		System.out.println("Synchronizing cell phone address book with computer database");
		}
	
	public void callContact (Contact contact)
		{
		contact.call(null);
		}
	
	public void displayContactList()
		{
		// in a real cell phone this would display the contact list
		// using the fontSize attribute
		for (Contact contact : contactList)
			{
				System.out.println(contact.getFirstName(null) + " " + contact.getLastName(null) + " " + contact.getPhoneNumber(null));
			}
		
			
		}
	}
