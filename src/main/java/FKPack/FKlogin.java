package FKPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FKlogin
{
@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")private WebElement mob;
@FindBy(xpath="//input[@type='password']")private WebElement pass;
@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")private WebElement logi;

public FKlogin(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setFKloginmob(String mobnum)
{
	mob.sendKeys(mobnum);
}
public void setFKloginpass(String pwd)
{
	pass.sendKeys(pwd);
}
public void clickFKloginbutton()
{
	logi.click();
}
}
