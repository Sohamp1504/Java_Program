//Develope the program to declare a class students with roll_no , name  and percentage as it's field and also write getdata() and putdata() to get and put data of students

import java.util.Scanner;

class Student {
   
    int roll_no;
    String name;
    float percentage;

    
    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter percentage: ");
        percentage = sc.nextFloat();
       System.out.println();
    }

    
    public void putData() {
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println();
    }
}

public class Code {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        
        student1.getData();
        student2.getData();
        student1.putData();
        student2.putData();

    }
}
