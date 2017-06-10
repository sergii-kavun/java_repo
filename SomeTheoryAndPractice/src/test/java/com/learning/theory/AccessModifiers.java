package com.learning.theory;

/**
 * Created by skavun on 6/10/2017.
 */
public class  AccessModifiers {   //abcense of public in class declaration means that this class is available only for classes within package
    public int hey;
    // Public gives access for everyone and from everywhere

    protected int hey2;
    // PROTECTED - gives access only for extended glasses and from classes from the same package;

    int hey3;
    // if modificator is absent - that means that access granted only for classes from package

    private int hey4;
    //  PRIVATE - access only from current class;

    // IF DECLARATION OF CLASS CONTAINS "FINAL"
    // That means that we cannot extend from this class + values of variables could not be reassigned
    // + FINAL could be applied for Instance variables and variables

    // STATIC
    // Could be assigned to class, methods  and  variables
    // They are not required Object (instance of class) creation and could be called with out it just by name

    // abstract
    // means for class that we are not able to create instance of this class, onlt his childs
}

