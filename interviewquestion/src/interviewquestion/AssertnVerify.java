package interviewquestion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertnVerify {
	@Test
	public void Assert() {
		System.out.println("This is Parent ");
		org.testng.Assert.assertEquals(true, false);
		System.out.println("This is Child ");
	}
@Test
	public void Verify() {
		SoftAssert assert1= new SoftAssert();
		System.out.println("This is Parent ");
		assert1.fail();
		System.out.println("This is Child ");
	}
}
