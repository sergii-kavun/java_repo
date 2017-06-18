package com.learning.theory;
import org.testng.annotations.DataProvider;

import java.time.*;

/**
 * Created by skavun on 6/10/2017.
 */
public class EnumAndAnnotation {

    // Перечесления
    // its like an separate class with populated instance variables
    public enum DayOfWeek {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday
    }

    // some standrard methods to work with enum
    //DayOfWeek.values(); // returns array of values
    //DayOfWeek.name();   // returns name of selected value
    //DayOfWeek.ordinal();    // return number of element

    // ANNOTATIONS
    // Means that class or method is old and not recommended for usage
    //@Deprecated

    // to ignore some types of warning while compiling
   // @SuppressWarnings("unchecked")

    //@Override
    // annotation to override methods or inst variables from parents classes

    // annotations could be customised and used
}
