package com.ashton.goldilocks;
import java.util.*;
import java.lang.*;
/**
 * Goldilocks
 * This program takes input from the user in variable temperature of type double
 * Program outputs Strings "Too Hot!" "Too Cold!" or "Just Right" depending on the value of temperature
 * @author Ashton Jackson
 * @version 1.0
 * @since 6.10.2018
 */
public class Goldilocks {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); // This takes input from the user directly from the console

        System.out.println("Goldilocks is hungry, enter a porridge temperature:");
        double temperature = in.nextDouble(); //Keyboard input, numbers only, will throw exception if anything else
        if (temperature > 90) { //chose this number randomly
            System.out.println("Too Hot!");
        } else if (temperature < 80){ //also chose this number randomly must be below previous number
            System.out.println("Too Cold!");
        } else {
            System.out.println("Just Right");
        }

    }
}
