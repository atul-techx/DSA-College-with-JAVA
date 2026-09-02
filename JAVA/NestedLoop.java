import java.util.Scanner;

public class NestedLoop{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value of row : ");
        int row = in.nextInt();

        System.out.print("Enter value of column : ");        
        int column = in.nextInt();


        for (int i=1; i<=row; i++){
            for (int j=1; j<=column; j++){
                System.out.print(i + "," +j + "   ");
            }
            System.out.println();
        }
    }
}