/**
 * Created by vid4i on 27.09.2016.
 */

/*
public class LearningNotes {

}


/* In chapter 5 we need to cover
1. Operators
2. Loops (FOR)
3. String to int
4. Battleship game


----Actions to build any CLASS in java

1. List instance variables and methods
2. Write a Prep code
3. Write a Test code
4. Implement class
5. Test Methods
6. Final Debug


-----NEW TO STUDY----

1. Convert String to an int

--Integer.parseInt("3");

// Integer - internal java class
// parseInt - method of Integer class that parsing String to int
// ("3") - that is the value of the string
//  Integer.parseInt() method works only on String that represents digits !!!


2. FOR LOOP

--for (int x1 : locationCells) {}

// int xx1 - declaring a local variable that will hold one element from an array. Local variable must have the same type which array element have.
Each time this variable will hold different element from array until there are no elements or code does break
// :  - : colon means "in" - for each int value IN locationCells
// locationCells - array to iterate over the loop. Each time next element of array will be assigned to xx1 variable

-- for (int i=0; i<100; i++) {}

// This is old FOR loop style but its used anyway
// int i = 0; -- declare and initialize local variable which holds 0 for start
// i<100 -- boolean test (should return true or false). Here we can even invoke some method which returns boolean
// i++ -- to increment i variable to 1 at the end of each loop




3. Increment operator

-- numOfHits++;

// ++ = increment by 1;
// its the same like we doing that: numOfHits = NumOfHits + 1;

    3.1 Decrement operator

    --   NumOfHits--;

    3.1 Operators ++ or -- could be used either before or after variable for example:
        NumOfHits++;  -- use variable and only then increment
        ++NumOfHits; -- this means first increment and then use variable

    3.2 Break
    -- Break; // to brake any loop without checking boolean condition is true.

4. Break;

// to get out of the loop.

5. Compare String values.
// String is an object hence has to be compared with equals() method.

    result = "Kill";
    result.equals("Kill")

6. Make a random number

-- int randomNum = (int) (Math.random() * 5)

// Math. random() returns a double by default. Here could be ablied cast
// Math.random() - method returns a number from 0 to 0.99. So result could be multiplied to some number to get required RANGE
// Where randomNum variable to hold result
// (int) - cast , forces things after it to became an int type. In case its double 4.55 it will remove .55 and only 4 left.
// Math - this is internal java class
// .random() - method of Math class

7. CAST

// We could put smaller types into big one and this is ok

--long x;
--int z;
--  x = z +1;

// We could CAST BIG types to small
--  z = (int) x;  // here we cout long type to int

// We could remove value after delimiter if we use floating numbers
-- float f = 12.6;
   int xx;

   xx = (int) f; //  this will result in cutting part after . and result will be just 12.

// 8. Inheritance
// Means that child class could inheritance all or some instance variables or method from SUPER CLASS
// At the same time besides variables and methods inharitenced from super class child class can have own
or just to overwrite some of them
// to use iheritance for chald class we need to

    -- class CHILD EXTENDS superclass { }



*/