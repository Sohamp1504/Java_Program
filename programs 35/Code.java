// Develope The Program Of Fibonacci Series

public class Code {
    public static void main(String[] args) {
        int n = 10; 
        int[] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;
        System.out.print("Fibonacci Series: " + fib[0] + ", " + fib[1]);

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(", " + fib[i]);
        }
    }
}
