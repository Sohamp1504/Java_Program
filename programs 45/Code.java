//Develope The Program Number triangle Pattern

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n - i; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
