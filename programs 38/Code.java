import java.util.*;

class Code {
    private int id;
    private String name;
    private double salary;

    void getData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your ID: ");
        id = in.nextInt();
        in.nextLine(); 
        System.out.print("Enter Your Name: ");
        name = in.nextLine();
        System.out.print("Enter Your Salary: ");
        salary = in.nextDouble();
        System.out.println("..........................");
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Code E1 = new Code();
        Code E2 = new Code();
        Code E3 = new Code();
        Code E4 = new Code();
        Code E5 = new Code();

        System.out.println("Enter details for Employee 1");
        E1.getData();
        System.out.println("Enter details for Employee 2");
        E2.getData();
        System.out.println("Enter details for Employee 3");
        E3.getData();
        System.out.println("Enter details for Employee 4");
        E4.getData();
        System.out.println("Enter details for Employee 5");
        E5.getData();

        System.out.println("Displaying Employee Details:");
        E1.display();
        E2.display();
        E3.display();
        E4.display();
        E5.display();
    }
}

