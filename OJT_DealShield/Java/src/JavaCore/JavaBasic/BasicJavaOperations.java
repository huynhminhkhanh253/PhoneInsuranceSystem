package JavaCore.JavaBasic;

public class BasicJavaOperations<T extends Number,G extends Number> {
    /*Variables and Data Types:*/
    T num1;
    G num2;
    public BasicJavaOperations(T num1,G num2){ // use generic to handle any typpe of input
        this.num1 = num1;
        this.num2 = num2;
    }
    /*Operator and Expressions*/
    public double add(){
        return num1.doubleValue() + num2.doubleValue();
    }
    public double subtract(){
        return num1.doubleValue() - num2.doubleValue();
    }
    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }
    public double division(){
        return num1.doubleValue() / num2.doubleValue();
    }
}
