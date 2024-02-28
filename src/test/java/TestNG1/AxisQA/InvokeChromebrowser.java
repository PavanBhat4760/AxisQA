package TestNG1.AxisQA;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChromebrowser {
	@Test
	  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://webdriveruniversity.com/");
			String title=driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			

}
}
