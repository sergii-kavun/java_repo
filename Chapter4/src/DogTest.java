class DogTest {
	public static void main(String[] args) {
		
		Dog [] massd = new Dog[2];
		massd[0] = new Dog();
		massd[1] = new Dog();
		
		int x = 0;
		int y = 1;
		
		while  (x < 2) {
			massd[x].size = y;
			
			if (massd[x].size == 1) {
				massd[x].name = "Smally";				
			} else {
				massd[x].name = "Biggy";
			}
			
			String hey = massd[x].bite(4, "h"); // invoke bite method 4 times passing it argument with int value . Method is waiting some parametr with int value
			
			System.out.println(hey+"-------");
			
			System.out.println("the dog:"+massd[x].name +" says with size"+ massd[x].size);
			x = x + 1;			
			y = y + 5;
		}
	}

}