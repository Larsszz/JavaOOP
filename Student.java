package LvL2.Lesson3;

public class Student extends Human{
    private String university;
    private int course;
    private String group;

    public Student(String firstName, String secondName, int age, boolean sex, String university, int course, String group) {
        super(firstName, secondName, age, sex);
        this.university = university;
        this.course = course;
        this.group = group;
    }

    public Student() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + ", First Name='" + getFirstName() + ", Second Name='" + getSecondName() +
                "university='" + university + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
