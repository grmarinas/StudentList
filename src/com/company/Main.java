package com.company;

public class Main {

    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.add(new Student("John", 5));
        list.add(new Student("Stive", 7));
        list.add(new Student("Albert", 5));
        list.add(new Student("Stive", 5));
        list.add(new Student("Sara", 8));
        list.add(new Student("Stive", 9));

//        list.smartRemove(new Student("Stive", 7));

       // Student findedStudent = list.findByName("Stive");
       // System.out.println(findedStudent.name);

      /*  Student[] findStudentsByName = list.findStudentsByName("Stive");
        for (int i = 0; i < findStudentsByName.length ; i++) {
            System.out.println(findStudentsByName[i].toString());
        }*/

//        list.remove(new Student("Stive", 7));

        //System.out.println(list.toString());

        Student findByElement = list.findByElement(1);
        System.out.println(findByElement);
    }
}
