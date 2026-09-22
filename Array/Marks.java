// import java.util.*;

class Marks{
    public static void main(String[] args) {
        int marks[] = {40,30,35,60,70};

        // System.out.println("Index 2: " + marks[2]);

        // marks[2] = 45;
        // System.out.println("Index 2: " + marks[2]);

        //  Traversal using for Loop

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // For Each

        // for(int x: marks){
        //     System.out.println(x);
        // }

        // while loop

        // int i = 0;
        // while(i<marks.length){
        //     System.out.println(marks[i]);
        //     i++;
        // }

        int newmarks[] = marks;

        System.out.println(newmarks[2]);
    }
}