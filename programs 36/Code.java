//Develope Thje Program to Print Number of Command Line Arguments And Their values

import java.util.*;

public class Code {

    public static void main(String[] args) {
        System.out.println("Number Of command line argument : "+args.length);

        System.out.println("Command line Argument Values Are : ");
             for(int i=0; i<args.length; i++)
             {
                System.out.println(args[i]);
             }
    }
}
