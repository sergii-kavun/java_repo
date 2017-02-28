class Array {
 public static void main (String [] args) {
	int[] array1; // declare variable that could holds and array
	
	array1 = new int[7]; // create new array with int type and assign it to declared variable
	
	// give to each element of array a value
	array1[0] = 1;
	array1[1] = 2;
	array1[2] = 3;
	array1[3] = 4;
	array1[4] = 5;
	array1[5] = 6;
	array1[6] = 77;
	
	int[] xey = new int[8];
	xey[1] = 11;

	// An array could contain reference variables as well
	
	Dog[] dogArray; // declare dog array variable
		
	dogArray = new Dog[5]; // new dog array with lenght of 5. Dog Array variable with Dog type references to array object
	
	dogArray[0] = new Dog();
	dogArray[1] = new Dog();
	dogArray[3] = dogArray[1];
	
	Dog smallDog = new Dog(); // typycal work with objects
	
	smallDog.name ="Puppy";
	smallDog.$size = 4;
	smallDog.bark();
	smallDog.eat();
	
	dogArray[4] = new Dog();
	dogArray[4].name = "super Small";
	dogArray[4].bark();
	
 }	
}
