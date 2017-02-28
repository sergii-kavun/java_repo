/**
 * Created by skavun on 10/13/2016.
 */
public class Test {

    static public void sum (int integ1, int integ2) {
        System.out.println(integ1+integ2);
    }

    static public void sum (float fl1, float fl2) {
        System.out.println(fl1+fl2);
    }

    public static void main(String args[]) {
        // Try to convert String to int
        String someNumber;
        double x;

        someNumber="23";
        System.out.println("Show String value: " +someNumber);

        x = (double) Integer.parseInt(someNumber);
        System.out.println("Show converted String "+x);
        //after convertion we could use int as usually;

        int z = (byte)(x*22353156);
        System.out.println("Show arithmetic "+z);

        // This should not work as only numbers as String could be converted to  int
        /*
        String someText= "Tesfgsdgdfxt";
        System.out.println("Show String2 value: " +someText);

        int  y = Integer.parseInt(someText);
        System.out.println("Show String2 converted value: " +y);
        */

        int[] ar1 = {1,2,3};
        int[] ar2 = new int [3]; // in this case elements in array will get default values depending on type


        // TRY OLD for loop with array
            for (int i=0; i<ar1.length; i++ ) {
                ar1[i] = ar1[i]+1;
                System.out.print(ar1[i]+";");
            }
            System.out.println(); // this required to move cursor to the next line

        // OLD FOR LOOP BUT STILL USED

        for (int i=0; i<10; i++) { // it can be used to repeat something X times
            System.out.println(i);
        }
        System.out.println("Done");


        // TRY new FOR loop
        //When loop needs to iterate over elements in array
            for (int t : ar2) {
                t = t+1;
                System.out.print(t+";");
            }
        System.out.println(); // this required to move cursor to the next line

        // TRY MATH.RANDOM

        double randomNum = Math.random(); // this a random number from 0 to 0.99
        System.out.println(randomNum);

        // CAST to other type
        long randomNum2 = (byte) (Math.random()*14); // range of random numbers should be between 0 and 13 as we have made  * 14
        System.out.println(randomNum2);

        // FOR LOOP again new one
        System.out.println("-------NEW FOR LOOP--------------------");

        //create new array with String type and initialize it with values
        String[] arr2 = {"Hey", "You", "Fucker"};

        //for loop to go through each element in array
        for (String xx : arr2) {  // xx variable MUST be the same type like array. XX variable set to NULL by default
            System.out.println(xx);
        }
        //  This for loop will repeat as many times as elements in array. If there are no elements in array it will go out

        // FOR LOOP NEW 2
        byte b1 = 10;
        int[] arr3 = new int[3];
        arr3[0]=b1;
        arr3[1]=b1+20;
        arr3[2]=b1+30;

        // FOR LOOP to iterate through array

        for (long zz : arr3) {
            zz= ++zz;
            System.out.println(zz);
        }

     //  Practice for OOP

        // 1. TO test Inheritance we use InharitanceAnimal class as super class and Inheritance as child class

        // Create new Cats object

        InheritanceCats cat1 = new InheritanceCats();
        cat1.setName("Kitty"); // inheritanced method from Animal class

        cat1.MustacheSize = 5; // unique for Cats class instance variable
        cat1.Meow(); // unique for Cats class method;

        System.out.println(cat1.getName() + " With mustache size " + cat1.MustacheSize);

        // 2.  To test Polymorphism
        // The main principle here to solve similar tasks with one solution (method)
        // we have created one main method sum with the same name but taking different arguments
        int i1 = 1, i2 = 2;
        float f1 = 1.1f, f2 = 2.2f;

        sum(i1,i2);
        sum(f1,f2);

    }

}
