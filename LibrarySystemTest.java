// Library Management System
class LibraryManagementSystem {
    private String userType;
    private String username;
    private String password;
    
    public void login() {
        System.out.println(username + " logged in");
    }
    
    public void register() {
        System.out.println("User registered: " + username);
    }
    
    public void logout() {
        System.out.println(username + " logged out");
    }
}

// User class
class User {
    protected String name;
    protected String id;
    protected Account account;
    
    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.account = new Account();
    }
    
    public void verify() {
        System.out.println("Verifying user: " + name);
    }
    
    public void checkAccount() {
        System.out.println("Checking account for: " + name);
    }
    
    public void getBookInfo() {
        System.out.println("Getting book info for: " + name);
    }
}

// Student class (inherits User)
class Student extends User {
    private String studentClass;
    
    public Student(String name, String id, String studentClass) {
        super(name, id);
        this.studentClass = studentClass;
    }
}

// Staff class (inherits User)
class Staff extends User {
    private String department;
    
    public Staff(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }
}

// Account class
class Account {
    private int noBorrowedBooks;
    private int noReservedBooks;
    private int noReturnedBooks;
    private int noLostBooks;
    private double fineAmount;
    
    public void calculateFine() {
        System.out.println("Calculating fine...");
    }
}

// Book class
class Book {
    private String title;
    private String author;
    private String isbn;
    private String publication;
    
    public Book(String title, String author, String isbn, String publication) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publication = publication;
    }
    
    public void showDueDate() {
        System.out.println("Showing due date for book: " + title);
    }
    
    public void checkReservationStatus() {
        System.out.println("Checking reservation status for book: " + title);
    }
}

// Librarian class
class Librarian {
    private String name;
    private String id;
    private String password;
    
    public Librarian(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
    
    public void verifyLibrarian() {
        System.out.println("Verifying librarian: " + name);
    }
}

// Library Database class
class LibraryDatabase {
    public void add(Book book) {
        System.out.println("Adding book: " + book);
    }
    
    public void delete(Book book) {
        System.out.println("Deleting book: " + book);
    }
}

public class LibrarySystemTest {
    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();
        
        Student student = new Student("Alice", "S001", "CS");
        Staff staff = new Staff("Bob", "T002", "IT");
        
        Librarian librarian = new Librarian("Mr. Smith", "L003", "pass123");
        
        Book book1 = new Book("Java Programming", "John Doe", "123456", "TechPress");
        LibraryDatabase library = new LibraryDatabase();
        
        student.verify();
        student.checkAccount();
        staff.verify();
        librarian.verifyLibrarian();
        
        library.add(book1);
        book1.showDueDate();
    }
}
