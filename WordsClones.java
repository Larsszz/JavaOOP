package Streams;

import java.io.*;

public class WordsClones {
    public static String readFromFile(File readingFile) {
        if (readingFile == null) {
            throw new IllegalArgumentException("Null File");
        }
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader buffRead = new BufferedReader(new FileReader(readingFile))) {
            String text;
            for (; (text = buffRead.readLine()) != null; ) {
                stringBuilder.append(text);
                stringBuilder.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error of reading");
        }
        return stringBuilder.toString();
    }

    public static String[] parseString(String string) {
        return string.split("[ .,\n!?]");
    }

    public static String compareWords(String[] textOne, String[] textTwo) {
        if (textOne == null || textTwo == null) {
            throw new IllegalArgumentException("Null String");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String word1txt : textOne) {
            for (String word2txt : textTwo) {
                if (word1txt.equals(word2txt)) {
                    stringBuilder.append(word1txt);
                    stringBuilder.append(System.lineSeparator());
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void writeComparableWords(String words) {
        File outFile = new File("out.txt");
        try (PrintWriter printWriter = new PrintWriter(outFile)) {
            printWriter.print(words);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void compareTexts(File one, File two) {
        String readOne = readFromFile(one);
        String readTwo = readFromFile(two);
        String[] a = parseString(readOne);
        String[] b = parseString(readTwo);
        String compare = compareWords(a, b);
        writeComparableWords(compare);
    }
}
