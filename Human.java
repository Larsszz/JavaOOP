package LvL2.Lesson3;

import java.io.Serializable;

public class Human implements Serializable {
    private String firstName;
    private String secondName;
    private int age;
    private boolean sex;

    public Human(String firstName, String secondName, int age, boolean sex) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.sex = sex;
    }

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
