import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print((char)(j+64) + " ");    // For Capital Letters [A B C D]
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print((char)(j+96) + " ");   // For Small Letters [a b c d]
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print((char)(i+64) + " ");   //  For Capital Letter [A A A A]
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if (i%2 != 0) {
                    System.out.print((char)(i+96) + " ");   //  For Small Letter [a a a a]
                }else{
                    System.out.print((char)(i+64) + " ");   //  For Small Letter [B B B B]
                }
                
            }
            System.out.println();
        }
        input.close();
    }
}
