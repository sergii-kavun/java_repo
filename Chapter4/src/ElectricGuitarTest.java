class ElectricGuitarTest {
	public static void main(String[] args) {
		
		ElectricGuitar g1 = new ElectricGuitar();
		g1.brand = "Fender";
		//g1.setBrand("Gibson");
		String GuitarBrand = g1.getBrand();
		System.out.println(GuitarBrand);
		
		int Pickups = 3;
		g1.setNumOfPickups(Pickups);
		int GuitarPickups = g1.getNumOfPickups();
		System.out.println("Num of pickups at "+GuitarBrand+" brand is: "+GuitarPickups);
		
		if (Pickups == GuitarPickups) {
			System.out.println("Expected quantity of pickups!");
		} else {
			System.out.println("Not expected quantity of pickups");
		}
		
		g1.setRockStarUsesIt(true);
		boolean rock = g1.getRockStarUsesIt();
		System.out.println(rock);
	}

}