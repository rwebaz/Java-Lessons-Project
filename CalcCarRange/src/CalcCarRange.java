
public class CalcCarRange {
	public static void main (String[ ] args) {

		// instantiate two Objects of the 'Vehicle' class
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		/* assign values to the fields of new Object 'minivan'
			Hint: The fields were declared via the accompanying 'Vehicle' class */
		
		minivan.cartype = "Minivan";
		minivan.maxpasajeros = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		minivan.tripdist = 1000;
		
		/* assign values to the fields of new Object 'sportscar'
		Hint: The fields were declared via the accompanying 'Vehicle' class */
		
		sportscar.cartype = "Sportscar";
		sportscar.maxpasajeros = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		sportscar.tripdist = 1000;

		// work that main() method !
		System.out.println("Directive: Query passenger capacity, travel range, and number of gallons required to drive any given set of miles for each vehicle");
		System.out.println("==================================================================================================================================");
		
		// Object 'minivan' new
		
		// invoke or 'call' the passenger_capacity() method from the 'Vehicle' class for the new Object 'minivan'
		minivan.passenger_capacity();
		
		// invoke or 'call' the 'print_passenger_capacity() method from the 'Vehicle' class for the new Object 'minivan'
		minivan.print_passenger_capacity();
		
		// invoke or 'call' the calc_max_range() method from the 'Vehicle' class for the new Object 'minivan'
		minivan.calc_max_range();
		
		// invoke or 'call' the print_range() method from the 'Vehicle' class for the new Object 'minivan'
		minivan.print_max_range();
		
		// invoke or 'call' the fuel_required() method from the 'Vehicle' class for the new Object 'minivan'
		minivan.fuel_required(1000);
		
		// invoke or 'call' the print_fuel_required() method from the 'Vehicle' class for the new Object 'minivan'
		minivan.print_fuel_required();
		
		// Object 'sportscar' new
		
		// invoke or 'call' the passenger_capacity() method from the 'Vehicle' class for the new Object 'sportscar'
		sportscar.passenger_capacity();
		
		// invoke or 'call' the 'print_passenger_capacity() method from the 'Vehicle' class for the new Object 'sportscar'
		sportscar.print_passenger_capacity();

		// invoke or 'call' the calc_max_range() method from the 'Vehicle' class for the new Object 'sportscar'
		sportscar.calc_max_range();
		
		// invoke or 'call' the print_max_range() method from the 'Vehicle' class for the new Object 'sportscar'
		sportscar.print_max_range();
		
		// invoke or 'call' the fuel_required() method from the 'Vehicle' class for the new Object 'sportscar'
		sportscar.fuel_required(1000);
		
		// invoke or 'call' the print_fuel_required() method from the 'Vehicle' class for the new Object 'sportscar'
		sportscar.print_fuel_required();
		
	}
}