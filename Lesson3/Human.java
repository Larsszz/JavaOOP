package Lesson3;

public class Human {
    private String secondName;
    private int age;
    private String sex;

    public Human() {
    }

    public Human(String secondName, int age, String sex) {
        this.secondName = secondName;
        this.age = age;
        this.sex = sex;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human - Second Name = " + secondName + " , age = " + age + " , sex = " + sex;
    }
}
