package LessonMap;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("English.in");
        TranslateClass.translateText(file);
    }
}
