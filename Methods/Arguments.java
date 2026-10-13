package Methods;

public class Arguments {
    // public static void sum(int a , int b){      // Parameters (int a, int b)
    //     System.out.println(a+b);
    // }

    public static void max(int a, int b, int c){
        if (a>=b && a>=c) System.out.println(a);
        else if (b>=a && b>=c) System.out.println(b);
        else System.out.println(c);
    }

    public static void main(String[] args) {
        // sum(6, 8);      // Arguments sum(6, 8)

        max(35, 45, 25);
    }
}
