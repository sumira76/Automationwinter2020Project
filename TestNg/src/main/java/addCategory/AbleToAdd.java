package addCategory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class AbleToAdd {
	WebDriver driver;
	
	@BeforeClass
public void userAbleToAdd() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumira Ghimire\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\AutomationProject winter2020\\TestNg\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/103/");
}
@Test
		public void AbleToAddCategory() {
	WebElement userAbleToAddCategory = driver.findElement(By.name("data"));
	userAbleToAddCategory.sendKeys("Banana");
		//userAbleToAddCategory.click();
	WebElement userAbleToAddCategory1 = driver.findElement(By.xpath("//input[@value = 'Add']"));
		userAbleToAddCategory1.click();

}
}
