class TestSong {
	public static void main (String [] args) {
		char x;
		char x2 = 'b';
		byte x3 = 12;
		char b1 = (char) x3;
		
		Song s1 = new Song();
		x = s1.play(1,"Hey");
		System.out.println(""+x+x2+x3+b1);
		
	}	
}