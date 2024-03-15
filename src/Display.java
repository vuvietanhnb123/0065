/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.lang.*;
/**
 *
 * @author ACER
 */
class Display {

    void displayGUI() {
        System.out.println("====== Management Student Program ======");
    }

    void averageStudent(ArrayList<Student> studentList) {
        //loop to access each student in list from beginning to end
        for (Student student : studentList) {
            System.out.println("------ Student" + (studentList.indexOf(student) + 1)
            + " Info ------");
            System.out.println("Name:" + student.getStudentName());
            System.out.println("Classes:" + student.getClassName());
            System.out.println("AVG:" + student.getAverage());
            System.out.println("Type:" + student.getType());
        }
        
    }

    void displayClassificationInfo(HashMap<String, Double> persentType) {
        System.out.println("--------Classification Info -----");
        //loop to access each key-value of object in Map from beginning to end 
        for (Map.Entry student : persentType.entrySet()) {
            System.out.println(student.getKey() + " :" + student.getValue() + "%");
        }

    }

}
