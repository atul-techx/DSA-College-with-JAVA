import java.util.Scanner;

public class Number2Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int a = 1;

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print(a + " ");
        //     }
        //     a++;
        //     System.out.println();
        // }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i + " "); // Without Using another Variable
            }
            System.out.println();
        }

        sc.close();
    }
}
