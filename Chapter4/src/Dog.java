class Dog {
	int size;
	String name;
	
	String bite(int numOfUsage, String something) {
		
		while (numOfUsage > 0 ) {			
			
			if (size < 5) {
				System.out.println("Hey its not painy");
			} else {
				System.out.println("Ouch, it was really painfull");
				}
				size = size + (int) (Math.random()*5);
				System.out.println(size);
				numOfUsage = numOfUsage - 1 ;
				
				something = something + "uy";
				System.out.println(something);
		}
			
		if (numOfUsage == 0) {
			return "Hey";	
		} else {
			return "You";
		}
			
	}
		
}
