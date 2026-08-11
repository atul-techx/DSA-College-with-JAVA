import java.util.*;

public class Operators {
    public static void main(String[] args){
        int a = 30;
        int b = 50;

        int c = 40;
        int d = 60;

        int sum = a + b;

        System.out.println(sum);

        // Assignment Operators
        System.out.println("Assignment Operators : ");
        System.out.println(a+=a);
        System.out.println(a-=a);
        System.out.println(b*=b);
        System.out.println(b/=b);
        System.out.println(b%=b);

        // Arithmetic Operators
        System.out.println("Arithmetic Operators : ");
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c%d);

    }
}
