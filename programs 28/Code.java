//Develope The Program To Find The Palindrome Or Not Palindrome

import java.util.*;

class Code {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter The String:");
        String s = in.nextLine();

        StringBuffer sb = new StringBuffer(s);

       
        StringBuffer reversed = sb.reverse();
        String rev = reversed.toString(); 

        if (s.equals(rev))
            System.out.println("String Is Palindrome");
        else
            System.out.println("String Is Not Palindrome");

        in.close();
    }
}
