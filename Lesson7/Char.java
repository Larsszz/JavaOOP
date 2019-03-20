package Lesson7;

import java.util.Comparator;

public class Char {
    private char latter;
    private int count;

    public Char(char c, int i) {
        latter = c;
        count = i;
    }

    public char getLatter() {
        return latter;
    }

    public void setLatter(char latter) {
        this.latter = latter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Letter - " + latter + "  count - " + count + "\n";
    }
}
