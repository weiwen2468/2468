import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Problem_J2 {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number of Peppers:");

        int N = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println("Number of Peppers: " + N);  // Output user input

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Name of Peppers:");

        String s = myObj2.nextLine();  // Read user input
        System.out.println("Name of Peppers " + s);  // Output user input


        List<String> myList = new ArrayList<>(Arrays.asList(s.split(" ")));

        System.out.println(myList.get(2));

        int output = 0;
        for (int i = 0; i < N; i++) {
            switch (myList.get(i)) {
                case "Poblano":
                    output = output + 1500;
                    break;
                case "Mirasol":
                    output = output + 6000;
                    break;
                case "Serrano":
                    output = output + 15500;
                    break;
                case "Cayenne":
                    output = output + 40000;
                    break;
                case "Thai":
                    output = output + 75000;
                    break;
                case "Habanero":
                    output = output + 125000;
                    break;
                default:

                    break;
            }
        }
        System.out.println("Ron's chill's heat: " + output);



//
//        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter C:");
//
//        int C = Integer.parseInt(myObj2.nextLine());  // Read user input
//        System.out.println("Errors is: " + C);  // Output user input
//
//
////        int P = 0;
////        int C = 10;
//
//        int points_gain = P * 50;
//        int points_lost = C * 10;
//
//        if (P > C) {
//            points_gain = points_gain + 500;
//        }
//
//        int final_points = points_gain - points_lost;
//
//        System.out.println("Output = " + final_points);

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}