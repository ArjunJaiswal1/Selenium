package Com.bridgelabz;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JS_PopUp {
	public static WebDriver driver;
	@BeforeTest
	public void launchrowser(){
		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP 14-dh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//	    driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP 14-dh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void Alert_Promptpopup() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		//Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	@Test
	public void ConformationPopUp() throws InterruptedException{
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(2000);
		Alert conformationAlert = driver.switchTo().alert();
		String alertText = conformationAlert.getText();
		System.out.println("the alert test is: " +alertText);
		conformationAlert.accept();
	}
	@Test
	public void promptPopup() throws InterruptedException{
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		promptAlert.sendKeys("arjun ");
		Thread.sleep(2000);
		promptAlert.accept();
	}
}


