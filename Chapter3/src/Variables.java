class Variables {
	public static void main (String [] args) {
	/*
	//Primitives
	-- byte -- 8 bits = -127 to 127
	-- short -- 16 bits = -32768 to 32767
	-- int -- 32 bits = huge
	-- long -- 64 bits = too huge
	
	//delimitted numbers
	-- float -- 32 bits -- has to have f in the end // float d = 32.5f;
	-- double -- 64 bits

	-- boolean = true or false
	-- char --16 bits = 0 to 65535; -- could have symbols and numbers

	*/
	
	boolean isTrue = false;
	boolean checkTrue = isTrue;
	System.out.println(checkTrue);
	
	short bt = 5;
	byte b1 = 120;
	char ch = 300; // when using char to store some symbols we need to use '' and not "". "" is used for Strings
	char ch2 = (char) bt; 
	System.out.println(ch);
	System.out.println(ch2);
	
	float fl = 55.5554585689568f;
	double db = 55.5534563456;
	System.out.println(fl+" "+db);
	
	String x = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
	System.out.println(x);
	
	//should not work as int bigger than byte
	int x1 = 24;
	byte x2 = x1;
	//byte b2 = x1;
	int i = bt;
	int b = b1 + b1; // byte + byte will be integer
	System.out.println(i);
	System.out.println(b);
	
	//Examples
	int g = 17;
	int y = g;
	y = y +10;
	byte b3 = 3;
	byte v = b3;
	//byte k = 128;
	System.out.println(v);
	
	
	//Name convention
	int Xey = 5;
	int _zero = 55;
	short $notZero = 1;
	//byte 1xs = 3; - variables names must not start with numbers; But could have numbers;
	long x12xeasfasfasfqwerw214312351435314y = 12341234;
	double f2 = 54.5;
		
	System.out.println(Xey + _zero + $notZero+ x12xeasfasfasfqwerw214312351435314y + " "+f2);
	
	
	//reference variables.
	Dog myDog;
	/*
		myDog.name = "Puppy";
		myDog.breed = "Hey";
		myDog.size = 50;
	 
	 myDog.bark();
	 */
	 System.out.print(myDog);
		
	}
}