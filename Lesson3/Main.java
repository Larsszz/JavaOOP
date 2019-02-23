package Lesson3;

public class Main {
    public static void main(String[] args) throws MyException {
        Student firstSt = new Student("Petrovich", 22, "man", null, 3);
        Student secondSt = new Student("Tokarskiy", 21, "man", null, 2);
        Student thirdSt = new Student("Abramovich", 23, "women", null, 3);
        Student fourSt = new Student("Zenina", 25, "women", null, 3);
        Group group22 = new Group("HM-22");
        group22.addStudent(firstSt);
        group22.addStudent(secondSt);
        group22.addStudent(thirdSt);
        group22.addStudent(fourSt);

        System.out.println(group22);

    }
}
