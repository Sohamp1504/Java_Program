//Develope The Program To Implement The Bubble Sort Algorithm

import java.util.Scanner;

class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.println("Enter the number of elements in the array: ");
        int n = in.nextInt();

        
        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) { // Fixed: Changed i = 1 to i = 0
            arr[i] = in.nextInt();
        }

       
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - 1 - i; j++) { 
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        in.close();
    }
}

