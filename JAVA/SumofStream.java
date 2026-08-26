import java.util.Scanner;

public class SumofStream {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;
        int sum = 0;

        while(n != -1){

            System.out.print("Enter next Number : ");
            
            sum  = sum + n;
            n = in.nextInt();
            
            // if(n != -1){
            //     sum = sum + n;
            // }
            
        }

        System.out.println("Sum is : " + sum);

       
    }
}
