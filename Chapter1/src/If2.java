public class If2 {
	public static void main (String [] args) {
		int w = 5;
		
		while (w < 10) {
				
			if (w == 4) {
				w = w + 5;
				System.out.println("w is equial to: "+w);
			} else {
				w = w + 1;
				System.out.println("w is equial to: "+w);
			}
		}
		System.out.println("w is equal to and we are out of while loop: "+w);
	}
	
}