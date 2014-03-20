public class DogTestDrive {

	public static void main(String[] args) {
			
		//create a new Object named 'dog' from the Dog class
		Dog dog = new Dog();
		
		//assign values to the Object variables
		dog.name = "Fido";
		dog.age = 4;
		dog.owner = "Fred";
			
			String name ="Fido";
			//give other methods the right to 'read from' or 'get' the variable 'name'
			dog.getName(name);
			
			//give other methods the right to 'write to' or 'set' the variable 'name'
			dog.setName(name);
			
			int age = 4;
			//give other methods the right to 'read from' or 'get' the variable 'age'
			dog.getAge(age);
			
			//give other methods the right to 'write to' or 'set' the variable 'age'
			dog.setAge(age);
			
			String owner = "Fred";
			//give other methods the right to 'read from' or 'get' the variable 'age'
			dog.getOwner(owner);
			
			//give other methods the right to 'write to' or 'set' the variable 'age'
			dog.setOwner(owner);
			
			//execute two reporting methods declared in the 'Dog' class
			
			dog.whatDog(owner, name, age);
			
			dog.whoseDog(owner);
			
			return;
	}
}