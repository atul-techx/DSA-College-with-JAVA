import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Question 1st
        System.out.print("Enter Your Name : ");
        String Name = input.nextLine();

        System.out.println("My Name is : "+ Name);

        // Question 2nd
        System.out.print("Enter first Number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();

        int rem = a % b;
        System.out.println("The Remainder is : "+ rem);

        // Question 3rd
        System.out.print("Enter a Character : ");

        char Ch = input.next().charAt(0);
        System.out.println("The Character is : "+Ch);

        input.close();

    }   
}
