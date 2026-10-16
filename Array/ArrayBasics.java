
public class ArrayBasics{
    public static void main(String[] args) {

        // First way of initialization of Array
        int[] x = {6, 19, 7, 69, 9, 171, 5};
        // indexing --> 0,1,2,3,4,5,6

        System.out.println(x[0]);       // x[0] = 6
        System.out.println(x[5]);       // x[5] = 171

        // Updating elements of array -> Mutable
        x[3] = 34;
        System.out.println(x[3]);       // x[3] = 34

        // Second way of initialization of Array

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;        // Manualy put value one by one
        arr[2] = 30;
        arr[3] = 40;

        System.out.println(arr[2]);


    }
}