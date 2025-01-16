
//Develope The Program Of Find Out The factorial Of a Number 

import java.util.*;
class Code{
  public static void main (String [] args) {

  int n , f =1 , i;

  Scanner in = new Scanner (System.in);
  System.out.println("Enter The Number ");
  n = in.nextInt();
   
  for (i=1 ; i<=n ; i++){
   f =f * i;
  }

  System.out.println("factorial Of "+n+"="+f);
   in.close();

 }
}
