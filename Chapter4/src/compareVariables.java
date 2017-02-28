class compareVariables {
	public static void main(String [] args) {
			
		// We can comapre primitive variables using == operator
		// types of comparing variables might not be the same to be able to compare
		boolean xey = true;
		boolean xey2 = true;
		int x = 5;
		byte z =5;
		
		if (xey == xey2) {
			System.out.println("Xey: "+xey+" Xey2: "+xey2);
		}
		
		if (x == z) {
			System.out.println("Xey: "+x+" Xey2: "+z);
		}
		// We can compare reference variables refer to a single object on the heap by using == operator
		
		compareVariables c1 = new compareVariables();
		compareVariables c2 = new compareVariables();
		
		if (c1 == c2) {
			System.out.println("c1 and c2 reference variables DO refer to the same object");
		} else {
			System.out.println("c1 and c2 reference variables DO NOT refer to the same object");
		}
		
		// IF we need to compare OBJECTS. For that we need to use .equals() method
		String s1 = new String("Hey you!");
		String s2 = new String("Hey you!");
		
		
		
		
		if (s1 == s2) { // here we will be comparing not objects but references to objects!!!
			System.out.println("s1 and s2 reference variables DO refer to the same object");
		}
		
		if (s1.equals(s2)) {  // here we are conparing OBJECTS with equals method
			System.out.println("OBJECTS are the same");
			
			
		// REMEMBER that STRING is an object and have to be used with equals method
		String s3 = new String("Hey you!");
		String s4 = new String("Hey you2!");
		
		s3.equals(s4);
		
		}
	}
}