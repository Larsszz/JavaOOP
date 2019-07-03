package LvL2.Lesson3;

import java.util.Arrays;

public class Group {
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
                students[i].setGroup(getGroupName());
                break;
            }
            if (i == students.length - 1) throw new FullGroupException();
        }


    }

    public void deleteStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("You add null student");
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) students[i] = null;
        }
    }

    public Student searchStudent (String secondName) {
        for (Student searchStudent: students) {
            if (searchStudent.getSecondName()==secondName) return searchStudent;
        }
        return null;
    }
}
