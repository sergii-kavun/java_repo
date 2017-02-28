class DogTestRide {
	public static void main (String [] args) {
			
		Cat ct = new Cat();
		
		ct.name = "Kitty";
		ct.size = 10;
		ct. word = "Meow";
		
		ct.meow();
		
		Dog d = new Dog();
		
		d.name = "Puppy like " + ct.name;
		d.breed = "Hey";
		d.size = 50;
		
		d.bark();
	}
}