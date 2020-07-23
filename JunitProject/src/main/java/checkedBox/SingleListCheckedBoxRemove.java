package checkedBox;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleListCheckedBoxRemove {
	WebDriver driver;
	@Test
	public void ListItemCouldBeRemoved() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumira Ghimire\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\AutomationProject winter2020\\CheckBox\\drivers\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/103/");
		WebElement SingleListChecked = driver.findElement(By.name("todo[0]"));
		SingleListChecked.click();
		WebElement SingleListChecked1 = driver.findElement(By.name("submit"));
		SingleListChecked1.click();

}
}