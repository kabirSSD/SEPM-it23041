
// Student.java
// Demonstrates Encapsulation in Java

public class Student {

    // private variables (data hiding)
    private String name;
    private int id;
    private double cgpa;

    // constructor
    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        setCgpa(cgpa); // validation through setter
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for id
    public int getId() {
        return id;
    }

    // no setter for id (ID should not be changed)
    
    // getter for cgpa
    public double getCgpa() {
        return cgpa;
    }

    // setter with validation
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA value!");
        }
    }

    // display student info
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("CGPA : " + cgpa);
    }
}
