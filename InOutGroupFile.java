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
        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(file))) {
            group = (Group) OIS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return group;
    }

    public static void writeStackOfGroups(StackOfGroups stack) {
        if (stack == null) {
            throw new IllegalArgumentException("Null group");
        }
        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(stack.hashCode() + ".stack"))) {
            OOS.writeObject(stack);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StackOfGroups readStackOfGroups(File file) {
        if (file == null) {
            throw new IllegalArgumentException("Null file");
        }
        StackOfGroups stack = new StackOfGroups();
        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(file))) {
            stack = (StackOfGroups) OIS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return stack;
    }
}
