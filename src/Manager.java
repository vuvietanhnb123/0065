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
class Manager {

    void createStudent(ArrayList<Student> studentList) {
        GetData getData = new GetData();
        while (true) {
            String name = getData.getString("Name:");
            String classes = getData.getString("Classes:");
            double maths = getData.getMark("Maths:", "Math");
            double chemistry = getData.getMark("Chemistry:", "Chemistry");
            double physics = getData.getMark("Physics:", "Physics");
            double average = (maths + chemistry + physics) / 3;
            char type = getType(average);
            studentList.add(new Student(name, classes, maths, physics, chemistry, average, type));
            //loop until enter Y or N
            Outer:
            while (true) {
                String response = getData.getString("Do you want to enter more student information?(Y/N):");
                switch (response) {
                    case "Y":
                        //response is Yes
                        break Outer;
                    case "N":
                        //response is No
                        return;
                    default:
                        System.out.println("Please enter \'Y' or \'N'");
                        break;
                }
            }
        }

    }

    void getPercentTypeStudent(ArrayList<Student> studentList) {
        Display display = new Display();
        HashMap<String, Double> persentType = new HashMap<>();
        double typeA = 0;
        double typeB = 0;
        double typeC = 0;
        double typeD = 0;
        //loop to access each student in list from beginning to end
        for (Student student : studentList) {
            switch(student.getType()) {
                case 'A':
                    typeA++;
                    break;
                case 'B':
                    typeB++;
                    break;
                case 'C':
                    typeC++;
                    break;
                case 'D':
                    typeD++;
                    break;
            }
        }
        persentType.put("A", typeA * 100 / studentList.size());
        persentType.put("B", typeB * 100 / studentList.size());
        persentType.put("C", typeC * 100 / studentList.size());
        persentType.put("D", typeD * 100 / studentList.size());
        //display classification info
        display.displayClassificationInfo(persentType);
    }

    private char getType(double average) {
        char result = 0;
        if (average < 4)
            result = 'D';
        else if (average >= 4 && average < 6)
            result = 'C';
        else if (average >= 6 && average <= 7.5)
            result = 'B';
        else if (average > 7.5)
            result = 'A';
        return result;
    }

}
