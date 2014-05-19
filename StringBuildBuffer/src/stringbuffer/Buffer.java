package stringbuffer;

public class Buffer {
		
	/* Note: Variables declared outside of methods are deemed to be 'instance' or 'class' variables and as such...
	* can be used within the class. Thus, variables declared as 'class' variables are available class-wide. */
		
	// Class variables are identified as 'static' or 'protected' String(s), int(s), and double(s), not 'public'. */
		
	// Declare the class or 'instance' variables of the 'Buffer' class
		
		// The Buffer's initial string of each instance of the subject 'Buffer' class
				protected String x;
				
		// The Buffer's secondary string for each instance of the subject 'Buffer' class
				protected String y;
				
		// The Buffer's tertiary string for each instance of the subject 'Buffer' class
				protected String z;
				
		// Create the constructor for all future instances of the Buffer class
				
				public Buffer(String x_buffer, String y_buffer, String z_buffer) {
				
				/* Rename the class variables to accommodate constructor 'this' and to...
					instantiate the variables as 'local' variables of the constructor method Buffer */
					
					x = x_buffer;
					y = y_buffer;
					z = z_buffer;
				}
				
	// Declare the method or 'local' variables of the 'Buffer' class within their respective methods
				
	/* Note: Variable(s) declared within methods are deemed 'local' variable(s)...
	 * And, as such can only be used by their parent method. */
				
	// Loop through three instantiations of separate string-blocks
				
				/* String For(x,y,z) {
					// TODO Auto-generated method stub
				} */
				
		// Declare the Accessor getter methods of the 'Buffer' class
				
			// Give other methods the right to 'read from' or 'get' the variable 'x' from the Buffer class
				public String getBufferX() {
					return x;
				}
				
			// Give other methods the right to 'read from' or 'get' the variable 'bufferId' from the Buffer class
				public String getBufferY() {
					return y;
				}
				
			// Give other methods the right to 'read from' or 'get' the variable 'bufferLimit' from the Buffer class
				public String getBufferZ() {
					return z;
				}
				
		// Declare the Accessor setter methods of the 'Buffer' class
				
			// Give other methods the right to 'write to' or 'set' the variable 'x' from the Buffer class
				public void setBufferX(String x) {
					this.x = x;
				}
				
			// Give other methods the right to 'write to' or 'set' the variable 'y' from the Buffer class
				public void setBufferY(String y) {
					this.y = y;
				}
				
			// Give other methods the right to 'write to' or 'set' the variable 'z' from the Buffer class
				public void setBufferZ(String z) {
					this.z = z;
				}
}
