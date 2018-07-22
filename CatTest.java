package Lesson1;

public class CatTest {
    public static void main(String[] args) {
        Cat catFirst = new Cat("Barsik", 4, "Vislouh", "Grey");
        Cat catSecond = new Cat("Murzik", 2, "Cheshirskiy", "Black");
        System.out.println(catFirst.toString());
        catFirst.angryCat();
        catFirst.maow();
        System.out.println(catSecond.toString());
        catSecond.murch();
    }
}
