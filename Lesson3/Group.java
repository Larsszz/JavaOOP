package Lesson3;

import java.util.Arrays;

public class Group {
    private Student[] arr = new Student[10];
    private String name;

    public Group() {
    }

    public Group (String name) {
        this.name = name;
    }

    public void addStudent(Student student) throws MyException {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = student;
                arr[i].setGroup(name);
                return;
            }
        }

        throw new MyException();

    }

    public void deleteStudent(Student student) {
        for (int i = 0; i < arr.length; i++) {
            if (student.getSecondName().equals(arr[i].getSecondName()) && student.getAge() == arr[i].getAge()) {
                arr[i] = null;
                return;
            } else if (i == arr.length - 1) {
                System.out.println("Student not found for delete");
            }
        }
    }

    public Student searchBySecondName(String secondName) {
        for (Student st :
                arr) {
            if (st == null) {
                continue;
            }
            if (st.getSecondName().equals(secondName)) {
                return st;
            }
        }
        System.out.println("Student not found in this group");
        return null;
    }

    @Override
    public String toString() {
        boolean isSorted = false;
        Student buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] == null) {
                    continue;
                }
                if (arr[i+1] == null) {
                    isSorted = false;
                    buffer = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buffer;
                    continue;
                }
                if ((arr[i].getSecondName().compareTo(arr[i+1].getSecondName()))>0) {
                    isSorted = false;
                    buffer = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buffer;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
