package sidelearnings.whileandfor;

public class While {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        System.out.println("------------");

        int k = 1;
        do{
            System.out.println(k++);
        }while(k <= 5);
}
}
