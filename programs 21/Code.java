
//Develope The Program Of Create The Array Of N Number And Accept The Value From User And Print This Array Using The For Each loop

import java.util.Scanner;

class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int num = in.nextInt();

        int[] a = new int[num]; 

        System.out.println("Enter the elements of the array:");
        int index = 0; 
        for (int x : a) { 
            a[index] = in.nextInt();
            index++;
        }

        System.out.println("The elements of the array are:");
        for (int n : a) { 
            System.out.println(n);
        }

        in.close();
    }
}
