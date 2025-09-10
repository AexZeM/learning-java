package sidelearnings;

public class function {
    public static void main(String[] args) {
        // f(x) = (x + 2) * 6;
        f(2);
        f(4);
        f(6);
        f2(2, 5);
        f2(6,7);
        int x = f3(10, 2);
        System.out.println("Returned Answer = " + x);
    }

   static void f(int x){
        int result = (x+2)*6;
        System.out.println(result);
    }
    
    static void f2(int y, int t){
        int result = 1;
        for(int i=1; i <= t; i++){
            result *= y; 
        }
        System.out.println(result);
    }

    static int f3(int x, int y){
        int result = 1;
        for(int i=1; i <= y; i++){
            result *= x; 
        }
            return result;
    }


}
