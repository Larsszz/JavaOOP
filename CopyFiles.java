package Streams;

import java.io.*;

public class CopyFiles {
    public static void copyFiles(File folderOfCopy, File folderInCopy, String ext) {
        if (folderInCopy == null || folderOfCopy == null || ext == null) {
            throw new IllegalArgumentException("Null folder");
        }
        CopyFilter fileFilter = new CopyFilter(ext);
        File[] filterFiles = folderOfCopy.listFiles(fileFilter);
        if (filterFiles != null) {
            for(File file : filterFiles) {
                copyFile(file, new File(folderInCopy, file.getName()));
            }
        }

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
