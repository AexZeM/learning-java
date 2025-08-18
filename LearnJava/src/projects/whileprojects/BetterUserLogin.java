package projects.whileprojects;

import java.util.Scanner;

public class BetterUserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userloginname = "AdminSpace";
        String userloginpaswd = "Ruhi123";

        int attempts = 0;

        System.out.println("Welcome back to StarX-OS User!");
        while(attempts <= 3){
            System.out.print("Enter your Username: ");
            String user = input.nextLine();
            System.out.print("\nEnter your Password: ");
            String passwd = input.nextLine();

            
            if(user.equals(userloginname) && passwd.equals(userloginpaswd)){
                System.out.println("Approved user. You can enter the system.");
                break;
            }else{
                int remaining = 3 - attempts;
                if(remaining > 0){
                    System.out.println("Invalid username or password. Remaining attempts:" + remaining);
                }else{
                    System.out.println("Too many failed attempts! Access denied.");
                }
            
            }
            attempts++;

            
        }

        input.close();
    }
}

