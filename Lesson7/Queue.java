package Lesson7;

import java.util.ArrayDeque;

public class Queue {
    public static void main(String[] args) {
        realize(2);
    }

    public static void realize(int numOfCups) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.addLast("Sheldon");
        arrayDeque.addLast("Leonard");
        arrayDeque.addLast("Volovitc");
        arrayDeque.addLast("Kutrapalli");
        arrayDeque.addLast("Penni");
        for (int i = 0; i < numOfCups; i++) {
            String buffer =  arrayDeque.pollFirst();
            arrayDeque.addLast(buffer);
            arrayDeque.addLast(buffer);
        }
        System.out.println(arrayDeque);
    }
}
