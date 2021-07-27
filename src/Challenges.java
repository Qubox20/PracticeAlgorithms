import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Challenges {
    /** Create a function which returns the number of true values there are in an array.*/
    public static int countTrueFalse(boolean[] arr) {
        // write your code here
        // you will need to change the return statement

        return Integer.parseInt(null);
    }

    /** Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.*/
    public static int differenceMinMax(int[] nums){
        // find largest number and hold it
        Arrays.sort(nums);
        // find smallest number and hold it
        int small = nums[0];
        //return absolute difference
        int big = nums[nums.length -1];
        return Math.abs(small-big);
    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */
    public static String stutter(String stutterMe){
        // find the two letters
        String start = stutterMe.substring(0,2) + "... ";
        //first it should repeat twice, ..., space in between
        return start +start + stutterMe + "?";
    }

    /** Write a function that takes an array of numbers and returns the second largest number.*/
    public static int secondLargestNumber(int[] arr){
        // declare variables
        int fmax = 0; // first largest
        int smax = 0; // second largest

        // assign first element to fmax, smax
        fmax = arr[0];
        smax = arr[0];

        // compare with remaining elements
        // loop
        for (int i = 1; i < arr.length; i++) {
            if (fmax < arr[i]) {
                smax = fmax;
                fmax = arr[i];
            } else if(smax < arr[i]) {
                smax = arr[i];
            }
        }

        // return second largest number
        return smax;
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
        // if both, return fizzbuzz
        if (num % 5 == 0 &&  num  % 3 == 0)
            return "FizzBuzz";
        //if multiple 3 , return fizz
        if (num % 3 == 0)
            return "Fizz";
        //if multiple 5, return buzz
        if (num % 5 == 0)
            return "Buzz";
        // default, returns number as string
        return Integer.toString(num);
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     */
    public static String skipCount(int countFrom, int countTo, int countBy){
        // Validate
        if(countTo < countFrom){
            return "Try again with better numbers!";
        }
        // hold the pattern temporarily
        StringBuilder answer= new StringBuilder();
        // create Pattern based on user input, using a for loop to create the pattern
        for (int currentInt=countFrom; currentInt<=countTo; currentInt += countBy){
            answer.append(currentInt).append(".. ");
        }
        // remove the last three characters because they are extras
        answer.setLength(answer.length()-3);
        //return our answer
        return answer.toString();
    }

    /** The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.*/

    public static String reverser(String reverseMe){
        StringBuilder str=new StringBuilder(reverseMe);
        str.reverse();
        return str.toString();
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
        // within the string, find the word bomb
        if (checkMe.toLowerCase().contains("bomb"))
            return "DUCK!";
        //if bomb is found, return "duck"
        //if bomb is not found; return "Relax, there's no bomb."
        return "Relax, there's no bomb.";
    }

    /** Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */
    public static int[] sortNumsAscending(int[] nums){

        //Arrays.sort();





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