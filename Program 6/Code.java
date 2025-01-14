
//Develope The Program Of Find The area Of Cricle
import java.util.*;
class Code{
  public static void main (String [] args) {

  double r , area;
  Scanner c = new Scanner (System.in);
  System.out.println("Enter The Radius Of Cricle :  ");
  r = c.nextDouble();
 
  area = 3.14 * r * r;

  System.out.println(" Radius Of Cricle :  " +area);
   c.close();

 }
}
