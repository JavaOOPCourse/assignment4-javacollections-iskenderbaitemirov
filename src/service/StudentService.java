package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<Student>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(1, "Altynai", 4.0));
        students.add(new Student(2, "iskender", 4.0));
        students.add(new Student(3, "Elina", 1.4));
        students.add(new Student(4, "Bakyt", 3.9));
        students.add(new Student(5, "Nursultan", 1.5));
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            Student s = it.next();
            if (s.getGpa() < 2.0) {
                it.remove(); // safe remove while iterating
            }
        }
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        if (!students.isEmpty()) {
            Student highest = students.get(0);
            for (int i = 1; i < students.size(); i++) {
                Student stud = students.get(i);
                if (highest.getGpa() < stud.getGpa()) highest = stud;
            }
            System.out.println("Highest GPA student: "+highest);
        }
        else{
            System.out.println("No students,no Highest");
        }
    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        Student s = new Student(students.size(),"NameRandom",2.5);
        students.add(2,s);
    }

    public void printStudents() {
        // TODO: Print using Iterator
        System.out.println("All students");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }
    }
}
