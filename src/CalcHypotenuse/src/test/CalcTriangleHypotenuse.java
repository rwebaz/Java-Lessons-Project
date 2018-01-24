package test;

import trianglefix.Triangle;


public class CalcTriangleHypotenuse {

	public static void main(String[] args) {
		
		// The introduction to the program
		System.out.println("==================================================================================================");
		System.out.println("This program will now test the calculation of the hypotenuse of an instance of the Triangle class.");
		System.out.println("==================================================================================================");
		
		// Instantiate an instance Object of the class Triangle
		
		Triangle triangle = new Triangle(20.0,20.0,0.0);
		
		triangle.pythagorusEyes();

	}
}