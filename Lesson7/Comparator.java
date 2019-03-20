package Lesson7;

public class Comparator implements java.util.Comparator<Char> {
    @Override
    public int compare(Char o1, Char o2) {
        if (o1.getCount()>o2.getCount()) return -1;
        if (o1.getCount()<o2.getCount()) return 1;
        else return 0;
    }
}
