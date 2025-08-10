package sidelearnings;

public class ifandelse {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;

        if(a>b && a>c){
            System.out.println("A is the biggest number.");
        }
        else if(b>a && b>c){
            System.out.println("B is the biggest number.");
        }
        else{
            System.out.println("C is the biggest number");
        }
    }
}
