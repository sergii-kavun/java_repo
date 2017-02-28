class goodCatTest {
	public static void main (String[] args) {
			
		goodCat[] catArray = new goodCat[5];
		catArray[0] = new goodCat(); 
		catArray[1] = new goodCat();  
		catArray[2] = new goodCat(); 
		catArray[3] = catArray[2]; 
		catArray[4] = new goodCat();
		
		int i = 0;
		int x = 0;
		
		//catArray[0].size = 10; // this should not work as size instance variable is PRIVATE
		
				
		while ( i < catArray.length ) {
			x = (i*2) + 3;
			catArray[i].setSize((byte) x);
			System.out.println("The Cat "+i+" "+"Has size: "+catArray[i].getSize());
			catArray[i].meow();
			i++;
		}
		
		System.out.println("Cat 2 has size inheritanced from Cat 3: "+catArray[2].getSize());
		//------------------
		
		catArray[0].setPii(5.88);
		System.out.println("The Pii will be: "+catArray[0].getPii());
		
		
				
		double z1 = (15 + catArray[0].getPii()) /2.5;
		System.out.println(z1);
		System.out.println("Cat value of 4 will be :" + catArray[4].getSize());
	
	// Variables declaration principles
	// While declaring variable it needs just NAME and TYPE but it will have DEFAULT values;
		
		boolean xx;
		String zz;
		
		System.out.println(catArray[4].getVasya()); // in this case getSize method will return default values of variable
		
	// INITIALIZATION of variable means you assign some value to it;
		xx = true;
		catArray[4].setSize(); // this should not work as we are calling setSize method without argument 
			
	}
	
}