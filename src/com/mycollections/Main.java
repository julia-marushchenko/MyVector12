/**
 *  Java program to create, update, read and delete Vector instance.
 */

package com.mycollections;

import java.util.Vector;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Vector<Boolean> myVector = new Vector<>();

        // Add.
        myVector.add(true);
        myVector.add(false);
        myVector.add(5 > 3);
        myVector.add(5 < 3);
        myVector.add(7 == 7);
        myVector.add(7 != 7);

        // Print.
        System.out.println(myVector); // Output: [true, false, true, false, true, false]

        myVector.add((4 == 4) ? true : false);
        myVector.add((4 != 4) ? true : false);

        // Print.
        System.out.println(myVector); // Output: [true, false, true, false, true, false, true, false]

        // Clear.
        myVector.clear();

    }
}