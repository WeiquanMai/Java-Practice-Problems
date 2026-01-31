/**
 * @author Weiquan Mai
 * Problem 11.2
 * (The Person, Student, Employee, Faculty, and Staff classes)
 * Design a class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee.
 * A person has a name, address, phone number, and e-mail address.
 * A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant.
 * An employeehas an office, salary, and date hired.
 * Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired.
 * A faculty member has office hours and a rank.
 * A staff member has a title.
 * Override the toString method in each class to display the class name and the person’s name.
 * Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes
 * their toString() methods.
 */
class Student extends Person{
    // Define a constant class status
    private int status;
    private final static int FRESHMAN = 1;
    private final static int SOPHOMORE = 2;
    private final static int JUNIOR = 3;
    private final static int SENIOR = 4;

    // Overloaded constructor
    public Student(String name, String address, String phoneNumber, String email, int status){
        super(name, address,phoneNumber, email);
        this.status = status;
    }

    // Accessors and Mutators
    public int getStatus(){
        return this.status;
    }
    public void setStatus(int status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "Student: " + this.getName();
    }
}
