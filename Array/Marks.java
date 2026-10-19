
class Marks {
    public static void main(String[] args) {

        // Declare and initialize an array of marks
        int marks[] = {20, 45, 85, 78, 89, 65, 48};

        // Access an element using its index
        // System.out.println("Marks at index 2: " + marks[2]);

        // Update an element at a specific index
        // marks[2] = 45;
        // System.out.println("Updated marks at index 2: " + marks[2]);

        // 1. Array Traversal using a for loop
        // The loop runs from index 0 to marks.length - 1
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // 2. Array Traversal using an enhanced for loop (for-each)
        // It accesses each element directly without using an index
        // for (int x : marks) {
        //     System.out.println(x);
        // }

        // 3. Array Traversal using a while loop
        // int i = 0;
        // while (i < marks.length) {
        //     System.out.println(marks[i]);
        //     i++;
        // }

        // Assign the marks array reference to newmarks
        // Both variables refer to the same array in memory
        int newmarks[] = marks;

        // Print the element at index 2 using newmarks
        System.out.println("Marks at index 2: " + newmarks[2]);
    }
}
