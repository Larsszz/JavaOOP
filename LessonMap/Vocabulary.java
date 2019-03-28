package LessonMap;

import java.util.HashMap;
import java.util.Scanner;

public class Vocabulary {
    private HashMap<String, String> voc = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public Vocabulary(HashMap<String, String> voc) {
        this.voc = voc;
    }

    public Vocabulary() {
        voc.put("I", "Я");
        voc.put("ME", "Мы");
        voc.put("YOU", "Ты");
        voc.put("THIS", "Этот");
    }

    public void put(String key, String value) {
        voc.put(key, value);
    }

    public String get(String key) {
        return voc.get(key);
    }

    public void manualPut() {
        System.out.println("Enter Eng word: ");
        String key = scanner.nextLine();
        System.out.println("Enter Rus word");
        String value = scanner.nextLine();
        voc.put(key,value);
        System.out.println("Successfully add");
    }


}
