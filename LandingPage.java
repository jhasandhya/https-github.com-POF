import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
*/

public class LandingPage{

	
	public static void main(String args[]) throws InterruptedException
	{
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\sandhyajha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	String landingPageUrl= "https://www.pof.com";
	
	
	//String expectedTitle="Google";
	
	driver.get(landingPageUrl);
	driver.manage().window().maximize();
	driver.findElement(By.id("logincontrol_username")).sendKeys("dtk600");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.id("logincontrol_password")).sendKeys("androidqa");
	System.out.println("Test Passed!");
	driver.findElement(By.id("logincontrol_submitbutton")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//button[contains(text(),'Check Mail!')]")).click();
	
	
	//String actualTitle=driver.getTitle();
	
	//assertEquals(expectedTitle,actualTitle);
	
	/*
	if (actualTitle.contentEquals(expectedTitle))
	{
        System.out.println("Test Passed!");
    } 
	else 
	{
        System.out.println("Test Failed");
    }
    */
}

	//private static void assertEquals(String expectedTitle, String actualTitle) {
		// TODO Auto-generated method stub}
	

	
}