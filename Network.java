package Lesson1;

public class Network {
    private String name;
    private Phone[] phones = new Phone[50];

    public Network(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Phone[] getPhones() {
        return phones;
    }

    public void setPhones(Phone[] phones) {
        this.phones = phones;
    }
}
