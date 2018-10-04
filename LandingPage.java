import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
/*import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
*/

public class LandingPageLogin{

	
	public static void main(String args[]) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sandhya jha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	String landingPageUrl= "https://www.pof.com";
	
	
	//String expectedTitle="Google";
	
	driver.get(landingPageUrl);
	driver.manage().window().maximize();
	//driver.findElement(By.id("//*[@id='wrapper']/div[1]/div/div/span[3]/a")).click();
	driver.findElement(By.id("logincontrol_username")).sendKeys("dtk600");
	@SuppressWarnings("unused")
	WebDriverWait wait = new WebDriverWait (driver, 120);
	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.id("logincontrol_password")).sendKeys("androidqa");
	System.out.println("Test Passed!");
	//driver.findElement(By.id("logincontrol_submitbutton")).click();
	//Thread.sleep(5000);
	System.out.println("BEFORE LOGIN");
	driver.findElement(By.xpath("//button[contains(text(),'Check Mail!')]")).click();
	System.out.println("Logged In");
	driver.close();
	
	
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
