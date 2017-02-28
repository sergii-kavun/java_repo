class GarbageCollector {
	public static void main (String [] args) {
		// create 2 reference variables and assign to them new Book objects;
		Book b1 = new Book();
		Book b2 = new Book();
		b2.name = "Master";
		
		// Declare new Book reference variable and assign already existen reference variable
		Book b3 = b2;
		b3.name = "Margarita";
		
		System.out.println(b2.name);
		
		// assign one to another
		b2 = b1;
		
		System.out.println(b1.name);
		
		//-----------------------------------------------//
		
		
		Book b = new Book();
		Book c = new Book();
		
		b = c; // that means that first objet that was referenced by b is unusable abandoned and GC will kill it
		c = null; // we remove any references from reference variable c		
	}
	
}