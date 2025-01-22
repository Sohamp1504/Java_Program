
//Develope The Program Of Find Length Of The String

import java.util.*;

class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string :");
        String input = in.nextLine();

        int length = input.length();

        System.out.println("The length of the string is: " + length);

        in.close();
    }
}

