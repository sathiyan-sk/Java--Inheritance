//2. Design a Student Parent class and ZSGSStudent Child class. Create constructors in both class with varying number of parameters. Call parent constructor from child constructor.  Try experimenting by creating child object using parent constructor.

class Student {
     String name;
     int age;
     
     Student(String name) {
         this.name = name;
         this.age = 0;
     }
     
     Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
     
     void display() {
         System.out.println("Student Name: " + name);
         System.out.println("Age: " + age);
     }
 }
 
 class ZSGSStudent extends Student {
     String course;
     
     // Constructor with two parameters, calling parent constructor
     ZSGSStudent(String name, String course) {
         super(name); // Calls Student(String name) constructor
         this.course = course;
     }
     
     // Constructor with three parameters, calling another parent constructor
     ZSGSStudent(String name, int age, String course) {
         super(name, age); // Calls Student(String name, int age) constructor
         this.course = course;
     }
     
     void display() {
         super.display(); 
         System.out.println("Course: " + course);
     }
 }
 
 public class _2StudentTest {
     public static void main(String[] args) {
    Student s1 = new ZSGSStudent("Sriganth", "Course");
    s1.display();

    System.out.println();

    Student s2 = new ZSGSStudent("Pawan", 22, "Course");
    s2.display();
    }
 }
 