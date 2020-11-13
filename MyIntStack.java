import java.util.Scanner;
import java.util.*;
/**
* Class MyIntStack
*

* @author  Miguel Duarte
* @version 1.0
* @since   2020-11-11 
*/
public class MyIntStack {
  /**
   *. 
  */
  public static void main(String[] args) {
    
    // Create the stack
    StackInt mystack = new StackInt();
    
    // Create the scanner
    Scanner userInput = new Scanner(System.in);
    
    // Explain to the user how the program works
    System.out.println("In a stack, all operations take place at the TOP of the stack. ");
    System.out.println("The PUSH operation adds an item to the top of the stack. ");
    System.out.println("The POP operation removes an item from the top of the stack and returns it:");
    System.out.println("");
    
    System.out.println("Enter 1 for PUSH:");
    System.out.println("Enter 2 for POP:");
    System.out.println("Enter 3 for PEEK:");
    System.out.println("Enter 4 for CLEAR");
    System.out.println("==============================");
    System.out.println(" ");
    
    
    // Set boolean true
    boolean running = true; 
    while (running) {
      
      int number = userInput.nextInt();
      
      // Push onto the stack
      if (number == 1 ) { 
        
        // Ask for a number
        System.out.println(" Enter an Integer");
        
        int userPush = userInput.nextInt();
        
        // Call the method
        mystack.pushInt(userPush);
        
        // Print the number that has been pushed to the stack
        System.out.println(userPush + " has been pushed to stack");
        System.out.println("==============================");
        System.out.println(" ");
        
        // Pop
      } else if (number == 2) {
        
        // Declare size
        int size = mystack.Stacksize();
        if (size == 0)  {
          // This prints the stack is empty
          System.out.println(" Error. Stack empty");
          System.out.println("=============================");
          System.out.println(" ");
          
        } else  {
          // Call the method
          int poppedInt = mystack.PopInt();
          System.out.println(poppedInt + " is Poped");
          System.out.println("=============================");
          System.out.println(" ");
          
          }
      } else if (number == 3) {
          int PeekingInt = mystack.PeekInt();
          System.out.println(PeekingInt + " is at the top of the stark");
          System.out.println("=============================");
          System.out.println(" ");
          
          int size = mystack.Stacksize();
          if (size == 0) {
            //This prints the stack is empty.
            System.out.println(" Error. Stack empty");
            System.out.println("=============================");
            System.out.println(" ");
          }
          
      } else if (number == 4) {
        
        //
        int size = mystack.Stacksize();
        if (size == 0) {
          // This prints the stack is empty.
          System.out.println(" Error. Stack empty");
          System.out.println("=============================");
          System.out.println(" ");
        } else {
          mystack.ClearInt(); 
          System.out.println(" Clear all stark");
          System.out.println("=============================");
          System.out.println(" ");
        }
          
      } else { 
        System.out.println("Enter a valid number");
        System.out.println("1 to PUSH:");
        System.out.println("2 to for POP:");
        System.out.println("3 to PEEK:");
        System.out.println("4 to CLEAR");
      }
    }
  }
}