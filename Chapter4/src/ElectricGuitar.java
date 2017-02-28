class ElectricGuitar {
	String brand;
	int numOfPickups;
	boolean rockStartUsesIt;

	String getBrand() {
		return brand;
	}
	
	void setBrand(String aBrand) {
		brand = aBrand;
	}
	
	int getNumOfPickups() {
		return numOfPickups;
	}
	
	void setNumOfPickups(int pNum) {
		if (pNum == 1) {
		numOfPickups = pNum + 1;
		} else {
		numOfPickups = pNum - 1;
		}
				
	}
	
	boolean getRockStarUsesIt() {
		return rockStartUsesIt;
	}
	
	void setRockStarUsesIt(boolean RockStar) {
		rockStartUsesIt = RockStar;		
	}
	
}
