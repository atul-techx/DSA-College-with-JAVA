import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter Your Age : ");
        int age = input.nextInt();

        if (age > 0 && age < 20){
            System.out.println("You are not eligible for vote.");
        }else if (age <= 0) {
            System.out.println("Enter Valid Age");  
        }else{
            System.out.println("You are eligible for Vote.");
        }
        input.close();
    }
}
