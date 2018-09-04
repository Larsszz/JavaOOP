package LvL2.Lesson3;

import java.io.*;

public class InOutGroupFile {
    public static void writeGroupToFile(Group group) {
        if (group == null) {
            throw new IllegalArgumentException("Null group");
        }
        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(group.getGroupName() + ".group"))) {
            OOS.writeObject(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Group readGroupFromFile(File file) {
        if (file == null) {
            throw new IllegalArgumentException("Null file");
        }
        Group group = new Group();
        try(ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(file))){
           group = (Group)OIS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return group;
    }
}
