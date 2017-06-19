package com.learning.theory;
import java.lang.*;

/**
 * Created by skavun on 6/19/2017.
 */
public class Exceptions {

    // There are 3 types of exception in JAVA
    // Errors in JVM
    java.lang.Error

        // For example
        // java.lang.OutOfMemoryError    / not enough memory
        // java.lang.NoClassDefFoundError   / class not found
        //java.lang.VerifyError / something wrong with class

    // In code, checked by JVM compilation, where JVM requires declaration and handling these exceptions
    java.lang.Exception

    // in code, unchecked by JVM
    java.lang.RuntimeException
        // example
        // java.lang.NullPointerException
        // java.lang.ArrayIndexOutOfBoundsException
        // java.lang.ArithmeticException



    //-----------------------------------------------------------------------------------------

    // java.lang.NullPointerException (NPE)
    // Will be throughn if we are trying to access some object by empty (null) reference variable

    /*
    Object nullRef = null; // Reference variable intialized but not referring to any object
    nullRef.toString();   // then we are trying to use this ref variable and call some method or field it exception will be show
    */

    // java.lang.ArrayIndexOutOfBoundsException
    // will be thrown if we are trying to acess non existing element of array

    /*
    int[] array22 = {1,2,3,4};
    array22[5];
    // or
    array22[-1];
    */

    // StringIndexOutOfBoundsException
    // will be thrown if we are trying to access symbols which not exist in String

    // java.io.FileNotDoundException
    // if we are trying to access not existing file

    /*
     new FileInputStream("not_existing_file");
    */

    // JVM has her own exception which generated while JVM is working,
    // for example OutOfMemory when JVM has no memory to create object


    // If there is a sequence of exceptions, first one is more important as it is a root case of others


}
