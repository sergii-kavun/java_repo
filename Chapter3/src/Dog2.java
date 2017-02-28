class Dog2 {
	String name;
	public void bark() {
			System.out.println (name + " says  Ruff!!!");
		}
		
	public static void main (String[] args) {
		//make a Dog object and access it
		
		Dog2 d1 = new Dog2();
		d1. name = "Bart";
		d1. bark();
		
		// create a Dog array
		
		Dog2[] myDogs = new Dog2[3];
		// lets put some dog objects in it
		
		myDogs[0] = new Dog2();
		myDogs[1] = new Dog2();
		myDogs[2] =  d1;
		
		// access Dog objects using array notaion
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		// print all dogs name
		System.out.print("Last dogs name is: " + myDogs[2].name);
		System.out.println(myDogs[2].name);
		
		// make a loop and tell to all dogs to bark
		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
			}
		}
	
	


}