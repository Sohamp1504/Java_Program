//Write a program to create a vector with 7 elements as 10, 30, 50, 20, 80, 60, and remove the element 3rd position insert 100 at 3rd position display the current size of vector.

import java.util.Vector;

public class Code {
    public static void main(String[] args) {
        
        Vector<Integer> vec = new Vector<>();
        vec.add(10);
        vec.add(30);
        vec.add(50);
        vec.add(20);
        vec.add(80);
        vec.add(60);
        vec.add(70);

       
        System.out.println("Original Vector: " + vec);

        vec.remove(2);

        vec.add(2, 100);

        System.out.println("Updated Vector: " + vec);

        System.out.println("Current Size of Vector: " + vec.size());
    }
}
