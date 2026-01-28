/**
 * @author Weiquan Mai
 * Problem 10.9
 * (The Course class)
 * Revise the Course class as follows:
 * ■ Revise the getStudents() method to return an array whose length is the
 * same as the number of students in the course. (Hint: create a new array and
 * copy students to it.)
 * ■ The array size is fixed in Listing 10.6. Revise the addStudent method to
 * automatically increase the array size if there is no room to add more students.
 * This is done by creating a new larger array and copying the contents of the
 * current array to it.
 * ■ Implement the dropStudent method.
 * ■ Add a new method named clear() that removes all students from the course.
 * Write a test program that creates a course, adds three students, removes one, and
 * displays the students in the course.
 */
class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    /**
     * Revise addStudent method to automatically increase the array size
     */
    public void addStudent(String student){
        if(numberOfStudents >= students.length){
            String[] temp = new String[numberOfStudents * 2];
            System.arraycopy(students, 0, temp, 0, numberOfStudents);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    /**
     * Revise the getStudents() method to return an array whose length is the same
     * as the number of students in the course
     */
    public String[] getStudents(){
        String[] studentResult = new String[numberOfStudents];
        System.arraycopy(students,0, studentResult, 0, numberOfStudents);
        return studentResult;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }

    /**
     * Implement the dropStudent method.
     * Drops a student from the course
     */
    public void dropStudent(String student){
        int dropStudentIndex = -1;
        for(int i = 0; i < numberOfStudents; i++){
            // Find index of student
            if(students[i].equals(student)){
                dropStudentIndex = i;
                break;
            }
        }

        // Shift index to the left to remove student if student is found
        if(dropStudentIndex != -1){
            for(int i = dropStudentIndex; i < students.length - 1; i++){
                students[i] = students[i + 1];
            }
            numberOfStudents--;
        }
    }

    /**
     * Add a new method named clear() that removes all students from the course
     */
    public void clear(){
        numberOfStudents = 0;
    }
}
