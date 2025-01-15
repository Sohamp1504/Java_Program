
//Develope The Program Of Find Out Maximum Between Two Number

import java.util.*;
class Code{
  public static void main (String [] args) {

  int x ,y ;

  Scanner n = new Scanner (System.in);
  System.out.println("Enter The Two Number ");
  x = n.nextInt();
  y = n.nextInt();
  
   if (x>y)
  System.out.println(" The Maximum Value : " + x);
  else
  System.out.println(" The Maximum Value : " + y);

   n.close();

 }
}
