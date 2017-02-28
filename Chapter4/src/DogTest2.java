class DogTest2 {
	public static void main (String [] args) {
		int x = 0;
		int y = 1;
		Dog d1 = new Dog();
		Dog [] dd = new Dog[3];
		
		while (x < 3) {
		dd[x] = d1;
		x = x + 1;
		}
		
		d1.name = "tidddy";
		
		System.out.println(dd[1].name + dd[2].name);
	}
}