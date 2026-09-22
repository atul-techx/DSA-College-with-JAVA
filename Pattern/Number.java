import java.util.*;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = input.nextInt();
        int col = input.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        input.close();
    }
}
