package interviewquestion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedTestcase {
	@Test(retryAnalyzer=IretryListener.class)
	public void parent() {
		System.out.println("This is parent");
		Assert.assertEquals(false, true);
	}

	@Test
	public void child() {
		System.out.println("This is child");
		Assert.assertEquals(true, false);
	}
}
