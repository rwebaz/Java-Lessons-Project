public class Dog {
	
	//instantiate the Object variable 'name' of dog
		public String name;
		
	//give other methods the right to 'read from' or 'get' the variable 'name'
		public String getName(String name) {	
			return name;
		}
		
	//give other methods the right to 'write to' or 'set' the variable 'name'
		public String setName(String name) {
		//write progress to the console
		System.out.println("Name of Dog Initialized To: " + name);
		//return a String
			return name;
		}
	
	//instantiate the Object variable 'age' of dog
		public int age;
		
	//give other methods the right to 'read from' or 'get' the variable 'age'
		public int getAge(int age) {	
			return age;
		}
				
	//give other methods the right to 'write to' or 'set' the variable 'age'
		public int setAge(int age) {
		//write progress to the console
		System.out.println("Age of Dog Initialized To: " + age);
		//return a String
			return age;
		}
		
	//instantiate the Object variable name of 'owner'
		public String owner;
	
	//give other methods the right to 'read from' or 'get' the variable 'name'
		public String getOwner(String owner) {	
			return owner;
		}
				
	//give other methods the right to 'write to' or 'set' the variable 'name'
		public String setOwner(String owner) {
		//write progress to the console
		System.out.println("Name of Owner Initialized To: " + owner);
		System.out.println("=======================================");
		System.out.println("Test Drive That Dog!");
		System.out.println("=======================================");
		//return a String
			return owner;
		}	
		
	//establish the 'whatDog' method to return the name and age of the dog
		public String whatDog(String owner, String name, int age) {
		//write progress to the console
		System.out.println("" + name + "!..." + owner + " is calling " + name + " now!");
		System.out.println("" + name + " is " + age + " years old.");
		//return a String + integer
			return name + age;
	}
		
	//establish the 'whoseDog' method to return the name of the owner
		public String whoseDog(String owner) {
		//write progress to the console
		System.out.println("The owner's name (in case you missed it) is " + owner + ".");
			return owner;
	}
}