import java.util.Scanner;

public class OutputAndInputArr {
    public static void main(String[] args) {
        // int[] arr = {5,-8,2,67,43,-97};

        // for(int i=0; i<arr.length; i++){             // output
        //     System.out.print(arr[i] + " ");
        // }

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        for(int i=0; i<arr.length; i++){                // Input
            // int x = sc.nextInt();
            // arr[i] = x;    

            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
