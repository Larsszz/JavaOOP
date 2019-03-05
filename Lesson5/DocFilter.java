package Lesson5;

import java.io.File;
import java.io.FileFilter;

public class DocFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return ext.equals("doc");
    }
}
