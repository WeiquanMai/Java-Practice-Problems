/**
 * @author Weiquan Mai
 * Problem 11.5
 * (The Course class)
 * Rewrite the Course class in Listing 10.6.
 * Use an ArrayList to replace an array to store students.
 * You should not change the original contract of the Course class
 * (i.e., the definition of the constructors and methods should not be changed,
 * but the private members may be changed).
 */

public class Exercise11_05 {
    public static void main(String[] args){
        Course course = new Course("Java Programming");
        course.addStudent("Peter");
        course.addStudent("Kim");
        course.addStudent("Anne");
        String[] students = course.getStudents();
        for(int i = 0; i < course.getNumberOfStudents(); i++){
            System.out.print(students[i] + " ");
        }
        System.out.println();
        System.out.println("Removing Kim: ");
        course.dropStudent("Kim");
        students = course.getStudents();
        for(int i = 0; i < course.getNumberOfStudents(); i++){
            System.out.print(students[i] + " ");
        }
    }
}
