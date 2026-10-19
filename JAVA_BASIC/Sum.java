import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int sum = 0;
        int i = 1;
        while(a>=i){
            sum  = sum+i;
            i++;
        }
        System.out.println("Sum of all numbers till a : "+ sum);

        input.close();
    }
}
