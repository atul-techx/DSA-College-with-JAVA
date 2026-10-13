package Methods;

public class SyntaxOfMethods {
    public static void main(String[] args) {
        atul();
        ajay();
    }

    public static void atul(){
        System.out.println("Atul");
        arti();
    }

    public static void arti(){                                     // The Output is Atul, Arti, Atul, Arti, Arti, Ajay, Atul, Arti
        System.out.println("Arti");
    }

    public static void ajay() {
        atul();
        arti();
        System.out.println("Ajay");
        atul();
    }
}
