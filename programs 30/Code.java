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
        }
     int max = a[0] , min=a[0];

     for (int i =1 ; i<a.length ; i++)
     {
        if (a[i] > max)
             max= a[i];

         if (a[i] < min)
             min= a[i];
      }

  System.out.println("Maximum Number Of Array:"+max);
  System.out.println("Minimum Number Of Array:"+min);
        in.close();
    }
}
