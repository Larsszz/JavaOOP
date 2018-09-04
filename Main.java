package LvL2.Lesson3;

public class Main {
    public static void main(String[] args) throws FullGroupException {
        Group oop = new Group("Java");
        Student lars = new Student("Illarion", "Tokarskyi", 22, true,
                "kpi", 5);
        oop.addStudent(lars);
        InOutGroupFile.writeGroupToFile(oop);

    }
}
