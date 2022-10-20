package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowserTest {
	
	@Test
	public void lanchingTest() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		System.out.println("Chrome Browser launched");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		System.out.println("Chrome Browser closed");
		
	}
	

}
