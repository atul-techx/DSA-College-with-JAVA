import java.util.Scanner;

public class MaxofFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers seprated by space : ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();

        System.out.println(Math.max(a, Math.max(b, Math.max(c, d))));

        in.close();
    }
}
