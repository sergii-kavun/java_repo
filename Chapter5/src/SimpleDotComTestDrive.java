/**
 * Created by skavun on 9/28/2016.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {


    /* TEST CODE -- Create test code before real code to verify your concept and to prepare test to validate it beforehand

    1. Create an DotCom  object
    2. Assign it location
    3. Create a String to emulate user guess
    4. Invoke checkYourself() method passing String a sa user guess
    5. Print out the result to see if its correct

        // we are still not covered KILL/MISS scenario and incrementaion of number of Hits
        // we are not covering setter location method

    */

        DotCom dot1 = new DotCom(); // create a new DotCom object
        int[] LocationArray = {2,3,4};  // create and int array with location to be assigned

        dot1.setLocationCells(LocationArray); // invoke setter method to assign location

        String fakeUserGuess = "2"; // create fake user guess in the correct range to verify  checkYourSelf method

        String result = dot1.checkYourself(fakeUserGuess);  // Invoke checkYourself() method passing String asa user guess and returning result as String

        String testResult = "Failed";

        if (result.equals("hit")) {  // check if the fake guess 2 return hit then method works correctly
            testResult = "Passed";

        }
        System.out.println(testResult); // print out the  test result (passed or failed)

    }
}