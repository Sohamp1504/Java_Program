//Develope The Program To Find The Number Of The Square 

import java.util.*;

  class Code {
    public static void main (String [] args) {
      int n , sq;

      Scanner in = new Scanner (System.in);
      System.out.println("Enter The Number : ");
      n = in.nextInt();
      sq = n * n;
      System.out.println("Square of " + n + " = " + sq);
      in.close();
    }
  }
