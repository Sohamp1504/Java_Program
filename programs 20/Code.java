
//Develope The Program To Find The Sum Of first And Last Digit Of the Number
// example 121 = 2 , 5345 = 10

import java.util.*;
class Code{
  public static void main (String [] args) {

  int n  , first , last , sum;

  Scanner in = new Scanner (System.in);
  System.out.println("Enter The Number ");
  n = in.nextInt();

  last = n % 10;
  first = n;
    
   while(first >=10)
  {
    first /= 10;
  }

  sum = first + last;

      System.out.println("Sum Of First And last Digit  : " +sum );
 
   in.close();

 }
}
