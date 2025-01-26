// deveolpe The Program To Find The Sum And Average Of 5 Intergers

import java.util.*;

class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[5];
        int sum = 0;
        double avg;

        System.out.println("Enter Five numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }
     
        avg = (double) sum / a.length;
    
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + avg);

        in.close();
    }
}
