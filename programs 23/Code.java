//Develope The Program To Print Each Character Of The String On A Separate line  

import java.util.*;

class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = in.nextLine();

        for (int i = 0; i < input.length(); i++) 
        {
            System.out.println(input.charAt(i));
        }

        in.close();
    }
}
