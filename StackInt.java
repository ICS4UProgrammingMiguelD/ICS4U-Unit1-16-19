import java.util.*;
/**
* Class StackInt
*

* @author  Miguel Duarte
* @version 1.0
* @since   2020-11-11 
*/
public class StackInt {
  /**
   *.
  */
  private Stack<Integer> stack;
  /**
   *.
  */    
  // Constructor
  public StackInt() {
    // Creates any empty stack
    stack = new Stack<Integer>();
  }
  /**
  * .
  */
  // Create a stack size
  public int Stacksize() {
    // Creating an empty Stack 
    int size = stack.size();
    // Return the size
    return size;
  }
  /**
   *.
  */
  // Create the Push
  public int pushInt(int number) {
    // Return the push number to the stack
    return stack.push(number);
  }
  /**
  * .
  */
  // Create the Pop
  public int PopInt() {
    // User number to stackPop
    int number = stack.pop();
    // Return the number from the top of the stack
    return number;
  }
  /**
   *.
  */
  // Create the Peek
  public int PeekInt() {
    // User number to the stackpeek
    int number = stack.peek();
    // Return the number peeked
    return number;
  }
  /**
   *.
  */
  // Create the  clear
  public void ClearInt() {
    stack.removeAllElements();
    
  }
}