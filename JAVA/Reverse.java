import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter your number : ");
        int x = in.nextInt();
        int rev = 0;
        while(x>0){
            int digit = x % 10;
            rev = (rev*10) + digit;
            x = x/10;
        }
        System.out.println("Your Reverse number is : " + rev);
    }
}