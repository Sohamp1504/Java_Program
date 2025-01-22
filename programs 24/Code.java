//Develope The Print The Character Of String Reverse Order 

import java.util.*;

class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string :");
        String input = in.nextLine();

        System.out.println("Reversed String :");
        
        for (int i = input.length() - 1; i >= 0; i--) 
        {
            System.out.print(input.charAt(i));
        }

        in.close();
    }
}
