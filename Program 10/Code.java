
//Develope The Program Of Find Out Weather Number Is Odd Or Even

import java.util.*;
class Code{
  public static void main (String [] args) {

  int x ;

  Scanner n = new Scanner (System.in);
  System.out.println("Enter The Number ");
  x = n.nextInt();
  
   if (x%2==0)
  System.out.println(x+" Is Number Is Even Intergers  " );
  else
  System.out.println(x+" Is Number Is Odd Intergers  " );

   n.close();

 }
}
