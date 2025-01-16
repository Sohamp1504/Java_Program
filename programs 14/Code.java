
//Develope The Program Of Multiplication Table Of A Number

import java.util.*;
class Code{
  public static void main (String [] args) {

  int x ,i ;

  Scanner n = new Scanner (System.in);
  System.out.println("Enter The Number ");
  x = n.nextInt();

  System.out.println("Multiplication Table :  "+x);
   
  for (i=1 ; i<=10 ; i++)
     System.out.println(x+"*"+i+"=" +(x*i));

   n.close();

 }
}
