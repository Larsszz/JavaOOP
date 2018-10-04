package Lesson1;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("iPhone", "0987796997");
        Phone p2 = new Phone("Samsung", "0506232107");
        Phone p3 = new Phone("Huawei", "0952295875");
        Network mts = new Network("MTC");
        p1.registerInNetwork(mts);
        p2.registerInNetwork(mts);
        p3.registerInNetwork(mts);
        p1.call("0506232107",mts);
    }
}
