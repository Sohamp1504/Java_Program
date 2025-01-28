//Develope The Program To Print Array Number In Reverse Order

import java.util.Scanner;

class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.println("Enter the number of elements in the array: ");
        int n = in.nextInt();

        
        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) { 
            arr[i] = in.nextInt();
        }

       
        int start = 0, end = arr.length - 1; 
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

       
        System.out.println("Reversed Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        in.close();
    }
}
