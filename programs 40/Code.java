//Develope The Program To Find Out The Weather The String Equal or Not Using Command line Arguments

public class Code {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two strings as command-line arguments.");
            return;
        }

        if (args[0].equals(args[1])) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}
