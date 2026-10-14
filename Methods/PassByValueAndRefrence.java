package Methods;

public class PassByValueAndRefrence {

    // Here Both Methods have different values of a and it is called as PassByValue

    public static void change(int a){   // a = 6
        a = 10;                         // a = 10
    }
    public static void main(String[] args) {
        int a = 6;

        System.out.println(a);      // a = 6
        change(a);                  // (change(6);) Here the value of a only go for the change method not full container of a 
        System.out.println(a);      // a = 6
    }
}
