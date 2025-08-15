package sidelearnings.whileandfor;

public class For {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
            System.out.println("-------------");
        
        for(int k = 1; k <= 5; k++){
            for(int l = 1; l <= 3; l++){
                System.out.println("K =" + k + " " + "L ="+ l);
            }
        }

    }
}
