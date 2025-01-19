
//Develope The Program Of Read The Number And Then Findout weather It is Palindrome Number Or Not
// example 121, 323, 434

import java.util.*;
class Code{
  public static void main (String [] args) {

  int n , ori , rev =0, digit;

  Scanner in = new Scanner (System.in);
  System.out.println("Enter The Number ");
  n = in.nextInt();

  ori = n;

  while(n>0)
  {
   digit = n%10;
   rev = rev * 10 + digit;
   n /= 10;
   }
   
  if (ori==rev)
      System.out.println(ori+" Is A Palindrome Number");
  else
      System.out.println(ori+" Is Not A Palindrome Number");
 

   in.close();

 }
}
