/**
 * Created by vid4i on 27.09.2016.
 */
public class DotCom {

     /*  REPCODE
    // prepcode give us understanding what code needs to do
    // real code give us idea how this code needs to do that

    // declare checkYourself method that takes STRING and checks it and return a result hit miss or kill;

    String checkYourself (String UserGuess) {
        // GET user guess as String parameter
        // Convert user guess from String to int
        // LOOP for each location cell in int array
            // COMPARE user guess to location cell
            //IF user guess matched
                // INCREMENT the number of hits
                // FIND OUT if it was last location cell
                // IF number of hits is 3, RETURN "Kill"
                     // ELSE return "HIT"
                // END IF
            //ELSE User guess did not match RETURN MISS
            //END IF
        return String;
    }

    // declare set location method that takes int array which jas 3 cell location as location

    public void setLocationCells(int[] location) {
       // GET cell location from location parameter as int array
        // Assign cell location parameter to cell location instance variable
        locationCells = location;
    }

    */
// -----------------------------------------
// REAL CODE implementation
     private int[] locationCells; // declare an int array to hold location
     private int numOfHits=0; //  declare int to hold number of shots SET to 0

    public void setLocationCells(int [] LocationArray) {

        locationCells = LocationArray;
    }

    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt(stringGuess);  // convert String to int and put it to local variable guess

        String result ="miss";  // create a variable to hold default result with negative value miss

        for (int cell : locationCells) { // loop for each element of array we are assigning cell variable
            if (cell == guess) {  // compare user guess to the cell element of array
                result = "hit";
                numOfHits ++;
                break;  // break the loop and out if there is no need to go test other cells
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";  // check whether we hot 3 times that means we are killed
        }
        System.out.println(result);  // show the result

        return result;  // return result back to calling method
    }
}

