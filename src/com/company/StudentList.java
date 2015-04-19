package com.company;

/**
 * Created by marina on 15.04.15.
 */
public class StudentList {

    Student[] student;

    public String toString() {
        String resultString = "";

        for (int i = 0; i < student.length; i++) {
            resultString = resultString + "\n" + student[i].name;
        }

        return resultString;
    }

public void add(Student NewStudent){
    Student[] newStudentArray;
    if (this.student == null)
        newStudentArray = new Student[1];
        else {
        newStudentArray = new Student[this.student.length + 1];
        for (int i = 0; i < this.student.length; i++) {
            newStudentArray[i] = this.student[i];
        }
    }


    newStudentArray[newStudentArray.length-1] = NewStudent;
    this.student = newStudentArray;
}
    public void remove(Student removeSudent){
    Student[] removeStudentArray = new Student[this.student.length-1];
        boolean studentIsRemoved = false;
        for (int i = 0; i < this.student.length - 1; i++) {
            if (removeSudent.equals(this.student[i]) == true) {
                studentIsRemoved = true;
            }
            if (studentIsRemoved == true)
                removeStudentArray[i] = this.student[i+1];
            else
                removeStudentArray[i] = this.student[i];
        }
        this.student = removeStudentArray;
    }

    public void smartRemove(Student removeStudent) {
        StudentList newList = new StudentList();
        for (int i = 0; i < this.student.length; i++) {
            if (this.student[i].equals(removeStudent) == false) {
                newList.add(this.student[i]);
            }
        }
        this.student = newList.student;
    }

    public Student findByName(String name) {
        for (int i = 0; i < this.student.length; i++) {
            if (name == this.student[i].name) {
                return this.student[i];
            }
        }

        return null;
    }

    public Student[] findStudentsByName (String name) {
        StudentList findStudentsList = new StudentList();
        for (int i = 0; i < this.student.length; i++) {
            if (name == this.student[i].name) {
                 findStudentsList.add(this.student[i]);
            }
        }

        return findStudentsList.student;
    }

    public Student findByElement (int index){
        for (int i = 0; i < this.student.length ; i++) {
            if (index == i) {
                return this.student[i];
            }
        }
        return null;
    }
}
