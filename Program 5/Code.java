
//Develope The Program Of Swapping The Two Number

import java.util.*;
class Code{
  public static void main (String [] args) {

  int x ,y , temp;

  Scanner n = new Scanner (System.in);
  System.out.println("Enter The Value Of X :  ");
  x = n.nextInt();
  System.out.println("Enter The Value Of Y :  ");
  y = n.nextInt();

  System.out.println(" Before Swapping ");
  System.out.println(" The Value Of X :  " + x);
  System.out.println(" The Value Of Y :  " + y);
  
   temp = x;
   x = y;
   y = temp;
 
  System.out.println(" After Swapping ");
  System.out.println(" The Value Of X :  " + x);
  System.out.println(" The Value Of Y :  " + y);
 
   n.close();

 }
}
