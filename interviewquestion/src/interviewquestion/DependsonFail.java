package interviewquestion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonFail {
	@Test
	public void parent() {
		Assert.assertEquals(false, true);
		System.out.println(("This is parent"));
	}
	@Test(dependsOnMethods="parent",alwaysRun=true)
	public void child() {
		System.out.println(("This is child"));
}
}