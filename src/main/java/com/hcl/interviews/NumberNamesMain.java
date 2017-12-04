package com.hcl.interviews;

/**
 * This class is responsible for executing the method of NumberNamesImpl class.
 */
public class NumberNamesMain {

    public static void main(String[] args) {
        NumberNamesImpl numberNames = new NumberNamesImpl();
        System.out.println("*** " + numberNames.int2Text(43112609));
        System.out.println("*** " + numberNames.int2Text(-55));
        System.out.println("*** " + numberNames.int2Text(4235));
        System.out.println("*** " + numberNames.int2Text((int) 234.98));
        System.out.println("*** " + numberNames.int2Text((int) (-39.04)));
        System.out.println("*** " + numberNames.int2Text(1020000000));
    }

}
