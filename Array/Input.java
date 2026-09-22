import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int n = in.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elemnts in array: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Your Array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        in.close();

    }
}
