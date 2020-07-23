package addCategory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserNotAbleToAddDublicate {
	
WebDriver driver;
	
@BeforeClass
public void userNotAbleToAdd() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumira Ghimire\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\AutomationProject winter2020\\TestNg\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/103/");
}
@Test
		public void notAbleToAddCategory() {
		WebElement ADD_CATEGORY  = driver.findElement(By.name("data"));
		ADD_CATEGORY .sendKeys("MANGO");
		WebElement ADD_CATEGORY1  = driver.findElement(By.xpath("//input[@value='Add']"));
		 ADD_CATEGORY1.click();
		
		WebElement addduplicatecatagory = driver
				.findElement(By.xpath("//input[@value='Add']"));
		boolean DUPLICATED_CATAGORY = addduplicatecatagory.isDisplayed();
		Assert.assertFalse(DUPLICATED_CATAGORY);
		
}
}
