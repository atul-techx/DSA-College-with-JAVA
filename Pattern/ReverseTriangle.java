import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n+1-i; j++){     // Without using third variable
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        int a = n;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=a; j++){    // Using third variable
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }

        sc.close();
    }
}
