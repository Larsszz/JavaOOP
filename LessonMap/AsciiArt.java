package LessonMap;


import java.util.HashMap;

public class AsciiArt {
    private HashMap<Character, String[]> asciiMap = new HashMap<>();

    public AsciiArt(HashMap<Character, String[]> asciiMap) {
        this.asciiMap = asciiMap;
    }


    public AsciiArt() {

        String[] a = new String[5];
        a[0] = "    *     ";
        a[1] = "   * *    ";
        a[2] = "  *   *   ";
        a[3] = " *******  ";
        a[4] = "*       * ";

        String[] b = new String[5];
        b[0] = "********  ";
        b[1] = "*       * ";
        b[2] = "********  ";
        b[3] = "*       * ";
        b[4] = "********  ";

        String[] c = new String[5];
        c[0] = "********* ";
        c[1] = "*         ";
        c[2] = "*         ";
        c[3] = "*         ";
        c[4] = "********* ";

        asciiMap.put('a', a);
        asciiMap.put('b', b);
        asciiMap.put('c', c);
    }

    public void toConsole(String word) {
        char[] arrayChars = word.toCharArray();
        StringBuilder buff0 = new StringBuilder();
        StringBuilder buff1 = new StringBuilder();
        StringBuilder buff2 = new StringBuilder();
        StringBuilder buff3 = new StringBuilder();
        StringBuilder buff4 = new StringBuilder();
        for (char ch : arrayChars) {
            String[] buff = asciiMap.get(ch);
            buff0.append(buff[0]);
            buff1.append(buff[1]);
            buff2.append(buff[2]);
            buff3.append(buff[3]);
            buff4.append(buff[4]);
        }

        buff0 = buff0.append(buff1.toString()).append("\n").append(buff2.toString()).append("\n")
                .append(buff3.toString()).append("\n").append(buff4.toString()).append("\n");
        System.out.println(buff0.toString());
    }
}
