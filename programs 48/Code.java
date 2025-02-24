//Develope The Program To Find Sum Of Interger Using command Line With Exception loading 

public class Code {
    public static void main(String[] args) {
        int sum = 0;

        for (String t : args) { 
            try {
                int n = Integer.parseInt(t); 
                sum += n;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Integer: " + t); 
            }
        }
        System.out.println("Sum: " + sum);
    }
}
