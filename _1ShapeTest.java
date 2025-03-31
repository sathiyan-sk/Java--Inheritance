// 1. Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'

abstract class Shape {
     String name;
     
     Shape(String name) {
         this.name = name;
     }
     
     abstract double calculateArea(); 
     
     void display() {
         System.out.println("Shape: " + name);
     }
 }
 
 class Circle extends Shape {
     double radius;
     
     Circle(double radius) {
         super("Circle");
         this.radius = radius;
     }
     
     @Override
     double calculateArea() {
         return Math.PI * radius * radius;
     }
 }
 
 class Rectangle extends Shape {
     double length, width;
     
     Rectangle(double length, double width) {
         super("Rectangle");
         this.length = length;
         this.width = width;
     }
     
     @Override
     double calculateArea() {
         return length * width;
     }
 }
 
 class Triangle extends Shape {
     double base, height;
     
     Triangle(double base, double height) {
         super("Triangle");
         this.base = base;
         this.height = height;
     }
     
     @Override
     double calculateArea() {
         return 0.5 * base * height;
     }
 }
 
 public class _1ShapeTest {
     public static void main(String[] args) {
         Circle circle = new Circle(5);
         Rectangle rectangle = new Rectangle(4, 6);
         Triangle triangle = new Triangle(3, 8);
         
         circle.display();
         System.out.println("Area: " + circle.calculateArea());
         
         rectangle.display();
         System.out.println("Area: " + rectangle.calculateArea());
         
         triangle.display();
         System.out.println("Area: " + triangle.calculateArea());
     }
 }
 