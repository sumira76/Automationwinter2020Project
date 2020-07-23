package addCategory;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver driver;
	@BeforeClass
public void userAbleToAdd() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumira Ghimire\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\AutomationProject winter2020\\TestNg\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/103/");
}
@Test
public void userAbleToVAlidateDropDown() {

	String arr[] = {"None","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	
	//Identify the dropdown list with the help of any locator
	Select select = new Select(driver.findElement(By.name("due_month")));
	List<WebElement> dropdownValues= select.getOptions();
	System.out.println(dropdownValues.size());
	for(int i=0;i<dropdownValues.size();i++) {
		Assert.assertEquals(arr[i], dropdownValues.get(i).getText());
		
	}

	System.out.println("verification successful");
	
}

}






