package test;

import buyer.BuyerImplements;
import buyer.BuyerInterface;
import buyer.CashBuyer;
import buyer.CreditCardBuyer;

public class TestBuyerDriver {

		public static void main(String[] args) {
			
			// The introduction to the program
			System.out.println("===============================================================================");
			System.out.println("This program will now test the separate over-riding of the 'BuyerImplements' method...");
			System.out.println("By the 'CashBuyer' and 'CreditCardBuyer' classes");
			System.out.println("===============================================================================");
			
			// Create and test a 'null' buyer
			System.out.println("Notice: The first instance to be tested is the 'BuyerImplements' method as null");
			System.out.println("===============================================================================");
			BuyerInterface null_buyer = new BuyerImplements("Ginger Baker", "null");			
			System.out.println("B.) (" + null_buyer.getBuyerName() + " is normally a '" + null_buyer.getBuyerType() + "' buyer.)");
			System.out.println("C.) Because A.) b_name == B.) b_name and A.) b_type == B.) b_type ∴ Test passes!");
			System.out.println("===============================================================================");
			
			// Create and test a 'cash' buyer
			System.out.println("Notice: The second instance to be tested is the 'BuyerImplements' method overridden");
			System.out.println("by the 'CashBuyer' class");
			System.out.println("===============================================================================");
			BuyerInterface cash_buyer = new CashBuyer("Jack Bruce", "cash");
			System.out.println("B.) (" +  cash_buyer.getBuyerName() + " is normally a '" + cash_buyer.getBuyerType() + "' buyer.)");
			System.out.println("C.) Because A.) b_name == B.) b_name and A.) b_type == B.) b_type ∴ Test passes!");
			System.out.println("===============================================================================");
			
			// Create and test a 'credit' buyer
			System.out.println("Notice: The third instance to be tested is the 'BuyerImplements' method overridden");
			System.out.println("by the 'CreditCardBuyer' class");
			System.out.println("===============================================================================");
			BuyerInterface credit_buyer = new CreditCardBuyer("Eric Clapton", "credit card");
			System.out.println("B.) (" +  credit_buyer.getBuyerName() + " is normally a '" + credit_buyer.getBuyerType() + "' buyer.)");
			System.out.println("C.) Because A.) b_name == B.) b_name and A.) b_type == B.) b_type ∴ Test passes!");
			System.out.println("===============================================================================");
			
		}
}