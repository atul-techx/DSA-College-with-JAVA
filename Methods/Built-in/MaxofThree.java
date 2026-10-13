import java.util.*;

public class MaxofThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers seprated by space : ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        System.out.println(Math.max(a, Math.max(b, c)));
    }
}
