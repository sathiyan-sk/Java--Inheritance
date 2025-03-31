// 3. Create Vehicle Hierarchy

class Vehicle {
     String brand;
     int year;
     
     Vehicle(String brand) {
         this.brand = brand;
         this.year = 0; 
     }
     
     Vehicle(String brand, int year) {
         this.brand = brand;
         this.year = year;
     }
     
     void display() {
         System.out.println("Brand: " + brand);
         System.out.println("Year: " + year);
     }
 }
 
 class Car extends Vehicle {
     String model;
     
     Car(String brand, String model) {
         super(brand); // Calls Vehicle(String brand) constructor
         this.model = model;
     }
     
     Car(String brand, int year, String model) {
         super(brand, year); // Calls Vehicle(String brand, int year) constructor
         this.model = model;
     }
     
     void display() {
         super.display(); 
         System.out.println("Model: " + model);
     }
 }

 class Bike extends Vehicle {
     boolean hasGear;
     
     Bike(String brand, boolean hasGear) {
         super(brand); 
         this.hasGear = hasGear;
     }
     
     Bike(String brand, int year, boolean hasGear) {
         super(brand, year); 
         this.hasGear = hasGear;
     }
     
     void display() {
         super.display();
         System.out.println("Has Gear: " + hasGear);
     }
 }
 
 public class _3VehicleTest {
     public static void main(String[] args) {
         Car car1 = new Car("Toyota", "Corolla");
         Car car2 = new Car("RollsRoyce", 2025, "Phantam");
         
         Bike bike1 = new Bike("Yamaha", true);
         Bike bike2 = new Bike("Suzuki", 2021, false);
         
         System.out.println("Car 1:");
         car1.display();
         
         System.out.println("\nCar 2:");
         car2.display();
         
         System.out.println("\nBike 1:");
         bike1.display();
         
         System.out.println("\nBike 2:");
         bike2.display();
     }
 }
 