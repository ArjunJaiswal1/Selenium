package Com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fb_Height_Width {
	@Test

	public void verifyInstagram_UNandPassword_HeightAndWidth() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP 14-dh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement unTB = driver.findElement(By.xpath("//input[@type='text']"));
		// store the height of username
		int username_height = unTB.getSize().getHeight();
		// store the width of username
		int username_width = unTB.getSize().getWidth();
		System.out.println(username_height);
		System.out.println(username_width);

		WebElement pwdTB = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
		int passwordHeight = pwdTB.getSize().getHeight();
		int passwordWidth = pwdTB.getSize().getWidth();

		System.out.println(passwordHeight);
		System.out.println(passwordWidth);

		if (username_height == passwordHeight && username_width == passwordWidth) {
			System.out.println("Username and password fields are aligned");
		} else {
			System.out.println("Username and password fields are NOT aligned");

		}

}}
