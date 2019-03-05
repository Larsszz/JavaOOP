package Lesson5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("first.txt");
        File f2 = new File("second.txt");
        CompareTexts.compareWords(f1,f2);
    }
}

