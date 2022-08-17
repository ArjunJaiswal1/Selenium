package Com.bridgelabz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Web_Table {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP 14-dh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	}
	@Test
	public void webTable() {
		driver.get("");
		//Count Total number of rows present in the table
		List<WebElement> allRows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :"+ totalRows);
		//count total number of columns
		List<WebElement> allColumns = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);
		//Count number of cells present in the table
		List<WebElement> allCells = driver.findElements(By.xpath("/html/body/table//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);
		//Print ONLY the numbers
		int countNumberValue = 0;
		int sum=0;
		for (WebElement cell : allCells) {
		String cellValue = cell.getText();
		try{
		int number = Integer.parseInt(cellValue);
		System.out.print("Number"+number);
		countNumberValue++;
		sum = sum+number;
		}catch (Exception e) {
		}
		}
		System.out.println("Total count of numeric values is :"+countNumberValue);
		System.out.println("Total sum of all the numeric values is :"+sum);
		//close the browser
		//driver.close();
	}
	@Test
	public void webTable_StudentMarks() {
		driver.get("file:///E:/Nodepad/WebTable_StudentMarks.html");
		//Count Total number of rows present in the table
		List<WebElement> allRows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :"+ totalRows);
		//count total number of columns
		List<WebElement> allColumns = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);
		//Count number of cells present in the table
		List<WebElement> allCells = driver.findElements(By.xpath("/html/body/table//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);
		//Print ONLY the numbers
		int countNumberValue = 0;
		int sum=0;
		for (WebElement cell : allCells) {
		String cellValue = cell.getText();
		try{
		char marks = (char) Integer.parseInt(cellValue);
		System.out.println("Subject :"+marks);
		countNumberValue++;
		sum = sum+marks;
		}catch (Exception e) {
		}
		}
		System.out.println("Total count of marks values is :"+countNumberValue);
		System.out.println("Total sum of marks is :"+sum);
		//close the browser
		//driver.close();
	}
}

