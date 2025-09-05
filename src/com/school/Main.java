package com.school;

public class Main {
    public static void main(String[] args) {
        // Array of Students
        Student[] students = new Student[2];
        students[0] = new Student(1, "Jayant", 20);
        students[1] = new Student(2, "Aman", 21);

        // Array of Courses
        Course[] courses = new Course[2];
        courses[0] = new Course("CSE101", "Object Oriented Programming", 4);
        courses[1] = new Course("CSE102", "Data Structures", 3);

        // Display Students
        System.out.println("---- Students ----");
        for (Student s : students) {
            s.displayStudent();
        }

        // Display Courses
        System.out.println("\n---- Courses ----");
        for (Course c : courses) {
            c.displayCourse();
        }
    }
}
