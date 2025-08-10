package projects;

import java.util.Scanner;

public class Userlogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String userloginname = "AdminSpace";
        String userloginpaswd = "Ruhi123";

        System.out.println("Welcome back to StarX-OS User!");
        System.out.print("Please enter username: ");
        String user = input.next();
        System.out.print("\nPlease enter password: ");
        String password = input.next();

        if(user.equals(userloginname) && password.equals(userloginpaswd)){
            System.out.println("Approved user. You can enter the system.");
        }
        else{
            System.out.println("Invalid password or username. Please try again.");
        }
        
        input.close();

    }
}
