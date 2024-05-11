package JavaCore.ControlFlowStatements;

import java.util.ArrayList;
import java.util.Random;

public class ControlFlowOperations {
    /*Swtich Statement vs Multiple If-Else*/
    // Convert a Random Int number [1-7] to
    // corresponding day of the week [Monday - Sunday]

    // use switch case
    public static void convertSwitch(int number){
        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    // use if else
    public static void convertIf(int number){
        if(number == 1){
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }

    /*Ternary Operator Usage*/

    public static int biggestNumber(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }


    /*For and While loop comparision*/

    // ex : function to check an array is a palindrome

    // abccba, AbccBa is palindrome

    public static boolean isPalindromeWhile(String s) {
        // two pointer
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if(!Character.isLetter(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetter(s.charAt(j))){
                j--;
            }
            else{
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;

        // Check standard and non standard "AbcCba" or "A  bC C ba"
    }

    public static boolean isPalindromeFor(String s) {
        // remove
        ArrayList<Character> array1 = new ArrayList<>();
        ArrayList<Character> array2 = new ArrayList<>();
        for(int i = 0; i < s.length() /2 ; i++){
            array1.add(Character.toLowerCase(s.charAt(i)));
        }
        for(int i = s.length()-1; i >= s.length() /2 ; i--){
            array2.add(Character.toLowerCase(s.charAt(i)));
        }
        if(array1.equals(array2)) return true;

        else return false;
        // Only check for standard array ex : "abccba", "AbCCba",...
    }

    //  a b c c b a
    //  i         j

    // = >
    /*Use a for loop to iterate over an array.
    Use a for loop when you know the loop should execute n times.
    (Iterate through an standard array)
    Use a while loop when the increment value is nonstandard.
    (Iterate through an standard array with some advance requirement)
    */

    // Return max number of an array

    public static int maxNumberFor(int [] a){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static int maxNumberWhile(int [] a){
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i < a.length){
            max = Math.max(max, a[i]);
            i++;
        }
        return max;
    }

    // => should use for to iterate through a standard array to reduce complexity

    /*Break and continue statements in loop*/


    // Count number from 0  - n, end loop at n, skip at number n - 1;
    public static void countNumber(int n){
        while (true){ // infinite loop, end through "break" keyword
            for(int i = 0; i <= n; i++){
                if(i == n-1) continue;
                System.out.println(i); // continue skip all below statement, start the loop again
            }
            break;
        }
    }

}
