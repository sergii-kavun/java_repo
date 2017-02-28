class Chapter4Test1 {
		public static void main (String[] args) {
			int orig = 42;
			
			Chapter4Test1 ch1 = new Chapter4Test1();
			int y = ch1.go(orig);
			System.out.println(orig + "Result" +y);
		
		}
		
		int go (int arg) {
			arg = arg * 2;
			return arg;
		}
}