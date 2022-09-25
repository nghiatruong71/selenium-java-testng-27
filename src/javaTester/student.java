package javaTester;

import org.testng.Assert;

public class student {
 
	public void TC_02_ValidatePageTitle() {
		// Login Page title
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "Facebook – log in or sign up");
}
}