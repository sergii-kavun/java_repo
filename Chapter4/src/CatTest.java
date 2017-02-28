class CatTest {
	public static void main (String [] args) {
		
		Cat kitty = new Cat();
		kitty.size = 5;
		
		char c1 = kitty.meow(2, "notpussy");
		
		if (c1 == 'x') {
			System.out.println("xxxxx");
		} else {
			System.out.println("not xxx");
		}
	
		//declare variables that could be passed as arguments to a scream method
		int s1 = 16;
		int s2 = 16;
	
		Cat cat1 = new Cat();
		cat1.bark(1,2);
		
		// we can pass to a method 2 arguments as variables with int type. Method is waiting 2 parametrs with long type. As Long > int it should work
		cat1.scream( s1, s2 );
		
		
		int qq = 6;
		int ww = (int) cat1.go(qq); // casting of returning type from long to int
		
		System.out.println("QQ will be equal to : "+qq);
		
		// we can pass reference variable to an object as an argumenta and change it insode method 
		
		Cat c11 = new Cat();
		Cat c22 = new Cat();
		
		c11.like(c22); // we are passing reference variable cc2 to Cat object to method like and in this method we are using instance variables of that method
				
		System.out.println(c22.name+" say hello");
		
		int[] arr2 = c22.dontLike(1,2,3); // we are getting return from dontLike method as array
		
		int i = 0;
		while (i < arr2.length) {
			System.out.println(arr2[i]);
			i++;
		}
				
	}
}