class Chapter4Test2Execution {
	public static void main (String[] args) {
	
	Chapter4Test2 ch2 = new Chapter4Test2();
	
	ch2.setTime("12345");
	String receivedTime = ch2.getTime();
	System.out.println("Time will be: "+ receivedTime);
	
	}

}