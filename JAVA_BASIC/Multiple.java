public class Multiple {
    public static void main(String[] args) {
        int n = 1;
        while(true){
            if(n % 5 == 0 && n % 7 == 0){
                System.out.println("First multiple of 5 and 7 is : " + n);
                break;
            }
            n += 2;
        }
    }
}
