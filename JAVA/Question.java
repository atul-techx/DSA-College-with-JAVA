import java.util.*;

public class Question{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt();

        int sum = 0;

        for(int i=1; i<=num; i++ ){
            sum = sum + (i*i*i);
        }

        System.out.print("The ans is : " + sum);
    
    }
}