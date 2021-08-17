package com.company;


import java.awt.*; // imported when declaring the Point class
import java.util.Arrays; // gets imported when typing Arrays
import java.util.Date; // imported when declaring the date by pressing Tab
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // Primative Types ############################################################################################
        byte age = 127;
        int viewsCount = 123_456_789; //we can use underscores on big numbers for better readability
        long largerViewsCount = 3_123_456_789L; // we should use the letter "L" at the end when declaring a long number
        float price = 10.99F; //should use "F" at the end for floats for the compiler to understand
        double anotherPrice = 700.98;
        char letter = 'A'; //always surround single characters with single quotes
        String name = "Xolani"; //declare string with a capital letter S
	    System.out.println(name);

	        // Primative types are stored independent
            // EXAMPLE...
        byte x = 1;
        byte y = x;
        x = 2;
            //y will still be 1 while x will now be 2,




	    // Reference Types ############################################################################################
        Date currentDate = new Date(); // don't forget to import the date by pressing "TAB" after typing "Date"
        System.out.println(currentDate);

            // Reference types make references to each other, unlike Primative types which are independent
            // EXAMPLE...
//        Point point1 = new Point(x:1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);




        // String and String Methods ###################################################################################
        String message = "  Hello World" + "!!  ";
        System.out.println(message.endsWith("!!")); //endsWith method returns a boolean that check the end of the string
        System.out.println(message.startsWith("Hey")); //startsWith method returns a boolean
        System.out.println(message.indexOf("World")); //checks the index in the string
        System.out.println(message.trim()); //remove unnecessary white spaces (beginning and end of string)
        System.out.println(message.replace("World", "Xolani")); //replaces parts of the string, you need to have prefixes, this is not JS. LOL
        System.out.println(message.toLowerCase()); //there is obviously toUpperCase as well.
        System.out.println(message);

            // Using quotation marks inside strings
        String usingQuotes = "Xolani said \"I don't care\""; //using back slashes when quoting
        String escapingBackSlashes = "c:\\Windows\\..."; //using backslashes to escape back slashes and other special chars
        String newLine = "Xolani \nNjabulo \nMomo"; //we also use \t for adding TAB spaces
        System.out.println(escapingBackSlashes);
        System.out.println(newLine);




        // Arrays #####################################################################################################
        int [] numbers = {100, 10, 15, 32}; //declaring an array (don't forget to import the array)
        Arrays.sort(numbers); // sorting the array first before outputting it
        System.out.println(Arrays.toString(numbers)); //this is how you output the array

            // Multi-dimensional arrays
        int [][] dimensionalNums = { {1, 2, 3}, {4, 5, 6} }; //declaring dimensional arrays
        System.out.println(Arrays.deepToString(dimensionalNums)); //use "deepToString" to output multi-dimensional arrays




        // Declaring Constants ########################################################################################
        // Firstly constant variable should be named in all capital letters.
        final float PI = 3.14F; //use final to declare constant variables
        System.out.println(PI);




        //Arithmetic Expressions ######################################################################################
            //Dividing numbers with remainders
        int divide = 10/3; // this will not return the remainder
        double divideWithRemainder = (double)10 / (double)3; // this will return the divided result with remainder
        System.out.println(divideWithRemainder);

            //Putting ++ before the value
        int a = 1;
        int b = ++a; //both a and b will be 2 coz a was incremented before assigned to b
        System.out.println(b);

            //Putting ++ after the value
        int c = 1;
        int d = c++; //d will be 1 and c will be 2 coz d was assigned to c first before being incremented
        System.out.println(d);
    }
}





























