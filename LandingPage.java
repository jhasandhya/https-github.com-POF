import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage{

	
	public static void main(String[] args) 
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sandhya jha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	String landingPageUrl= "https://www.pof.com";
	WebDriverWait wait=new WebDriverWait(driver, 20); 
	
	//String expectedTitle="Google";
	
	driver.get(landingPageUrl);
	driver.manage().window().maximize();
	driver.findElement(By.id("logincontrol_username")).sendKeys("dtk600");
	
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