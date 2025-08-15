package projects;
import java.util.Scanner;

public class PlanePrice {
    public static void main(String[] args) {
         /*1 km = 0.10 $
     * Type of customer = kid %50, teen %30, adult, old %30
     * round-trip / one-way
     * round-trip %20
    */
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the authorized system. Answer these questions to find the flight amount.");
    System.out.print("How many kilometers apart?: ");
    int km = input.nextInt();
    System.out.print("\nRound-trip (a) or One-way? (b): ");
    char rto = input.next().charAt(0);
    System.out.print("How old is the customer? (Kid, Teen, Adult, Old): ");
    String old = input.next();
    
    double basePrice = km * 0.10;
    double finalPrice = basePrice;

    /*Age Control*/
    if(old.equalsIgnoreCase("Kid")){
        finalPrice *= 0.50;
    }else if(old.equalsIgnoreCase("Teen") || old.equalsIgnoreCase("Old")){
        finalPrice *= 0.70;
    }else if(old.equalsIgnoreCase("Adult")){
    }
    else{
        System.out.println("Error: Invalid age group.");
        return;
    }

    if(rto == 'a'){
        finalPrice *=2;
        finalPrice *=0.80;
        System.out.println("Type selected: Round-trip");
    }else if(rto == 'b'){
        System.out.println("Type selected: One-way");
    }
    else{
        System.out.println("Error: Invalid trip group.");
        return;
    }
    System.out.println("Age group you selected: " + old );
    System.out.println("Price: " + finalPrice + "$");
    System.out.println("Continue for buying process...");
    input.close();

}

}
