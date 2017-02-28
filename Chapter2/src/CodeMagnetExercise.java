class CodeMagnetsExercise {
	public static void main(String [] args) {
	
	CodeMagnet cm = new CodeMagnet();
	cm.snare = false;
	cm.playSnare();
	
	if (cm.snare == true) {
		cm.playSnare();		
	}
	
	cm.playTopHat();
	
	}
}



//should be
/* 
bang bang ba-bang
ding ding da-ding
*/