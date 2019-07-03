package LvL2.Lesson3;

public class FullGroupException extends Exception {
    @Override
    public String getMessage() {
        return "You cannot add 11 students";
    }
}
