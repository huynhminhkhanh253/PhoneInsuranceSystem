package JavaCore.JavaBasic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void compare(Object a, Object b){
        System.out.println(a == b);
    }
    public static boolean inRange(int a, int b,int c){
        // check if b < c
        if(b < c){ // relational
            if(a >= b && a <=c){ // relation and logical
                return true;
            }
            else return false;
        }
        else{
            if(a <= b && a >= c){
                return true;

            }
            else return false;
        }
    }
    public static void main(String[] args) {
        /*Variables and Data types*/
        int integer_1 = 1;
        int integer_2 = 2;
        double double_1 = 0.5;
        double double_2 = 2.2;
        String name = "";
        boolean p = true;

        /*Logical vs Relational condition*/

        // Check range of a number in



        /*Operators and Expressions*/
        BasicJavaOperations<Integer, Double> example1 = new BasicJavaOperations(integer_1,double_1);
        BasicJavaOperations<Double, Integer> example2 = new BasicJavaOperations(double_2,integer_2);
        //System.out.println("integer_1 + double_1 = " + example1.add());
        //System.out.println("double2 + integer_2 = " + example2.add());

        /*Object comparision*/

        People p1 = new People("John", 12);
        People p2 = new People("John", 12);

        //System.out.println(p1.equals(p2));

        /*Example for difference between == .equals*/


        int a = 2; // store value directly in stack memory
        int b = 2; // store value directly in stack memory

        compare(a,b);; // true
        // compare its actual value in stack memory

        String s1 = "Hello";
        String s2 = "Hello";

        compare(s1,s2); // true

        // same memory address because java automatically search in "String pool" for used String

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        compare(s3,s4);; // false


        // different address stored in stack memory by init keyword "new"


        System.out.println(inRange(2,2,3));
    }
}