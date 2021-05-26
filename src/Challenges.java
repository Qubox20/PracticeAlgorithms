import java.util.ArrayList;
import java.util.Arrays;

public class Challenges {
    /** Create a function which returns the number of true values there are in an array.*/
    public static int countTrueFalse(boolean[] arr) {
        // write your code here
        // you will need to change the return statement

        return Integer.parseInt(null);
    }

    /** Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.*/
    public static int differenceMinMax(int[] nums){
        // write your code here
        // you will need to change the return statement
        return Integer.parseInt(null);
    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */
    public static String stutter(String str){
        // write your code here
        // you will need to change the return statement
        return "";
    }

    /** Write a function that takes an array of numbers and returns the second largest number.*/
    public static int secondLargestNumber(int[] nums){
        // write your code here
        // you will need to change the return statement
        return Integer.parseInt(null);
    }

    /**
     FizzBuzz
     Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
     If the number is a multiple of 3 the output should be "Fizz".
     If the number given is a multiple of 5, the output should be "Buzz".
     If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
     If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
     The output should always be a string even if it is not a multiple of 3 or 5.
     **/
    public static String fizzBuzz(int num){
        // write your code here
        // you will need to change the return statement
        return "";
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     */
    public static String skipCount(int countFrom, int countTo, int countBy){
//        //Count from first to second number in increments of the third  number and if its possible we will have
//        //Try again with better variables!
//
//        //Valid User input
//        if (countTo < countFrom) {
//            return "Try again with better numbers!";
//        }
//        StringBuilder answer = new StringBuilder();
//        //Create pattern based on user input numbers
//        for (int currentInt = countFrom; currentInt <= countTo);
        return " ";

    }

    /** The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.*/
    public static String reverser(String reverseMe){
        StringBuilder sbr = new StringBuilder(reverseMe);
        sbr.reverse();
        return "";
    }

    /**
     * Reverse An Array
     * Write a function that reverses the order of an array
     */

    //Create a temporary array
    //loop through our array
    //Assign values to the opposite index in the temp array
    //return the temp array
    public static int[] reverseArray(int[] arr){
        int arrlength = arr.length;
        int[] newarr = new int[arr.length];
        for(int x=0; x< arrlength; x++){
            int pos = arrlength-x-1;
            //System.out.println(x+"      "+pos);
            //System.out.println(arr[x]+"      "+arr[pos]);
            newarr[x] = arr[pos];
            //System.out.println(newarr[x]+"      "+newarr[pos]);
        }
        // you will need to change the return statement
        return newarr;
    }

    /**
     * Write a function that finds the word "bomb" in the given string (not case sensitive).
     * Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".
     */
    public static String duckTheBomb(String checkMe){
        // write your code here
        // you will need to change the return statement
        return "";
    }

    /** Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */
    public static int[] sortNumsAscending(int[] nums){
        // write your code here
        // you will need to change the return statement
        return new int[0];
    }

    /**
     * Remove Duplicates
     * Create a method that takes an array of strings,removes all duplicate items
     * and returns a new array in the same sequential order as the old array (minus duplicates).
     */
    public static String[] removeDupes(String[] stringArray){
        ArrayList<String> tempList = new ArrayList<>();
        //look at each element in the array
        for(String arrString: stringArray){
            //check if we have seen this value yet
            if(!tempList.contains(arrString)){
                //if not set it aside and hold it
                tempList.add(arrString);
            }
        }
        //return all of the held values
        return tempList.toArray(new String[0]);
    }
}