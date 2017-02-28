class goodCat {
	private byte size;
	private String name;
	private int pii;
	private String vasya;

	public void setSize(byte CatSize) {
		if (CatSize >= 10) {
			System.out.println("System is not expecting such a big cat size. Please try again");
		} else {
			size = CatSize;
		}
	}
	
	public byte getSize() {
		return size;
	}
	
	void meow() {
		if (size > 5) {
			System.out.println("MEOOOOW > 5");
		} else {
			if (size > 3 ) {
				System.out.println("Meooowwww > 3");
			} else {
				System.out.println("Meow");
			}
		}
		
	}
	
	public void setPii (double pii2) {
		if ( pii2 >= 5.5 ) {
			pii = (int) Math.round(pii2);			
		} else {
			System.out.println(pii2+" Value is inccorect");
			pii = 000;
		}	
	}
	
	public int getPii() {
		return pii;
	}
	
	public String getVasya() {
		//String Vasya2; // Should not work as local variables doesn`t have default values;
		//return Vasya2; 
		return vasya;
	}
}