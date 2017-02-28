public class Chapter4Test3 {
	int counter =0;
	
	public static void main (String[] args) {
		int count = 0;
		Chapter4Test3 [] m4a = new Chapter4Test3[20];
		int x = 0;
		
		while (x < 19) {
			m4a[x] = new Chapter4Test3();
			m4a[x].counter = m4a[x].counter + 1;
			count = count + 1;
			count = count + m4a[x].maybeNew(x);
			x = x + 1;
		}
		System.out.println(count + " result " +m4a[1].counter);
	}
	
	
	public int maybeNew(int index) {
		if (index < 1) {
		Chapter4Test3 m4 = new Chapter4Test3();
		m4.counter = m4.counter + 1;
		return 1;
		}
		return 0;
	}

}