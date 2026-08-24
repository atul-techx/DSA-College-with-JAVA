import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int i = input.nextInt();
        int n = 1;

        while(n<=i){
            System.out.println(n);
            n++;
        }
    }
}
