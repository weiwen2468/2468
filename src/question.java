import java.util.Arrays;
import java.util.Scanner;

public class question {

    public static void sortNumbers(int[] array) {
        Arrays.sort(array);
    }

    public static void reverseSortNumbers(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numbers separated by commas: ");

        // Read the input String and split it by commas
        String s = myObj.nextLine();
        String[] strArray = s.split(",");

        // Convert the array of Strings to an array of ints
        int[] numArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numArray[i] = Integer.parseInt(strArray[i].trim()); // trim to remove leading/trailing spaces
        }

        // Call the reverseSortNumbers method and pass the array of ints
        reverseSortNumbers(numArray);
        System.out.println("Descending order: " + Arrays.toString(numArray)); // [9, 7, 5, 4, 3, 1]

        // Call the sortNumbers method and pass the array of ints
        sortNumbers(numArray);
        System.out.println("Ascending order: " + Arrays.toString(numArray)); // [1, 3, 4, 5, 7, 9]
    }
}




