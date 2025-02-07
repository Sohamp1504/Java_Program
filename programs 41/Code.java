//Develope The Program To Find Out The "Java" String Is Provided Or Not On Command Line

public class Code {
    public static void main(String[] args) {
        boolean found = false;

        for (String arg : args) {
            if (arg.equals("Java")) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\"Java\" is present in the command-line arguments.");
        } else {
            System.out.println("\"Java\" is not present in the command-line arguments.");
        }
    }
}
