package reactiontimer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author hayde
 */
public class ReactionTimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Go!!!!");
        
        
        long startTime = System.currentTimeMillis();
        Scanner s = new Scanner(System.in);
        String a = s.next();
        long endTime = System.currentTimeMillis();
        long reactionTime = endTime - startTime;
        System.out.println("Rection Time: " + reactionTime/ 1000 + " seconds");
    }
    
}
