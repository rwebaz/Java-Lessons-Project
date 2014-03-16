
public class FortuneTeller {
	
	public Number tellNewAge(int years) {
		int newAge = years + 10;
			return newAge;
	}
	
	public String tellFortune() {
		String theFortune = "You will have good luck.";
			return theFortune;
	}
		
	public String tellLongLastingFortune(String name, int years) {
		int newAge = years + 10;
		String theFortune = "You will have good luck for " + newAge + " years!";
			return theFortune;
	}
		
	public String tellPersonalFortune(String name) {
		String theFortune = name + "...you will have good luck!";
			return theFortune;
	}
		
	public String tellPersonalLongLastingFortune(String name, int years) {
		int newAge = years + 10;
		String theFortune = name + ", you will have good luck for " + newAge + " years!";
			return theFortune;
	}
		
}