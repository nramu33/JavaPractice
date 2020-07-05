package javaprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {
	private int x=1;
	public void setX(int x)
	{
		System.err.println(this.x);
		System.err.println(x);
	}
	
	public void displayListReverseOrder() {
		// Creating a list of Integers 
		List<Integer> list = Arrays.asList(1,2, 2, 4, 6, 8, 10 ); 

		// Using forEach(Consumer action) to 
		// print the elements of stream 
		// in reverse order 
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); 
	}
	public void streamOfStrings() {
		// Creating a Stream of Strings 
        Stream<String> stream = Stream.of("GFG", "Geeks", 
                                          "for", "GeeksforGeeks"); 
//        stream.sorted(Comparator.reverseOrder())
//        .forEach(System.out::println); 
  
        // Using forEach(Consumer action) to print 
        // Character at index 1 in reverse order 
        stream.sorted(Comparator.reverseOrder()) 
            .flatMap(str -> Stream.of(str.charAt(1))) 
            .forEach(System.out::println); 
	}
	public void flatMapEx() {
		// Creating a list of Prime Numbers 
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
          
        // Creating a list of Odd Numbers 
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
          
        // Creating a list of Even Numbers 
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
  
        List<List<Integer>> listOfListofInts = 
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 
  
        System.out.println("The Structure before flattening is : " + 
                                                  listOfListofInts); 
          
        // Using flatMap for transformating and flattening. 
        List<Integer> listofInts  = listOfListofInts.stream() 
                                    .flatMap(list -> list.stream()) 
                                    .collect(Collectors.toList()); 
  
        System.out.println("The Structure after flattening is : " + 
                                                         listofInts); 
	}
	
	
	 /** 
     * permutation function 
     * @param str string to calculate permutation for 
     * @param l starting index 
     * @param r end index 
     */
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
    
    public static boolean returnTrue() {
    	return true;
    }
    
    public static void main(String... args) throws AWTException, InterruptedException {
    	
//    	rb.mousePress(InputEvent.BUTTON3_DOWN_MASK);
//    	rb.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
//    	Thread.sleep(3000);
//    	rb.keyPress(KeyEvent.VK_S);
//    	rb.keyRelease(KeyEvent.VK_S);
//    	Thread.sleep(2000);
//    	rb.keyPress(KeyEvent.VK_ENTER);
//    	rb.keyRelease(KeyEvent.VK_ENTER);
    	
    	
//    	Thread.sleep(2000);
//    	rb.keyPress(KeyEvent.VK_P);
//    	rb.keyRelease(KeyEvent.VK_P);
    	
    	/*//To Hide the Java Window
    	Thread.sleep(5000);
    	rb.keyPress(KeyEvent.VK_CONTROL);
    	rb.keyPress(KeyEvent.VK_SHIFT);
    	rb.keyPress(KeyEvent.VK_F2);
    	rb.keyRelease(KeyEvent.VK_F2);
    	rb.keyRelease(KeyEvent.VK_SHIFT);
    	rb.keyRelease(KeyEvent.VK_CONTROL);
    	Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_T);
    	rb.keyRelease(KeyEvent.VK_T);
    	Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_DOWN);
    	rb.keyRelease(KeyEvent.VK_DOWN);
    	Thread.sleep(2000);
    	
    	rb.keyPress(KeyEvent.VK_H);
    	rb.keyRelease(KeyEvent.VK_H);
    	Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_ENTER);
    	rb.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(2000);*/
    	
    	
    	/*Thread.sleep(5000);
    	Robot rb = new Robot();
    	Thread.sleep(5000);
    	rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      	rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      	Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_CONTROL);
    	rb.keyPress(KeyEvent.VK_SHIFT);
    	rb.keyPress(KeyEvent.VK_F2);
    	rb.keyRelease(KeyEvent.VK_F2);
    	rb.keyRelease(KeyEvent.VK_SHIFT);
    	rb.keyRelease(KeyEvent.VK_CONTROL);
    	Thread.sleep(2000);
    	
    	rb.keyPress(KeyEvent.VK_F);
    	rb.keyRelease(KeyEvent.VK_F);
    	rb.keyPress(KeyEvent.VK_I);
    	rb.keyRelease(KeyEvent.VK_I);
    	rb.keyPress(KeyEvent.VK_L);
    	rb.keyRelease(KeyEvent.VK_L);
    	rb.keyPress(KeyEvent.VK_E);
    	rb.keyRelease(KeyEvent.VK_E);
    	
   
    	Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_DOWN);
    	rb.keyRelease(KeyEvent.VK_DOWN);
    	Thread.sleep(2000);
    	
    	rb.keyPress(KeyEvent.VK_S);
    	rb.keyRelease(KeyEvent.VK_S);
    	Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_ENTER);
    	rb.keyRelease(KeyEvent.VK_ENTER);*/

    	Thread.sleep(3000);
		Robot rb = new Robot();
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    	rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    	Thread.sleep(3000);
		rb.mousePress(InputEvent.BUTTON3_DOWN_MASK);
    	rb.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    	Thread.sleep(3000);
    	rb.keyPress(KeyEvent.VK_S);
    	rb.keyRelease(KeyEvent.VK_S);
    	Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_ENTER);
    	rb.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(10000);
//    	Thread.sleep(2000);
//    	rb.keyPress(KeyEvent.VK_P);
//    	rb.keyRelease(KeyEvent.VK_P);
//    	rb.keyPress(KeyEvent.VK_ENTER);
//    	rb.keyRelease(KeyEvent.VK_ENTER);
//    	rb.mousePress(InputEvent.BUTTON3_DOWN_MASK);
//    	rb.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
	}
  
} 
  
