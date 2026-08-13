import java.util.Scanner;

public class InOut{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int Age = input.nextInt();

        System.out.print("Enter your Number : ");
        int Num = input.nextInt();

        System.out.println("My age is : " + Age + " and the number i entered is : " + Num);
    }
}



// public class InOut {
//     public static void main(String[] args){
//         // Output Syntax
//         String Name = "Atul";
//         System.out.println("My Name is : " + Name);

//         int age = 20;
//         System.out.println("I'm somewhere around "+ age);

//         float CGPA = 8.7f;
//         System.out.println("My CGPA until 2026 is : "+ CGPA);

//     }
// }
