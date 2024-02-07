import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Problem_J2 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number of Peppers:");

        int N = Integer.parseInt(myObj.nextLine());
        System.out.println("Number of Peppers: " + N);

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter Name of Peppers:");

        String s = myObj2.nextLine();
        System.out.println("Name of Peppers: " + s);


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

    }
}