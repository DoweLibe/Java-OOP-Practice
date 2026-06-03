class Car {// this is my class attrubuites that will be pulled anytime car is called.//
    String make;
    String model;
    int year;
    Car(String make, String model, int year) { // this is my constructor 
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // second constructor// 
    Car (String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 2020;
    }

// Creating my first method showing the make and model of the vehicle 
void displayInfo() {
    System.out.println(this.make + " " + this.model);
}
// second methond using a boolean statement
void displayInfo(boolean includeYear) {
    if(includeYear) { System.out.println( this.make + " " + this.model + " " + this.year);
   } else {
        System.out.println(this.make + " " + this.model);
    }
}
}
public class Main {
    public static void main(String[] args) {// Now i will implement the first and second methods
        Car car1 = new Car("Buick" , "Enclave" , 2019);
        car1.displayInfo(); // calls the no‑boolean version
        car1.displayInfo(true);// prints make, model, year
        car1.displayInfo(false);// prints make + model only
        Car car2 = new Car("Nissan", "Altima");// Now to do the same for car 2 
        car2.displayInfo();
        car2.displayInfo(true);
        car2.displayInfo(false);
    }
}
