public class Vehicle {

	// declare four instance variables of the class 'Vehicle'
	String cartype; // declares car type for each 'Vehicle' Object
	int passengers; // declares the max passenger capacity for each 'Vehicle' Object
	int fuelcap; // declares the max fuel capacity for each Vehicle' Object
	int mpg; // declares the MPG for each 'Vehicle' Object
	int range; // declare the range in miles for each 'Vehicle' Object
	int tripdist; // declare the distance in miles for each trip taken
	double gall; // declare the number of gallons of gasoline required for each trip taken

	// place the class 'Vehicle' specific methods here within the 'Vehicle' class
	
	public double fuel_required (int tripdist) {
		gall = tripdist / mpg;
		return gall;
	}
	
	public double range_maker () {
		range = fuelcap * mpg;
		return range;
	}
	
	public void passenger_capacity() {
		System.out.print("For Car Type: " + cartype + "");
		System.out.println("\nFrom the passenger_capacity() method (located in the 'Vehicle' class):");
		System.out.println("\nHow many passengers can your " + cartype + " carry?");
	}
	
	public void print_passenger_capacity() {
		System.out.print("Answer: Your " + cartype + " can carry a max of " + passengers + " passengers.");
		System.out.print("\n");
	}
	
	public void calc_range() {
		System.out.println("\nFrom the calc_range() method (located in the 'Vehicle' class):");
		System.out.println("\nHow many miles can your " + cartype + " travel on one tank of gas?");
	}
	
	public void print_range() {
		System.out.println("Answer: The max travel range for your " + cartype + " is " + range + " miles.");
	}
	
	public void print_fuel_required() {
		System.out.println("\nFrom the fuel_required() method (located in the 'Vehicle' class):");
		System.out.println("\nHow many gallons of gasoline are required to drive your " + cartype + " " + tripdist + " miles?");
		System.out.println("Answer: The number of gallons required to drive your " + cartype + " " + tripdist + " miles is " + gall + " gallons.");
		System.out.println("=========================================================================================");
	}
}