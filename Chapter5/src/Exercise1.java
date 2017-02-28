/**
 * Created by vid4i on 03.11.2016.
 */
public class Exercise1 {
    public static void main (String [] args) {

        Exercise1 ex1 = new Exercise1();
        ex1.go();
    }

    public void go() {
        int y = 7;

        for (int x=1; x<8; x++) {
            y++;

            if (x > 4) {
                System.out.print(++y + " ");
            }

            if (y>14) {
                System.out.println("x = " + x);
                break;
            }
        }

    }
}
