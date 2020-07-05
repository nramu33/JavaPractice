package robot.savepage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class SavePage {

	public static void main(String[] args) throws InterruptedException, AWTException {
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

	}

}
