
//Develope The Program Of Find The Greatest Digit Of A Number 

import java.util.*;
class Code{
  public static void main (String [] args) {

  int n , max, digit;

  Scanner in = new Scanner (System.in);
  System.out.println("Enter The Number ");
  n = in.nextInt();

  max = 0;

 while (n > 0) {
            digit = n % 10; 
            if (digit > max) {
                max = digit; 
            }
            n /= 10; 
        }

        System.out.println("The greatest digit of the number is: " + max);

   
   in.close();

 }
}
