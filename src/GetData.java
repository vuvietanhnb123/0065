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
class GetData {
    Scanner sc = new Scanner(System.in);
    String getString(String inputMsg) {
        //loop until enter correct string
        while (true) {
            System.out.print(inputMsg);
            try {
                String input = sc.nextLine();
                //check if input is empty
                if (input.isEmpty()) 
                    throw new Exception();
                return input;
            } catch (Exception e) {
                System.out.println("Cannot be empty");
            }
        }
    }

    double getMark(String inputMsg, String subject) {
        //loop until enter correct mark
        while (true) {
            System.out.print(inputMsg);
            try {
                double mark = Double.parseDouble(sc.nextLine());
                //compare mark with 0
                if (mark < 0) {
                    System.out.println(subject + " is greater than equal zero");
                    continue;
                }
                //compare mark with 10
                if (mark > 10) {
                    System.out.println(subject + " is less than equal ten");
                    continue;
                }
                return mark;
            } catch (NumberFormatException nfe) {
                System.out.println(subject + " is digit");
            }
        }
    }

}
