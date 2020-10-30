import java.util.*;
public class StackInt {
  private Stack<Integer> _stack;
  
  /**
   * Constructor.
  */
  public StackInt() {
    _stack = new Stack<Integer>();
  }
  
  /**
   * Stack Push. 
  */
  public void stackpush(int num) {
    _stack.push(num);
  }
}