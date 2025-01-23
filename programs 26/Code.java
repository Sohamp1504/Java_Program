//Deveolpe The Program To count The Vowels in This String

import java.util.*;

class Code {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter The String");
        String S = in.nextLine();

        int Count = 0;


        for (int i = 0; i < S.length(); i++)
        { 
            char ch = S.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
           {
                Count++;
            }
        }

        System.out.println("Number Of Vowels: " + Count);

        in.close();
    }
}
