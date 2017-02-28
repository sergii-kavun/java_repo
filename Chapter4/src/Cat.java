class Cat {
	String name;
	byte size;
	
	
	// Methods with VOID will not return any value
	// methods with NO VOID have to return something with declared type
	// methods could receive arguments from caller code and use it as parametrs - for some internal logic
	// if the method has several parameters, caller has to pass arguments with right type and ORDER
	
	
	char meow(int NumOfMeows, String subName) {
	
		while (NumOfMeows > 0 ) {
			System.out.println("Meoooooow");
			NumOfMeows = NumOfMeows - 1;
		}
		
		if (subName == "Pussy") {
			return 'z'; 
		} else {
			return 'x';
		}
		
	}
	
	void bark(int z1, int z2) {
		if (z1 == z2) {
			System.out.println("I`m not barking bitch");			
		} else {
			System.out.println("I could try to barck if you want");	
		}	
	}
	
	//we can pass variables values into the method considering variable types matche methods parametrs types
	
	void scream (long l1, long l2) {
		
		long Scr = (l1 + l2) - 1;
		if (Scr >= (l1+l2)) {
			System.out.println("Sreaaaam");
		} else {
			System.out.println("I can not scream");
		}
	}
	
	long go(int zz) {
		double zz2 = zz + (Math.random()*156);
		System.out.println("I`m going "+zz);	
		
		int ss2 = (int) zz2 + (int) (Math.random()*10);
		System.out.println("I`m going "+ss2);
		
		return 122;
	}
	
	
	void like(Cat m) {
		m.name = "Kittty";
	}
	
	//we are trying to return an array to caller
	
	int[] dontLike(int x,int y, int z) {
		System.out.println("I need to return an array");
		int[] arr1 = new int[3];
		arr1[0] = x;
		arr1[1] = y;
		arr1[2] = z;
		
		return arr1;
		
	}
	
}