package Lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        File f1 = new File("Text.txt");
        methodOne(f1);
    }

    public static void methodOne(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String st1 = "";
            StringBuilder st2 = new StringBuilder();
            for (; (st1 = br.readLine()) != null; ) {
                st2.append(st1);
            }
            String result = st2.toString().toLowerCase();
            ArrayList<Char> arrayList = new ArrayList<Char>();
            for (char i = 'a'; i <= 'z'; i++) {
                int count = countOfLetter(result, i);
                if (count > 0) {
                    arrayList.add(new Char(i,count));
                }
            }
            arrayList.sort(new Comparator());
            System.out.println(arrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countOfLetter(String txt, char c) {
        int res = 0;
        for (char c1 : txt.toCharArray()) {
            if (c1 == c) {
                res += 1;
            }
        }
        return res;
    }


}
