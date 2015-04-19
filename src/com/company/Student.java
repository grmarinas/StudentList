package com.company;

/**
 * Created by marina on 15.04.15.
 */
public class Student {
    String name;
    int group;

    public Student(String name, int group) {
        this.name = name;
        this.group = group;
    }


    public String toString() {
        String resultString = new String();
        resultString = this.name + " " + this.group;
        return resultString;
    }

    public boolean equals (Student otherStudent) {
        if (this.name == otherStudent.name && this.group == otherStudent.group)
            return true;
        else
            return false;

    }

    public int getGroup() {
        return group;
    }
}
