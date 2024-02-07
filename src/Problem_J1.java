import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Problem_J1 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter P:");

        int P = Integer.parseInt(myObj.nextLine());
        System.out.println("Points is: " + P);

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter C:");

        int C = Integer.parseInt(myObj2.nextLine());
        System.out.println("Errors is: " + C);


        int points_gain = P * 50;
        int points_lost = C * 10;

        if (P > C) {
            points_gain = points_gain + 500;
        }

        int final_points = points_gain - points_lost;

        System.out.println("Output = " + final_points);


    }
}