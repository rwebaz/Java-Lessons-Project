
public class Main {
	
		public static void main(String[] args) {
			
			FortuneTeller fortuneTeller = new FortuneTeller();
			
			String myFortune;
			
			myFortune = fortuneTeller.tellFortune();
				System.out.println(myFortune);
				
			myFortune = fortuneTeller.tellLongLastingFortune("", 20);
				System.out.println(myFortune);
				
			myFortune = fortuneTeller.tellPersonalFortune("Robert");
				System.out.println(myFortune);
				
			myFortune = fortuneTeller.tellPersonalLongLastingFortune("Robert", 20);
				System.out.println(myFortune);
				
			return;
				
		}
}