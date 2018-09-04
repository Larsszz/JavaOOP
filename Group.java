package LvL2.Lesson3;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Group implements Voenkom, Serializable {
    transient Scanner scanner = new Scanner(System.in);
    private Student[] students = new Student[10];
    private String groupName;

    public Group() {
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + (students == null ? null : Arrays.asList(students)) +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student) throws FullGroupException {
        if (student == null) {
            throw new IllegalArgumentException("You add null student");
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                students[i].setGroup(this.getGroupName());
                break;
            }
            if (i == students.length - 1) {
                throw new FullGroupException();
            }
        }


    }

    public void addInteractiveStudent() throws FullGroupException {
        Student student = new Student();
        student.setFirstName(getFirstName());
        student.setSecondName(getSecondName());
        student.setSex(getSex());
        student.setAge(getAge());
        student.setUniversity(getUniversity());
        student.setCourse(getCourse());

        this.addStudent(student);
    }

    private String getFirstName() throws NullPointerException {
        System.out.print("Enter First Name: ");
        String firtsName = scanner.nextLine();
        if (firtsName.equals("")) {
            throw new NullPointerException("Enter valid name");
        }
        return firtsName;
    }

    private String getSecondName() throws NullPointerException {
        System.out.print("Enter Second Name: ");
        String SecondName = scanner.nextLine();
        if (SecondName.equals("")) {
            throw new NullPointerException("Enter valid name");
        }
        return SecondName;
    }

    private String getUniversity() throws NullPointerException {
        System.out.print("Enter University: ");
        String University = scanner.nextLine();
        if (University.equals("")) {
            throw new NullPointerException("Enter valid name");
        }
        return University;
    }

    private int getAge() throws IllegalArgumentException {
        System.out.print("Enter age: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age > 0 && age < 100) {
                return age;
            } else {
                throw new IllegalArgumentException("Enter valid age");
            }
        } else {
            throw new IllegalArgumentException("Enter valid age");
        }
    }

    private int getCourse() throws IllegalArgumentException {
        System.out.print("Enter course: ");
        if (scanner.hasNextInt()) {
            int course = scanner.nextInt();
            scanner.nextLine();
            if (course > 0 && course < 7) {
                return course;
            } else {
                throw new IllegalArgumentException("Enter valid course");
            }
        } else {
            throw new IllegalArgumentException("Enter valid course");
        }
    }

    private boolean getSex() throws IllegalArgumentException {
        System.out.print("Enter sex(man - 1(true) , women - 0(false)): ");
        int sex = scanner.nextInt();
        scanner.nextLine();
        if (sex == 1) {
            return true;
        } else if (sex == 0) {
            return false;
        } else {
            throw new IllegalArgumentException("Enter valid sex");
        }

    }

    public void deleteStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("You add null student");
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].getSecondName().equals(student.getSecondName())) {
                students[i] = null;
            }
        }
    }

    public Student searchStudent(String secondName) {
        for (Student searchStudent : students) {
            if (searchStudent.getSecondName().equals(secondName)) {
                return searchStudent;
            }
        }
        return null;
    }

    private void sortOfLastName() {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length; j++) {
                if (compareStudentByLastName(students[i], students[j]) > 0) {
                    Student buffer = students[i];
                    students[i] = students[j];
                    students[j] = buffer;
                }
            }
        }
    }

    private int compareStudentByLastName(Student first, Student second) {
        if (first != null && second == null) {
            return 1;
        }
        if (first == null && second != null) {
            return -1;
        }
        if (first == null && second == null) {
            return 0;
        }
        return first.getSecondName().compareTo(second.getSecondName());
    }

    @Override
    public Student[] getPrizivniks() {
        int n = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAge() > 17 && students[i].isSex()) {
                n++;
            }
        }
        Student[] array = new Student[n];
        int i = 0;
        for (Student student : this.students) {
            if (student.getAge() > 18 && student.isSex()) {
                array[i] = student;
                i++;
            }
        }
        return array;
    }
}
