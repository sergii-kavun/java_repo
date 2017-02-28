class EncapsulationTest {
	public static void main (String[] args) {
	
	encapsulation e1 = new encapsulation();
	encapsulation e2 = e1; 
	
	e1.setName("Lee Pearson");
	String nme = e1.getName();
	System.out.println("The name is "+e1.getName());

	e1.setSize(4);
	Integer b = e1.getSize();
	System.out.println("The size is "+b);
	
	
	if (nme == "Lee Pearson") {
		System.out.println("That`s not good, we need to fix it");
		 e2 = e1.makeAllGood();
	}	
		System.out.println("SO the final size and name will be :"+e2.getSize()+" and "+e2.getName());
	}
}