
// Main.java
// Testing Encapsulation

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Ayoive", 230101, 3.75);

        // accessing data using public methods
        s1.displayInfo();

        // updating CGPA safely
        s1.setCgpa(3.90);

        System.out.println("\nAfter Update:");
        s1.displayInfo();
    }
}
