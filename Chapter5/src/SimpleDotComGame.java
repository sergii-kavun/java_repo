/**
 * Created by skavun on 9/28/2016.
 */

/*
--PREPCODE

Main method  - public static void main (String [] args)

    Declare an int variable to hold the number of user guesses, named numOfGuesses;
 --   Declare String variable to holds userGuess;

    1.Create an DotCom object;
    2.Declare INT array to hold random location of ship limited to 3 elements
    3.Compute a random number between 0 and 4 that will be starting location cell position
    4.Assign randomly generated number to start point of an array and increment by 1 consequtively with x++
    5.Assign location to object by passing it argument to setLocation method as an array
    6.Declare a boolean variable representing the state of the game, named isAlive.Set it ti TRUE by default

    7. WHILE the dot com i still alive while isAlive variable is true is true
        8. Ask user to guess by prompting him a message enter a number and put it to some userGuess variable
        9. GET user input from command line
        10. Invoke checkYourself method on DotCom object passing it UserGuess variable
        11. Increment numOfGuesses

        12. If checkYourself result is kill
            13. Set isAlive variable to false
            14. Print Number of guesses
       15.END if
    16. END WHILE


 */


public class SimpleDotComGame {
            public static void main (String[] args) {
            // local variables
                int NumOfGuesses = 0;
                GameHelper helper = new GameHelper();  // special class that has method for getting user input

            //1. Create an DotCom instance
                DotCom ship1 = new DotCom();

            //2. Declare INT array to hold random location of ship limited to 3 elements
                int[] ShipArray = new int[3];

            //3. Compute a random number between 0 and 4 that will be starting location cell position
                int randomNum = (int) (Math.random() * 5);

            //4. Assign randomly generated number to start point of an array and increment by 1 consequtively with x++
                ShipArray[0] = randomNum;
                ShipArray[1] = randomNum+1;
                ShipArray[2] = randomNum+2;


            // 5.Assign location to object by passing it argument to setLocation method as an array
                ship1.setLocationCells(ShipArray);

            //6.Declare a boolean variable representing the state of the game, named isAlive.Set it ti TRUE by default
                boolean isAlive = true;

             // 7. WHILE the dot com is still alive while isAlive variable is true
                while (isAlive == true) {
                    String guess = helper.getUserInput("Enter a number to guess where ship is");
                    String result = ship1.checkYourself(guess);
                    NumOfGuesses++;

                        if (result.equals("kill")) {
                            isAlive = false;
                            System.out.println("Number of guesses is :" + NumOfGuesses);
                        }

                }

        }
}