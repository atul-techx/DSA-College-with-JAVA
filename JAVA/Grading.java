import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Marks : ");
        int Marks = input.nextInt();

        if (Marks>=90){
            System.out.println("A");
        }else if(Marks>=80){
            System.out.println("B");
        }else if(Marks>=60){
            System.out.println("C");
        }else if(Marks>=40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
