package com.ashton.palindrome;
//
import java.util.Arrays;
import java.util.Scanner;
//
//public class Palindrome {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String inputString = in.next();
//
//        // make an array that is filled with char inputs for the string
//            char [] palindromeArray = inputString.toCharArray();
//            //invert the array
//            for (int i = palindromeArray.length - 1; i<=0;i--){
//
//            //post the inverted array back to a string
//            String palindrome = new String(palindromeArray);
//            System.out.println(palindrome);
//            System.out.println(inputString);
//            // check for equivalency
//            if (inputString.equals(palindrome)){
//                boolean checkPalindrome = true;
//                System.out.println(checkPalindrome);
//            }else{
//                boolean checkPalindrome = false;
//                System.out.println(checkPalindrome);
//        }
//    }
//    }

    public class Palindrome {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String inputString = in.next();
            // make an array that is filled with char inputs for the string
            char palindromeArray [] = inputString.toCharArray();
            //invert the array
            System.out.println(palindromeArray);
            char invertedArray [] = new char[palindromeArray.length];
            int j = palindromeArray.length -1;
            for( int i = j ;i>= 0;i-- ) {
                invertedArray[palindromeArray.length -(i+1)] = palindromeArray[i];
                j--;
                System.out.println(invertedArray.length);
                System.out.println(Arrays.toString(invertedArray));
            }
            //post the inverted array back to a string
            String palindrome = new String(invertedArray);
            System.out.println(palindrome);
            System.out.println(inputString);

            // check for equivalency
            if (inputString.equals(palindrome)){
                boolean checkPalindrome = true;
                System.out.println(checkPalindrome);
            }else{
                boolean checkPalindrome = false;
                System.out.println(checkPalindrome);
            }
        }
    }
