//develope The Program To Print The Length Of each String

import java.util.Arrays;
import java.util.Scanner;

class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

     
        System.out.println("Enter the number of strings: ");
        int n = in.nextInt();
        in.nextLine(); // Consume the newline character

        
        String[] arr = new String[n];

        
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine();
        }

      
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

      
        System.out.println("Sorted Strings (by length):");
        for (String str : arr) {
            System.out.println(str + " (Length: " + str.length() + ")");
        }

        in.close();
    }
}
