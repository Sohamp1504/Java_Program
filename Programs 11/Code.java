
//Develope The Program Of Find Out weather Is Divisible By 7 Or Not

import java.util.*;
class Code{
  public static void main (String [] args) {

  int x ;

  Scanner n = new Scanner (System.in);
  System.out.println("Enter The Number ");
  x = n.nextInt();
  
   if (x%7==0)
  System.out.println(x+" Is Divisible By 7  " );
  else
   System.out.println(x+" Is Not Divisible By 7  " );

   n.close();

 }
}

