import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter Your Age : ");
        int Age = input.nextInt();

        System.out.print("You have licence ans in (true or false) : ");
        boolean haslicence = input.nextBoolean();

        if(Age >= 18){
            if(haslicence){
                System.out.println("You are eligible to Drive.");
            }else{
                System.out.println("You have need DL for Driving.");
            }
        }else{
            System.out.println("You are Underage.");
        }

    }
}
