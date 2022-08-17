package Com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_Element_Interface_Method {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP 14-dh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String expectedError= "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("dhhvcbjjgfhj");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("baj");
		Thread.sleep(2000);
		WebElement element =driver.findElement(By.name("pass"));
		element.clear();
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("bhuj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(2000);

		//WebElement errorMsg = driver.findElement(By.xpath("//div text()-"The all address or mobile number you entered isn't connected to an account."); 
		WebElement errorMsg =driver.findElement(By.linkText("Find your account and log in."));
		String actualError =errorMsg.getText(); 
		System.out.println("Error msg is: "+ actualError);
		driver.close();

	}
}
