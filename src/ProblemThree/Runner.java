package ProblemThree;

/*
* Design a transportation management system for a company that handles a fleet of vehicles including cars,
* trucks, and motorcycles. The system should be able to manage vehicle information, perform emissions checks,
* and handle maintenance scheduling.

1. Create a base class called Vehicle with properties like model, year, fuel type, and mileage.
*  Implement appropriate constructors and methods for displaying vehicle information.

2 Implement subclasses for Car, Truck, and Motorcycle that inherit from Vehicle. Each subclass
* should have additional properties and methods specific to its type.

3 Define an interface called EmissionControl with a method checkEmission() to simulate emissions checks.
* Implement this interface in the appropriate subclass.

4 Implement a class MaintenanceSchedule with a method scheduleMaintenance() that prints a message
*  about scheduling maintenance for a vehicle.

5 Create a program that demonstrates the functionality of your system. Create instances of different
* vehicle types, perform emissions checks, and schedule maintenance for vehicles.
* */

import java.util.ArrayList;

class Vechiles{
    private String model;
    private int year;
    private String fuelType;
    private double mileage;

    public Vechiles(String model, int year, String fuelType, double mileage){
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    public void displayInfo(){
        System.out.println("Model name : " + model);
        System.out.println("Published year : " + year);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Mileage : " + mileage + "km/l");
    }

    public String getModel() {
        return model;
    }
}

interface EmissionControl{
    void checkEmission();
}

class MaintananceSchedule{
    public void scheduleMaintenance(Vechiles vechile){
        System.out.println("Scheduling Maintainance for ~ " + vechile.getModel());
    }
}

class Car extends Vechiles implements EmissionControl{
    String carType;
    public Car(String model, int year, String fuelType, double mileage, String carType){
        super(model, year, fuelType, mileage);
        this.carType = carType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hey I am " + carType);
    }

    @Override
    public void checkEmission() {
        System.out.println("Emission Checks for " + super.getModel() + " ~ PASSED");
    }
}

class Sedan extends Car{
    public Sedan(String model, int year, String fuelType, double mileage, String carType){
        super(model, year, fuelType, mileage, carType);
    }
}

class Truck extends Vechiles{
    int cargoCapacity;
    public Truck(String model, int year, String fuelType, double mileage, int cargoCapacity){
        super(model, year, fuelType, mileage);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity : " + cargoCapacity + "Kg");
    }
}

class MotorCycle extends Vechiles{
    boolean hasSideCar;
    public MotorCycle(String model, int year, String fuelType, double mileage, boolean hasSideCar){
        super(model, year, fuelType, mileage);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if(hasSideCar) System.out.println("Has Side Car");
        else System.out.println("Does't Have Side Car");
    }
}



public class Runner {
    public static void main(String[] args) {
        Truck t1 = new Truck("Ashoka Leyland", 2000, "Diesel", 10, 34);
        MotorCycle m1 = new MotorCycle("KTM Duke", 2017, "Petrol", 50.25, false);
        Car c1 = new Car("Land Rover", 2015, "Diesel", 14.01, "XUV");
        Car c2 = new Car("HONDA City", 2015, "Diesel", 11.01, "Sedan");
        MaintananceSchedule m = new MaintananceSchedule();
        Vechiles[] arr = {c1, t1, m1};

        // c1.displayInfo();
        // t1.displayInfo();
        // c1.checkEmission();

        for (Vechiles i: arr) {
            m.scheduleMaintenance(i);
        }

    }
}
