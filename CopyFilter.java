package Streams;

import java.io.*;

public class CopyFilter implements FileFilter {
    private String extentd;

    public CopyFilter(String extentd) {
        this.extentd = extentd;
    }

    public CopyFilter() {
    }

    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return ext.equals(extentd);
    }
}
