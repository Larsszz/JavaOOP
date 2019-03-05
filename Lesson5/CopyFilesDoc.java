package Lesson5;


import java.io.*;

public class CopyFilesDoc {

    public static void copyFiles (File inputDirectory, File outputDirectory) {
        if (!inputDirectory.mkdir() || !outputDirectory.mkdir()) {
            DocFilter docFilter = new DocFilter();
            File[] files = inputDirectory.listFiles(docFilter);
            if (files == null) throw new IllegalArgumentException("Cannot find files with right ext");
            for (File file: files) {
                copyFile(file, new File(outputDirectory, file.getName()));
            }
        } else throw new IllegalArgumentException("Error with dir");
    }

    public static void copyFile(File from, File to) {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Null file");
        }
        try {
            InputStream inputStream = new FileInputStream(from);
            OutputStream outputStream = new FileOutputStream(to);
            byte[] buffer = new byte[1024 * 1024];
            int readBytes = 0;
            for (; (readBytes = inputStream.read(buffer)) > 0; ) {
                outputStream.write(buffer, 0, readBytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
