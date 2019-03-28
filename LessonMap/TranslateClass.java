package LessonMap;

import java.io.*;
import java.util.ArrayList;

public class TranslateClass {
    public static void translateText (File inFile) {
        if (inFile == null) {
            throw new IllegalArgumentException("Null File");
        }
        Vocabulary vocabulary = new Vocabulary();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(inFile));
            PrintWriter printWriter = new PrintWriter(new File("russian.out"))) {
            StringBuilder sb = new StringBuilder();
            String text = "";
            for (; (text = bufferedReader.readLine()) != null; ) {
                sb.append(text).append(System.lineSeparator());
            }
            String textBuff = sb.toString();
            String textOne = textBuff.toUpperCase().substring(0,textBuff.lastIndexOf("\r"));
            String[] textSpit = textOne.split("[, .!?\n]");
            ArrayList<String> array = new ArrayList<>();
            for (String word: textSpit) {
                String value = vocabulary.get(word);
                array.add(value);
            }
            StringBuilder result = new StringBuilder();
            for (String s : array) {
                result.append(" ").append(s);
            }
            printWriter.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
