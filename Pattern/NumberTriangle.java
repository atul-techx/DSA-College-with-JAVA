import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print((char)(j+64) + " ");  // For Capital Letters [A, A B, A B C, A B C D]
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+96) + " ");  // For Small Letters [a, a b, a b c, a b c d]
            }
            System.out.println();
        }

        sc.close();
    }
}
