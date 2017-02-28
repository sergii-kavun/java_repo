public class Phrase {
	public static void main (String [] args) {
	
	String [] wordListOne = {"Hey", "You", "Bitch", "Soon", "Best", "Make", "At the best", "positive","Satisfied"};
	String [] wordListTwo = {"Quick", "Fast", "In Time", "Much faster", "On time", "will be", "With common target", "Team"};
	String [] wordListThree = {"Process","Solution","Goal","Client","Customer", "Mission", "Purpose", "Plan"};
	
	//to find out how many words are in each list
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;
	System.out.println(oneLength);
	
	
	//will generate three random numbers
	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);
	
	System.out.println(rand1);
	
	//lets build the phrase
	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
	
	// Out the results
	
	System.out.println("The prhrase is " + phrase);
	}
}