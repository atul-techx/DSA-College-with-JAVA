import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if (age >= 20 && age < 60){
            System.out.println("You are eligible for Vote ");
        }else{
            System.out.println("You are not eligible for vote");
        }

        input.close();
    }
}
