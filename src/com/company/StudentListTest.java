package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by marina on 19.04.15.
 */
public class StudentListTest {

    @Test
    public void testAdd() throws Exception {
        Student[] newStudentsArray = {new Student("h",5), new Student("d",9), new Student("i",6)};
        Student student1 = new Student("J",3);
        StudentList newStudentList = new StudentList();
        newStudentList.student = newStudentsArray;
        newStudentList.add(student1);

        Student[] expected = {new Student("h",5), new Student("d",9), new Student("i",6), new Student("J",3)};

       boolean isNotEquals = true;

        if (newStudentList.student.length == expected.length) {
            for (int i = 0; i < newStudentList.student.length; i++) {
                if(newStudentList.student[i].equals(expected[i])) {
                    isNotEquals = false;
                }
                else {
                    isNotEquals = true;
                    break;
                }
            }
        }

        Assert.assertFalse("testAdd is failed", isNotEquals);
    }

    @Test
    public void testSmartRemove() throws Exception {
        Student [] removeStudentArray = {new Student("a",1), new Student("b",2)};
        Student student1 = new Student("b",2);
        StudentList removeStudentList = new StudentList();
        removeStudentList.student = removeStudentArray;
        removeStudentList.smartRemove(student1);

        Student [] expected = {new Student("a",1)};

        boolean isNotEquals = true;

        if (removeStudentList.student.length == expected.length) {
            for (int i = 0; i < removeStudentList.student.length; i++) {
                if(removeStudentList.student[i].equals(expected[i])) {
                    isNotEquals = false;
                }
                else {
                    isNotEquals = true;
                    break;
                }
            }
        }

        Assert.assertFalse("testRemove is failed", isNotEquals);


    }

    @Test
    public void testFindStudentsByName() throws Exception {
        Student [] newStudentArray = {new Student("a",1), new Student("b",2)};
        StudentList newStudentList = new StudentList();
        newStudentList.student = newStudentArray;
        Student[] actual = newStudentList.findStudentsByName("a");


        Student [] expected = {new Student("a",1)};

        boolean isNotEquals = true;

        if (actual.length == expected.length) {
            for (int i = 0; i < actual.length; i++) {
                if(actual[i].equals(expected[i])) {
                    isNotEquals = false;
                }
                else {
                    isNotEquals = true;
                    break;
                }
            }
        }

        Assert.assertFalse("testFindStudentsByName is failed", isNotEquals);

    }

    @Test
    public void testFindByElement() throws Exception {
        Student [] newStudentArray = {new Student("a",1), new Student("b",2)};
        StudentList newStudentList = new StudentList();
        newStudentList.student = newStudentArray;
        Student actualStudent = newStudentList.findByElement(1);

        Student expectedStudent = new Student("b",2);

        boolean isNotEquals = true;


                if(actualStudent.equals(expectedStudent)) {
                    isNotEquals = false;
                }
                else {
                    isNotEquals = true;
                }



        Assert.assertFalse("testFindByElement is failed", isNotEquals);



    }
}