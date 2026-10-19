public class Table {
    public static void main(String[] args) {
        int n  = 5;
        System.out.println("Tabe of 5 is : ");
        int sum = 0;

        for(int i=1; i<=10; i++){
            int table = i*n;
            System.out.println(table);
            
            sum  = sum+table;

        }
        System.out.println("Sum of all elements : " + sum);

        
    }
}
