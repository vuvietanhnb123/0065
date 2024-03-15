
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author thaycacac
 */
public class Main {

    public static void main(String[] args) {
        Display display = new Display();
        Manager manager = new Manager();
        ArrayList<Student> studentList = new ArrayList<>();
        //Step 1: Display GUI
        display.displayGUI();
        //Step 2: Get input data
        manager.createStudent(studentList);
        //Step 3: Display results of student
        display.averageStudent(studentList);
        //Step 4: Display statistic results
        manager.getPercentTypeStudent(studentList);
    }
}