package Methods;

public class MaxofTwo {

    public static int max(int a, int b){
        if (a>=b) {
            return a;               // In Java if we using return statement inside if in a function 
        }else{                      // so we also have to write else with it otherwise it give an error 
            return b;
        }
    }
    public static void main(String[] args) {
        int x = max(5, 8);
        System.out.println(x);
        
        System.out.println(max(65, 24));
    }
    
}
