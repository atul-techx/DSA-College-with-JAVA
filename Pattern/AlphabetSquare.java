import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print((char)(j+64) + " ");    // For Capital Letters
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)(j+96) + " ");   // For Small Letters 
            }
            System.out.println();
        }
        input.close();
    }
}
