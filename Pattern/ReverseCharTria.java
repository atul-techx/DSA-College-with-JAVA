import java.util.Scanner;

public class ReverseCharTria {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n+1-i; j++){
        //         System.out.print((char)(j+64) + " ");    // For Capital Lettes [A B C D]
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print((char)(j+96) + " ");   // For Small Letters [a b c d]
            }
            System.out.println();
        }

        sc.close();
    }
}
