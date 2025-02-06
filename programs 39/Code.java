//Develope The Program To Finf The Sum of The Number Using The Commands Line Argument

public class Code {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            try {
                
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + arg);
                return; 
            }
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
