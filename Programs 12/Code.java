
//Develope The Program Of Find Out The Maximum value Of Three Number

import java.util.*;
class Code{
  public static void main (String [] args) {

  int x, y, z ;

  Scanner n = new Scanner (System.in);
  System.out.println("Enter The Three Number ");
  x = n.nextInt();
  y = n.nextInt();
  z = n.nextInt();
  
   if (x>y){
        if (x>z)
           System.out.println(" The Maximum Is  " +x );
         else
            System.out.println(" The Maximum Is  " +z );
       }
    else {
       if (y>z)
            System.out.println(" The Maximum Is  " +y );
       else
            System.out.println(" The Maximum Is  " +z );
        }
   n.close();

 }
}
