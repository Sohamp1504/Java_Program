
//Develope The Program Of Count The number Of digit In the number

import java.util.*;
class Code{
  public static void main (String [] args) {

  int n , count = 0;

  Scanner in = new Scanner (System.in);
  System.out.println("Enter The Number ");
  n = in.nextInt();



 while (n > 0) {
            count +=1;
             n /=10;
        }

        System.out.println("The Number Of Digit Of The Number : " + count);

   in.close();

 }
}
