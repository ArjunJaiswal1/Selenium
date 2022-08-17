package Com.bridgelabz;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DownloadingChromeBrowser {
	@Test
	public void FileDownloadInChromeBrowser(){
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "D:\\");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/download/");
		//Thread.sleep(2000);
		//String xp = "//td[.='Java']/following-sibling::td/a[.='Download']";
		driver.findElement(By.linkText("4.3.0")).click();
	}
}


