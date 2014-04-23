package trianglefix;

public class Triangle {
	
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables...
	 * And, as such can be used within the class. Thus, variables declared as 'class' variables are available class-wide. */
		
	// Class variables are identified as 'static' or 'protected' String(s), int(s), and double(s), not 'public'. */
		
	// Declare the class or 'instance' variables of the 'Buffer' class
		
		// The Triangle's 'x' axis of each instance of the subject 'Triangle' class
				protected double x;
				
		// The Triangle's 'y' axis of each instance of the subject 'Triangle' class
				protected double y;
				
		// The Triangle's 'z' hypotenuse of each instance of the subject 'Triangle' class
				protected double z;
				
		// Create the constructor for all future instances of the Triangle class
				
				public Triangle(double x_axis, double y_axis, double z_hypotenuse) {
				
				/* Rename the class variables to accommodate constructor 'this' and to...
					instantiate the variables as 'local' variables of the constructor method Buffer */
					
					x = x_axis;
					y = y_axis;
					z = z_hypotenuse;
				}
				
		// Declare the getter methods of the 'Triangle' class
				
			// Give other methods the right to 'read from' or 'get' the variable 'x' from the Triangle class
				public double getTriangleX() {
					return x;
				}
				
			// Give other methods the right to 'read from' or 'get' the variable 'bufferId' from the Triangle class
				public double getTriangleY() {
					return y;
				}
				
			// Give other methods the right to 'read from' or 'get' the variable 'bufferLimit' from the Triangle class
				public double getTriangleZ() {
					return z;
				}
				
		// Declare the setter methods of the 'Triangle' class
				
			// Give other methods the right to 'write to' or 'set' the variable 'x' from the Triangle class
				public void setTriangleX(double x) {
					this.x = x;
				}
				
			// Give other methods the right to 'write to' or 'set' the variable 'y' from the Triangle class
				public void setTriangleY(double y) {
					this.y = y;
				}
				
			// Give other methods the right to 'write to' or 'set' the variable 'z' from the Triangle class
				public void setTriangleZ(double z) {
					this.z = z;
				}
				
		// Declare the method or 'local' variables of the 'Triangle' class within their respective methods
				
				/* Note: Variable(s) declared within methods are deemed 'local' variable(s)...
				 * And, as such can only be used by their parent method. */
							
				// Find the hypotenuse of a right triangle
					
					public double pythagorusEyes() {
						
						/* Pythagorus Rule: The hypotenuse 'z' of a right triangle can be found...
						 * by taking the square root of adding the respective squares of the other two sides 'x' and 'y' */
						
						double z = Math.sqrt(x*x + y*y);
						System.out.println("" + z + " is the hypotenuse of the subject triangle.");
						return z;
					}
}