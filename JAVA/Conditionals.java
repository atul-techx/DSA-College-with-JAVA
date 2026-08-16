import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter Your Age : ");
        int age = input.nextInt();

        if (age > 0 && age < 18){
            System.out.println("You are not eligible for vote.");
        }else{
            System.out.println("You are elegible for Vote.");
        }
    }
}
