
//Develope The Program Of Find The Sum Of digit of A Number

import java.util.*;
class Code{
  public static void main (String [] args) {

  int n, sum =0 , r;

  Scanner in = new Scanner (System.in);
  System.out.println("Enter The Number ");
  n = in.nextInt();

  while(n!=0){
   r=n%10;
   sum+=r;
   n/=10;
  }
  System.out.println("Sum Of Digit  :  "+sum);

   in.close();

 }
}
