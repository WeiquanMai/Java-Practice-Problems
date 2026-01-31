/**
 * @author Weiquan Mai
 * Problem 11.2
 * (The Person, Student, Employee, Faculty, and Staff classes)
 * Design a class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee.
 * A person has a name,address, phone number, and e-mail address.
 * A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant.
 * An employeehas an office, salary, and date hired.
 * Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired.
 * A faculty member has office hours and a rank.
 * A staff member has a title.
 * Override the toString method in each class to display the class name and the person’s name.
 * Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes
 * their toString() methods.
 */
class Faculty extends Employee{
    // A faculty member has office hours and a rank
    private double officeHours;
    private String rank;

    // Overloaded constructor
    public Faculty(String name, String address, String phoneNumber, String email,
                   String office, double salary, MyDate dateHired,double officeHours, String rank){
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Accessors and Mutators
    public double getOfficeHours(){
        return this.officeHours;
    }
    public void setOfficeHours(double officeHours){
        this.officeHours = officeHours;
    }
    public String getRank(){
        return this.rank;
    }
    public void setRank(String rank){
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Faculty: " + this.getName();
    }
}
