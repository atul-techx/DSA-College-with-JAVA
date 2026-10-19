import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Marks : ");
        int Marks = input.nextInt();

        if (Marks>=90 && Marks<=100){
            System.out.println("Your Grade is A");
        }else if(Marks>=80 && Marks<90){
            System.out.println("Your Grade is B");
        }else if(Marks>=60 && Marks<80){
            System.out.println("Your Grade is C");
        }else if(Marks>=40 && Marks<60){
            System.out.println("You are Pass");
        }else if(Marks>=0 && Marks<40){
            System.out.println("You are Fail");
        }else{
            System.out.println("Enter Valid Input (0-100).");
        }

        input.close();
    }
}
