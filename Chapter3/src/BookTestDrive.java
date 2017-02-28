class BookTestDrive {
	public static void main (String[] args) {
		
		Books[] myBooks = new Books[3];
		int x = 0;
		
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();   
		
		
		myBooks[0].title = "safsf0";
		myBooks[1].title = "asdfasf1";
		myBooks[2].title = "Java rules2";
		
		myBooks[0].author = "me0";
		myBooks[1].author = "he1";
		myBooks[2].author = "she2";
		
		while ( x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x + 1;
			
		}
	}
}