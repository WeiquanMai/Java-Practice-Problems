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
class Employee extends Person{
    // An employee has an office, salary, and date hired
    // Variables
    private String office;
    private double salary;
    private MyDate dateHired;

    // Overloaded constructor
    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired){
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Accessors and Mutators
    public String getOffice(){
        return this.office;
    }
    public void setOffice(String office){
        this.office = office;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double Salary){
        this.salary = salary;
    }
    public MyDate getDateHired(){
        return  this.dateHired;
    }
    public void setDateHired(int year, int month, int date){
        this.dateHired = new MyDate(year, month, date);
    }

    @Override
    public String toString(){
        return "Employee: " + this.getName();
    }
}
