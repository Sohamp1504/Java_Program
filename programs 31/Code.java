//Develope The Progam To Find The Occurrence Of A Number In The Array

import java.util.Scanner;

class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the number to find its occurrence:");
        int target = in.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        
        if (count > 0) {
            System.out.println("The number " + target + " occurs " + count + " times in the array.");
        } else {
            System.out.println("The number " + target + " does not occur in the array.");
        }

        in.close();
    }
}
