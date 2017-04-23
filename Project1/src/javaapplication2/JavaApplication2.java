package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Your Name <RTG>
 */


public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Starting...");
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your Name!");
        String user_input_name = scan.nextLine();
        System.out.println("Your name is: " + user_input_name);
        
        int x = 10;
        
        System.out.println("Building your fake system!");
        
        while (x < 100) {
            x++;
            System.out.println(x);
        }
        
    }
    
}
