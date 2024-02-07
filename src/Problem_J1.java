import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Problem_J1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter P:");

        int P = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println("Points is: " + P);  // Output user input

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter C:");

        int C = Integer.parseInt(myObj2.nextLine());  // Read user input
        System.out.println("Errors is: " + C);  // Output user input


//        int P = 0;
//        int C = 10;

        int points_gain = P * 50;
        int points_lost = C * 10;

        if (P > C) {
            points_gain = points_gain + 500;
        }

        int final_points = points_gain - points_lost;

        System.out.println("Output = " + final_points);

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}