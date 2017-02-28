public class ClassBitch {
	public static void main (String[] args) {
		System.out.print("Hey you ");
		System.out.println("Dirty Bitch");
		System.out.println("Lets get ready");
		
		//COde starts
		
		double xey = 5;
		String nameless = "Sick";
		System.out.println("xey is defined as:"+xey);
		xey = xey/2;
		System.out.println("xey is equal to:"+xey);
		
		//Cycles 
		System.out.println("Will try to use Cycles here: while x >1 decrease on 0.5");
		while (xey>1) {
			xey= xey - 0.5;
			System.out.println("xey is equal to:"+xey);
		}
		
		//more complexity
		if (xey>=1) {
			System.out.println("xey is finally equal to:"+xey+" and you name is "+nameless);
		} else {
			System.out.println("Soryan");
		}
		
		// lets use for cycle
		if ((xey == 1.0) & (nameless.equals("Sick"))) {
			for (int y=0; y < 10; y = y + 1) {
				System.out.println("y is equal to:"+y);
			}
		} 
		System.out.println("as for now we have all variables:"+xey+" name: "+nameless);
	
	// LOOPS TYPES 
	
	/*
	 1. While is standrad one 
	 
	 while (if cosme condtition is true has to result in boolean value (true or false)) {
		code here will be executed
		}
	*/	
	// --Example
		
		int x=2;
		while (x>0) {
			x=x-1;
		}
		System.out.println("x equal to"+x);
		
		int z=27;
		while (z==17) {
			System.out.println("Something wrong here"+z);
		}
	
	// While with boolean
		boolean sss=true;
		System.out.println("sss out of the loop"+sss);
		while (sss) {
			sss = false;
			System.out.println("sss in the loop:"+sss);
		}
	
	
	}
}

