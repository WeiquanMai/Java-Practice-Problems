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
public class Exercise11_02 {
    public static void main(String[] args){
        // Write a test program that creates a Person, Student, Employee, Faculty, and Staff
        Person person = new Person("Amy", "1 Main Street", "111 111 1111", "amy@gmail.com");
        Student student = new Student("Brian", "2 Main Street", "222 222 2222", "brian@gmail.com", 3);
        Employee employee = new Employee("Charles", "3 Main Street", "333 333 3333", "charles@gmail.com",
                "Office 1", 80000, new MyDate());
        Faculty faculty = new Faculty("Darlene", "4 Main Street", "444 444 4444", "darlene@yahoo.com",
                "Office 2", 100000, new MyDate(), 20, "Senior");
        Staff staff = new Staff("Ethan", "5 Main Street", "555 555 5555", "ethan@outlook.com",
                "Office 3", 90000, new MyDate(), "Professor");

        // Invoke their toString methods
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
