package Com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Frames {
	@Test
	public void frames() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP 14-dh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:\\Users\\HP 14-dh\\Desktop\\Javascript Executor");

		driver.manage().window().maximize();

		driver.findElement(By.id("t2")).sendKeys("Arjun");

		driver.switchTo().frame(0);

		driver.findElement(By.id("t1")).sendKeys("jaiswal");

		Thread.sleep(2000);

		driver.switchTo().defaultContent(); 

		Thread.sleep(2000);
	}
	}