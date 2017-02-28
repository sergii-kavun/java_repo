/**
 * Created by skavun on 10/14/2016.
 */
import java.io.*;

public class GameHelper {
    private String UserInput;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException :" + e);
        }
        // Get entered value
        // put it to UserInput variable
        UserInput = inputLine;
        return UserInput;
    }
}

// we need to add here validation for user input to prevent symbols entered and limit amount of symbols to be entered to 1
