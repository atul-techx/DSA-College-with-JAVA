import java.util.*;

public class Operators {
    public static void main(String[] args){
        int a = 30;
        int b = 50;

        int c = 40;
        int d = 60;

        // Assignment Operators
        System.out.println("Assignment Operators : \n");
        System.out.println(a+=a);
        System.out.println(a-=a);
        System.out.println(b*=b);
        System.out.println(b/=b);
        System.out.println((b%=b) + "\n");
        

        // Arithmetic Operators
        System.out.println("Arithmetic Operators : \n");
        System.out.println("Addition: " + c+d);
        System.out.println("Subtraction: " + (c-d));
        System.out.println("Multiplication: " + c*d);
        System.out.println("Devision: " + c/d);
        System.out.println("Remainder: " + c%d + "\n");
        

        // Relational/Comparison Operators
        int A = 20;
        int B = 40;

        System.out.println("Relational Operators : \n");
        System.out.println("Equal to : " + (A==B));
        System.out.println("Not Equal to : " + (A!=B));
        System.out.println("Greater Then : " + (A>B));
        System.out.println("Less Then : " + (A<B));
        System.out.println("Greater Then equal to : " + (A>=B));
        System.out.println("Less then Then equal to : " + (A<=B) + "\n");

        // Logical Operators
        int C = 40;
        int D = 60;

        System.out.println("Logical Operators : \n");
        System.out.println(C>D && C<D);
        System.out.println(C>D || C<D);
        System.out.println((C!=D) + "\n");

    }
}
