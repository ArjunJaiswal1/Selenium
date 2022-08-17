package Com.bridgelabz;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Uploaded_File {
	public static WebDriver driver;
	@BeforeTest
	public void launchrowser(){
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP 14-dh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
}
	@Test
	public void autoIt_UploadFile() throws InterruptedException, IOException {
		driver.get("https://www.freepdfconvert.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Choose file")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\HP 14-dh\\Documents\\Uploaded file.exe");
	}
	@Test
	public void file_Upload() throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\HP 14-dh\\Downloads\\Arjun updated resume-converted (2).pdf");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@ng-click=\\\"item.upload()\\\"]")).click();
	//Thread.sleep(2000);
}}