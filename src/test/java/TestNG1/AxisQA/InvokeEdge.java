package TestNG1.AxisQA;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeEdge {
	
	@Test
	public void f() throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\\\Documents\\driver\\msedgedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://webdriveruniversity.com/");
	String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(2000);
	
}
}
