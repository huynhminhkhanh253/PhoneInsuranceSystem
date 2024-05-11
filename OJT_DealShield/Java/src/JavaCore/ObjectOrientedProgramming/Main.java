package JavaCore.ObjectOrientedProgramming;

public class Main {
    public static void main(String[] args) {

        /*Example for static polymorphism vs runtime polymorphsm*/
        // static polymorphism
        // method drive is defined at compile time
        ElectricCar electricCar = new ElectricCar();
        electricCar.drive();


        // runtime polymorphism
        // compiler cannot define which method run it should call at compile time
        // it only define which method it should call when object is created (which is a runtime process) -> reallocate object reference to electric car
        Car electricCar_2 = new ElectricCar(); // upcasting
        electricCar_2.drive();


    }
}
