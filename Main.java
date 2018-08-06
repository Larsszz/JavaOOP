package LvL2.Lesson3;

public class Main {
    public static void main(String[] args) {
        Group oop = new Group("Java");
        Student lars = new Student("Illarion", "Tokarskyi", 22, true,
                "kpi", 5);
        try {
            oop.addInteractiveStudent();

        } catch (FullGroupException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(oop);

    }
}
