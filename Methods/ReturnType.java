package Methods;

public class ReturnType {
    public static int atul(int a){
        System.out.println("Atul");

        if (a>0) return 4;       // End of Method, 
        else return 10;
    }

    public static void main(String[] args) {
        int a = atul(7);                                 // Atul
        System.out.println(a);                          // 4
        System.out.println(a + 5);                      // 4 + 5 = 9
    }
}
