package interviewquestion;


import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Exceptionhandling {
	
		@Test(timeOut=2000,expectedExceptions=ThreadTimeoutException.class)
		public void timeout() throws InterruptedException {
			Thread.sleep(3000);
			System.out.println("The timeout has set");
	   }
}
