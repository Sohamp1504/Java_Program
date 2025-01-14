
//Develope The Program Of Find The area Of Rectangle

import java.util.*;
class Code{
  public static void main (String [] args) {

  double l , b , area;
  Scanner c = new Scanner (System.in);
  System.out.println("Enter The Length Of Rectangle :  ");
  l = c.nextDouble();
  System.out.println("Enter The Breadth Of Rectangle :  ");
  b = c.nextDouble();
 
  area = 2 * (l + b);

  System.out.println(" Area Of Rectangle  :  " +area + "cm^2");
   c.close();

 }
}
