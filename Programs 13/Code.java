
//Develope The Program Of Find Out The Maximum value Of Three Number Using Logical Opeartor

import java.util.*;
class Code{
  public static void main (String [] args) {

  int x ,y ,z ;

  Scanner n = new Scanner (System.in);
  System.out.println("Enter The Three Number ");
  x = n.nextInt();
  y = n.nextInt();
  z = n.nextInt();
  
   if (x>y  &&  x>z)
  System.out.println(" The Maximum Value : " + x);
  else if (y>z)
  System.out.println(" The Maximum Value : " + y);
  else
  System.out.println(" The Maximum Value : " + z);

   n.close();

 }
}
