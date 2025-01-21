
//Develope The Program Of Find Out Weather Number Is Positive Or Negative

import java.util.*;
class Code{
  public static void main (String [] args) {

  int x ;

  Scanner n = new Scanner (System.in);
  System.out.println("Enter The Number ");
  x = n.nextInt();
  
   if (x%2==0)
  System.out.println(x+" Is A Even Intergers  " );
  else
  System.out.println(x+" Is An Odd Intergers  " );

   n.close();

 }
}
