package Lesson5;

import java.io.*;
import java.util.ArrayList;

public class CompareTexts {
    public static String[] downloadWords(File file) {
        StringBuilder sb = new StringBuilder();
        if (file == null) {
            throw new IllegalArgumentException("Null File");
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String text = "";
            for (; (text = bufferedReader.readLine()) != null; ) {
                sb.append(text).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = sb.toString();
        return text.split("[, .!?\n]");
    }

    public static ArrayList<String> savedWords(String[] arr1, String[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Error with arrays");
        }
        ArrayList<String> text = new ArrayList<String>();
        for (String st1 : arr1) {
            for (String st2 : arr2) {
                if (!text.contains(st1) && st1.equals(st2))
                    text.add(st1);
            }
        }
        return text;
    }

    public static void saveTextInFile(ArrayList<String> text) {
        if (text == null) {
            throw new IllegalArgumentException("Null text");
        }
        try (PrintWriter printWriter = new PrintWriter(new File("equals.txt"))) {
            printWriter.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void compareWords(File f1, File f2) {
        if (f1 == null || f2 == null) {
            throw new IllegalArgumentException("Null file!!");
        }
        String[] words1 = downloadWords(f1);
        String[] words2 = downloadWords(f2);
        saveTextInFile(savedWords(words1, words2));
    }
}
