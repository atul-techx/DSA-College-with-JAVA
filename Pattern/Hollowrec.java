// package Pattern;

public class Hollowrec {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=6; j++){
                if (i==1 || i==4) {
                    System.out.print("* ");
                }else if (i==2 || i==3) {
                    if (j==1 || j==6) {
                        System.out.println("* ");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
