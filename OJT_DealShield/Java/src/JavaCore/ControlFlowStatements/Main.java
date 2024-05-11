package JavaCore.ControlFlowStatements;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(1,8);

        System.out.println("The number is " + number);

        System.out.print("Day of the week is ");
        ControlFlowOperations.convertSwitch(number);

        System.out.print("Biggest number is ");
        System.out.println(ControlFlowOperations.biggestNumber(2,3));

        String s = "Abccba";

        System.out.println("String s is Palindrome?" + ControlFlowOperations.isPalindromeWhile(s));

        int [] a = {1,2,3,4,9,1,3,2};

        System.out.println(ControlFlowOperations.maxNumberFor(a));

        ControlFlowOperations.countNumber(5);


    }

}
