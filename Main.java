package Streams;

import java.io.*;

public class Main {
    public static void main(String[] arg) {
        File folderIn = new File("src");
        File folderFrom = new File("Files");
        CopyFiles.copyFiles(folderFrom, folderIn, "pdf");

        File one = new File("a.txt");
        File two = new File ("b.txt");
        WordsClones.compareTexts(one,two);
    }
}
