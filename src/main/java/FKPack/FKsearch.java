package FKPack;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FKsearch 
{
@FindBy(xpath="//input[@class='_3704LK']")private WebElement search;
@FindBy(xpath="//button[@class='L0Z3Pu']")private WebElement sericon;
@FindBy(xpath="((//div[@class='_2kHMtA'])[1]//span)[3]")private WebElement star;

WebDriver driver1;

public FKsearch(WebDriver driver)
{
PageFactory.initElements(driver, this);	
driver1=driver;
}
public void setFKsearchserch() throws EncryptedDocumentException, IOException
{
	search.sendKeys(Utilityclass.testdeta(0, 0));
}
public void clickFKsearchsericon()
{
	sericon.click();
}
public void moveFKsearchstar()
{
	Actions act=new Actions(driver1);
	act.moveToElement(star).perform();
	
}
}






