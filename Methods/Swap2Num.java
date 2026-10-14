package Methods;

import java.util.Scanner;

public class Swap2Num {

    public static void swap(int a, int b){
        int temp = a;

        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        swap(a, b);             // we are only passing the value of a, b not the whole container thats by the value of a, b is not changing

        System.out.println(a + " " + b);

        sc.close();
    }
}
