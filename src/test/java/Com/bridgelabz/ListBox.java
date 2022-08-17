package Com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListBox {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP 14-dh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
	}
	@Test
	public void select_Element_ListBox() {
		driver.get("file:///C:/Users/HP%2014-dh/Desktop/ListBox_Breakfast.html");
		WebElement list = driver.findElement(By.id("mtr"));
		//Create an object of Select class and pass the address of list box as an argument
		Select s = new Select(list);
		//getOptions() method returns a list of all the elements of the list box
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("Number of elements present inside the listbox is : "+ size);
		//Print all the elements present in the list box
		for (WebElement webElement : options) {
		String text = webElement.getText();
		System.out.println(text);
		}
		//selectByIndex() selects an element based on the Index, here index starts with 0
		s.selectByIndex(0);
		//selectByValue() method selects an element based on its value attribute.
		s.selectByValue("v");
		/*selectByVisibleText() method selects an element based on the actual text that is visible to the 
		user. For instance, if there are multiple Poori present inside the listbox , it will select all the 
		Poori elements.*/
		s.selectByVisibleText("Poori");
		System.out.println("**Print all selected options*");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();
		System.out.println("Number of items that is selected in the list box is : "+size2);
		System.out.println(" Selected items are printed below ");
		for (WebElement webElement : allSelectedOptions) {
		System.out.println(webElement.getText());
		}
		System.out.println("check whether it is a multiple select listbox or not");
		boolean multiple = s.isMultiple();
		System.out.println(multiple +" yes , it is multi select");
		if (multiple) {
		//Print the first selected option in the list box
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText()+"is the first selected item in the list box"); 
		
		//deselect the item present in 0th index.
		s.deselectByIndex(0);
		//Print the first selected option in the list box
		WebElement firstSelectedOption1 = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption1.getText()+" is the first selected item");
		//deselect an item which has an attribute called value and its value is "v"
		s.deselectByValue("v");
		//Print the first selected option in the list box
		WebElement firstSelectedOption2 = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption2.getText()+" is the first selected item");
		s.deselectByVisibleText("Poori");
		}
		}
	@Test
	public void shorted_list() {
		driver.get("file:///C:/Users/HP%2014-dh/Desktop/ListBox_Breakfast.html");
		WebElement listElement = driver.findElement(By.id("mtr"));
		Select s = new Select(listElement);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		System.out.println("-----print the values in the list ----");
		ArrayList<String> list = new ArrayList<String>();
		for (WebElement option : allOptions) {
		String text = option.getText();
		System.out.println(text);
		list.add(text);
		}
		Collections.sort(list);
		System.out.println("-----print the value in sorted order----");
		for (String value : list) {
		System.out.println(value);
	}
}
}
