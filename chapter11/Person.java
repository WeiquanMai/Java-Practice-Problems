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
class Person {
    // A person has a name, address, phone number, and e-mail address
    // Variables
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    // Overloaded constructor
    public Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Accessors and Mutators
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "Person: " + this.name;
    }
}
