package JavaCore.ObjectOrientedProgramming;

public class Car {
    String brand;
    String model;
    int year;

    //Constructor overloading
    public Car(){

    }
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void drive(){
        System.out.println("Car is running");
    }
}
