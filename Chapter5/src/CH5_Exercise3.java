/**
 * Created by vid4i on 13.11.2016.
 */
public class CH5_Exercise3 {
    public static void  main (String[] args) {
        int x = 0;
        int y = 30;

        for (int outer =0; outer < 3; outer++) { // repeat 3 times
            for (int inner=4; inner > 1; inner--) {  // repeat 3 times

                //candidate
                x--;

                y = y - 2;

                if (x==6) {
                    break;
                }
                x = x + 3;
            }
            y = y -2;
        }
        System.out.println(x + " " + y);
    }

}
