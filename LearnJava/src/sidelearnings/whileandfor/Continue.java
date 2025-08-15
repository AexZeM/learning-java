package sidelearnings.whileandfor;

public class Continue {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i == 5 || i == 8){
                System.out.println("Skipped here.");
                continue;
            }
            System.out.println("i =" + i);
        }
    }
}
