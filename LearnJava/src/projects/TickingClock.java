package projects;

import java.lang.Thread;

public class TickingClock {

    public static void main(String[] args) throws InterruptedException {

        int sec = 0;
        int min = 0;
        int hour = 0;
        
        System.out.println("Ticking... Ticking...");
        while(true){
            Thread.sleep(1000);
            sec += 1;
            if(sec == 60){
                min += 1;
                sec = 0;
            }if(min == 60){
                hour +=1;
                min = 0;
            }if(hour == 24){
                break;
            }

            System.out.printf("\r%02d:%02d:%02d", hour, min, sec);
            }
        }
    }

