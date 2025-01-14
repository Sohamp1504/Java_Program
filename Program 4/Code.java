//Develope The Program Of Find The Average Of Three Number 

import java.util.*;
class Code{
  public static void main (String [] args) {

  int x , y, z ;
  double avg;
  Scanner n = new Scanner (System.in);
  System.out.println("Enter The Three Number ");
  x = n.nextInt();
  y = n.nextInt();
  z = n.nextInt();

  avg = (x + y + z) /3.0 ;
  System.out.println("Average Of Three Number: " + avg);

   n.close();

 }
}
