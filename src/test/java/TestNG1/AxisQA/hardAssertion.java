package TestNG1.AxisQA;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	

	public class hardAssertion {
		WebDriver driver;
		String title;
		String Expected;
		String NotExpected;
		String NullVal;
		
		@Test
		public void MainClass()
		{
	
	    driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://tutorialsninja.com/demo/");
		title=driver.getTitle();
		Expected="Your Store";
		NotExpected="My store";	
		Assert.assertEquals(title,Expected,"both are matched ,its true otherwise false");
		
		Assert.assertNotEquals(title,NotExpected,"both are matched,its false otherwise true");
		
		Assert.assertTrue(driver.findElement(By.linkText("Qafox.com")).isDisplayed(),"this code working , its true otherwise false");
		
		Assert.assertFalse(driver.findElement(By.linkText("Qafox.com")).isSelected(),"this code is working ,its false otherwise true");
		
		//this Assert fails , in hard assertion this will stop execution of other assertion and return error message
		Assert.assertNull(Expected,"this true, its run otherwise fails");
			Assert.assertNull(NullVal,"");
		
		Assert.assertNotNull(Expected,"this true, its run otherwise fails");
			Assert.assertNotNull(NotExpected, Expected);

		if(driver.findElement(By.linkText("Qafox.com")).isSelected())
			{
				Assert.fail("Test is ");
			}
		}
		
		@AfterTest
		public void quit()
		{
			driver.quit();
		}
	}

