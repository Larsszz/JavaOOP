package LvL2.Lesson3;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;

public class StackOfGroups implements Serializable {
    private Group[] groups = new Group[10];

    public StackOfGroups(Group[] groups) {
        this.groups = groups;
    }

    public StackOfGroups() {
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "StackOfGroups{" +
                "groups=" + (groups == null ? null : Arrays.asList(groups)) +
                '}';
    }

    public void addGroup(Group group) {
        if (group == null) {
            throw new IllegalArgumentException("You add null group");
        }
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] == null) {
                groups[i] = group;
                break;
            }
            if (i == groups.length - 1) {
                groups = Arrays.copyOf(groups, groups.length+1);
                groups[groups.length-1] = group;
                break;
            }
        }
    }

    public void addGroup(File file) {
        if (file == null) {
            throw new IllegalArgumentException("You add null group");
        }
        Group group = InOutGroupFile.readGroupFromFile(file);
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] == null) {
                groups[i] = group;
                break;
            }
            if (i == groups.length - 1) {
                groups = Arrays.copyOf(groups, groups.length+1);
                groups[groups.length-1] = group;
                break;
            }
        }
    }

    public Group findGroupByName (String nameOfGroup) {
        for (Group group: groups) {
            if (group.getGroupName().equals(nameOfGroup)) {
                return group;
            }
        }
        return null;
    }
}
