//Develope The program to declare a class Student with roll_no, name and percentage as its fields. Also write getData() and putData() methods to get and put the data of Student. 

import java.util.Scanner;

class Student {
    int roll_no;
    String name;
    double percentage;

  
    public void getData(Scanner sc) {
        System.out.print("Enter Roll No: ");
        roll_no = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        
        System.out.print("Enter Percentage: ");
        percentage = sc.nextDouble();
        sc.nextLine(); 
    }

   
    public void putData() {
        System.out.println("Roll No: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 3;
        Student[] students = new Student[SIZE];

        
        for (int i = 0; i < SIZE; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i] = new Student();
            students[i].getData(sc);
        }

        
        System.out.println("\nDisplaying Student Details:");
        for (int i = 0; i < SIZE; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i].putData();
        }
        
        sc.close();
    }
}
