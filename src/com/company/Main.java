package com.company;


import java.awt.*; // imported when declaring the Point class
import java.text.NumberFormat;
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
//	    System.out.println(name);

	        // Primative types are stored independent
            // EXAMPLE...
        byte x = 1;
        byte y = x;
        x = 2;
            //y will still be 1 while x will now be 2,




	    // Reference Types ############################################################################################
        Date currentDate = new Date(); // don't forget to import the date by pressing "TAB" after typing "Date"
//        System.out.println(currentDate);

            // Reference types make references to each other, unlike Primative types which are independent
            // EXAMPLE...
//        Point point1 = new Point(x:1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);




        // String and String Methods ###################################################################################
        String message = "  Hello World" + "!!  ";
//        System.out.println(message.endsWith("!!")); //endsWith method returns a boolean that check the end of the string
//        System.out.println(message.startsWith("Hey")); //startsWith method returns a boolean
//        System.out.println(message.indexOf("World")); //checks the index in the string
//        System.out.println(message.trim()); //remove unnecessary white spaces (beginning and end of string)
//        System.out.println(message.replace("World", "Xolani")); //replaces parts of the string, you need to have prefixes, this is not JS. LOL
//        System.out.println(message.toLowerCase()); //there is obviously toUpperCase as well.
//        System.out.println(message);

            // Using quotation marks inside strings
        String usingQuotes = "Xolani said \"I don't care\""; //using back slashes when quoting
        String escapingBackSlashes = "c:\\Windows\\..."; //using backslashes to escape back slashes and other special chars
        String newLine = "Xolani \nNjabulo \nMomo"; //we also use \t for adding TAB spaces
//        System.out.println(escapingBackSlashes);
//        System.out.println(newLine);




        // Arrays #####################################################################################################
        int [] numbers = {100, 10, 15, 32}; //declaring an array (don't forget to import the array)
        Arrays.sort(numbers); // sorting the array first before outputting it
//        System.out.println(Arrays.toString(numbers)); //this is how you output the array

            // Multi-dimensional arrays
        int [][] dimensionalNums = { {1, 2, 3}, {4, 5, 6} }; //declaring dimensional arrays
//        System.out.println(Arrays.deepToString(dimensionalNums)); //use "deepToString" to output multi-dimensional arrays




        // Declaring Constants ########################################################################################
        // Firstly constant variable should be named in all capital letters.
        final float PI = 3.14F; //use final to declare constant variables
//        System.out.println(PI);




        //Arithmetic Expressions ######################################################################################
            //Dividing numbers with remainders
        int divide = 10/3; // this will not return the remainder
        double divideWithRemainder = (double)10 / (double)3; // this will return the divided result with remainder
//        System.out.println(divideWithRemainder);

            //Putting ++ before the value
        int a = 1;
        int b = ++a; //both a and b will be 2 coz a was incremented before assigned to b
//        System.out.println(b);

            //Putting ++ after the value
        int c = 1;
        int d = c++; //d will be 1 and c will be 2 coz d was assigned to c first before being incremented
//        System.out.println(d);




        // Casting #####################################################################################################
            // Implicit casting (where variable changes happens automatically)
            // byte > short > int > long > float > double (cannot go the other way around)
        short e = 1;
        int f = e + 2;
//        System.out.println(f);

            // Explicit casting - custom (can be casted in any order)
        double g = 1.1;
        int h = (int)g + 2; // you can change a double into int
//        System.out.println(h);

        String i = "1.1";
        double j = Double.parseDouble(i) + 2; // Also have Integer.parseInt()
//        System.out.println(j);




        // Math Class #################################################################################################
            //round method (takes float and return int OR takes a double and return a long)
            //rounds off to the nearest whole number
        int result1 = Math.round(2.5F);
//        System.out.println(result1);

            //ceil - rounds to the next whole number
        double result2 = Math.ceil(1.1);
        int result3 = (int) Math.ceil(1.1);
//        System.out.println(result2);
//        System.out.println(result3);

            //min and max (only takes in 2 numbers)
        int result4 = Math.max(1,2);
        int result5 = Math.min(1,2);
//        System.out.println(result4);
//        System.out.println(result5);

            //random - returns a double
        double result6 = Math.random(); //return numbers from 0 to 1
        double result7 = Math.random()  * 100; //will return numbers from 0 to 100
        int result8 = (int)Math.round(Math.random() * 50); //will return integers from 0 to
//        System.out.println(result6);
//        System.out.println(result7);
//        System.out.println(result8);




        //Formatting numbers ##############################################################################################
            // NumberFormat - to import it at the top
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String money = currency.format(1234567.891);
        System.out.println(money);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentage = percent.format(0.1);
        System.out.println(percentage);
    }
}





























