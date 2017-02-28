class DVDPlayerTestDrive {
	public static void main(String[] args) {
	
	DVDPlayer dv = new DVDPlayer();
	
	dv.canRecord = true;
	dv.playDVD();
	
	if (dv.canRecord == true) {
		dv.recordDVD();
		}
	}
}