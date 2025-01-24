//Develope The Program An Email Address Of User And Then Print Username , CompanyName And Domain 

import java.util.*;

class Code {
    public static void main(String[] args) {

        String email;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Your Email: ");
        email = in.nextLine();


        int atIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");

        
        String username = email.substring(0, atIndex);
        String companyName = email.substring(atIndex + 1, dotIndex);
        String domain = email.substring(dotIndex + 1);

        System.out.println("Username: " + username);
        System.out.println("Company Name: " + companyName);
        System.out.println("Domain: " + domain);

        in.close();
    }
}
