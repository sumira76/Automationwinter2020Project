package checkedBox;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AllToogleCheckedBoxes {
	
	WebDriver driver;
	@Test
	public void CheckListItem() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumira Ghimire\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\AutomationProject winter2020\\JunitProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/103/");
		WebElement AllToggleChecked = driver.findElement(By.name("allbox"));
		AllToggleChecked.click();
		boolean All_CheckedBox_Checked = AllToggleChecked.isDisplayed();
		Assert.assertTrue("ToggleAll checkbox isnot checked", All_CheckedBox_Checked);
	}
}
