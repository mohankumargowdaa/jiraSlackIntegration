package demoSample;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericMethods.ListenerImplementation.class)
public class Sample {
	@Test
	public void testcase11() {
		System.out.println("testcase1");
	}
	@Test
	public void testcase1() {
		Assert.fail();
	}
	@Test(dependsOnMethods ="testcase1")
	public void testcase12() {
		System.out.println("demo1");
	}
}
