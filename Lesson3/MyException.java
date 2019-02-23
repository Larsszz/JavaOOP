package Lesson3;

public class MyException extends Exception {
    @Override
    public String getMessage() {
        return "Cannot add 11 students. Delete anyone, please!";
    }
}
