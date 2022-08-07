package FKPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Baseclass 
{
	public WebDriver driver;
	
public void openBrowser()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anita\\eclipse-workspace\\FLIP_KART\\Browser1\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	
	
	
}

}
