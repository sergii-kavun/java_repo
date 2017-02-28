public class Array {
	public static void main (String [] args) {
		String [] array1 = {"Hey", "You", "Yes", "Exctly"};
		String [] array2 = {"Hey", "You", "Bitch", "Yes", "Exctly"};
	
		// identify the length of arrays
		int a1 = array1.length;
		int a2 = array2.length;
		System.out.println("The lengths are: "+a1+" "+a2);
		
		//Create some combination from arrays
		String xay = array1[0] +" " + array1[1] +" " + array2[2] +" " +array1[2] +" "+ array1[3] +" "+array2[1];

		System.out.println("The string is: "+xay);		
	}
}	
