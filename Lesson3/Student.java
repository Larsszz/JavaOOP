package Lesson3;

public class Student extends Human {
    private String group;
    private int course;

    public Student(String secondName, int age, String sex, String group, int course) {
        super(secondName, age, sex);
        this.group = group;
        this.course = course;
    }

    public Student() {
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student - Second name = " + super.getSecondName() + " , course = " + course + " , group = "
                + group + "\n";
    }
}
