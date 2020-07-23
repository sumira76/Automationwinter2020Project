package step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepTest {
	
	WebDriver driver=null;

@Given("^Set SkyBlue Background$")
	public void set_SkyBlue_Background() throws Throwable {
		System.out.println("Change skyblueBackground color");   
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
		System.out.println("url entered http://techfios.com/test/103/");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumira Ghimire\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\AutomationProject winter2020\\CuUmberProject\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("http://techfios.com/test/103/");
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		driver.findElement(By.xpath("//*[@id='extra']/button[1]")).click();  
	}
	


}
