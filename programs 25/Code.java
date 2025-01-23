//Develope The Program To Find Out Weather Two String Equal or Not 

import java.util.*;
class Code{
  public static void main (String [] args) {

  Scanner in = new Scanner (System.in);

  System.out.println("Enter The First String");
  String  S1 = in.nextLine();
  System.out.println("Enter The Second String");
  String S2 = in.nextLine();

   if(S1.equals(S2))
        System.out.println("Both String Are Equal  ");
    else
        System.out.println("Both String Are Not Equal  ");

   in.close();

 }
}
