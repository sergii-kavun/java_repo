package com.learning.theory;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.lang.*;
import javax.xml.*;

/**
 * Created by vid4i on 08.05.2017.
 */
public class VariableTypes {
    public static void main(String[] args) {
        // declare primitive variables
        long var33 = 123123;
        int variable1 = 1;
        byte var22 = 1;
        float variable2 = 2.2f;
        double var2 = -1.23;
        char variable3 = '/';
        char var4 = 'c';

        //  Class Math contains all math operations
        int variable22;

        // Math random returns double
        double someRandom =  Math.random();


        // All primitive types could be converted = casted to bigger types

        // CASTING
            int someVar1 = var22;   // byte into int
            int someVar2 = var4;    // char into int. char adds 000
            byte someVar3 = (byte) variable1; // casting int to byte

            // Cast from String to Long
            long castFromString = Long.parseLong("12312312");
            System.out.print(castFromString);

            // Cast int to Sting
            String castToString = Integer.toString(123123);


        // BOXING OF Primitive types into REFERENCE VARIABLES
        int primitiveVariable1 = 0;
        Integer someRefVariable = Integer.valueOf(primitiveVariable1);

        int primitiveVariable2 = someRefVariable.intValue();

        // Reference variables
           // declare arrays;
            int[] numbers;
            String[] someText;
            boolean[] bits;

            // initialization of arrays
            numbers = new int[100];    // with default values as o
            someText = new String[1];  // with default values  null
            bits = new boolean[0];     // with default values as false

            // or like this
            int[] array1 = new int[] {1,2,34,34,4,5};
            boolean[] array2 = new boolean[] {false, true, false};

            // or only with declaration and initialization you may not use "new"
            int[] array3 = {1,2,3,1,342,5,356};

            // work with arrays
            int arrayLength = array1.length;
            int getElement = array3[2];  // gets third element from array

            // COMPARISON OF ARRAYS

            // ==  compare links to objects
            boolean check = array1 == array3;  // should return false as links are different

            // to compare object by context inside use "equals" method for primitive and Arrays.equals for arrays
            boolean check2 = Arrays.equals(array1, array3);  // should return false

            // Arrays to String
            Arrays.toString(array1);

            // Array of string to one String
            String words = StringUtils.join(someText, " ");
    }
}
