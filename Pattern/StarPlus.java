import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();    // n is Odd only

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if (i==n/2+1 || j==n/2+1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
