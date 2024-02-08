public class Sum_of_Elements {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

    int sum= sumArray(a);
    System.out.println(sum);
    int result=multiply(5,10);
        System.out.println(result);
    }

    private static int multiply(int i, int j) {
        int k=1;
        int sum=0;
        while (k<=j){
            sum = sum+i;

            k++;
        }

        return sum;
    }


    private static int sumArray (int[] a){
        int sum = 0;

        for (int j : a) {
            System.out.println(j);
            sum = sum + j;
        }

        return sum;
    }

}