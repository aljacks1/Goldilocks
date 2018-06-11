package com.ashton.goldilocks;
import java.util.*;
import java.lang.*;
/**
 *        // Declare Scanner variable in
 *         // Next double tempFloat no need to use ints as all ints are doubles
 *         // Any wonky input String Error
 *         // I'll implement this using switches and then for loops Then use an interface to demonstrate polymorphism
 *         // I'll write Tests and Documentation too
 */
public class Goldilocks {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println(in);

        System.out.println("Goldilocks is hungry, enter a porridge temperature:");
        String temperature = in.next();
        if (!in.hasNextDouble()) try {
            double newTemp = Double.valueOf(temperature);//try casting temperature as a double
        } catch (NumberFormatException e) {

            System.out.println("Temperatures are numbers! Please enter a Number!");
        }
        //return;
        //System.out.println(temperature);



    }
}
