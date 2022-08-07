package FKart;


import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import FKPack.Baseclass;
import FKPack.FKlogin;
import FKPack.FKsearch;
import FKPack.Utilityclass;

public class FKTestclass extends Baseclass
{
FKlogin f;
FKsearch s;
int tcid;

@BeforeClass
public void openFKapp()
{
	openBrowser();
    f=new FKlogin(driver);
	s=new FKsearch(driver);
	tcid=100;
}
@Test

public void signinfk() throws IOException, InterruptedException
{
	f.setFKloginmob(Utilityclass.getpfdata("mobnum"));
	f.setFKloginpass(Utilityclass.getpfdata("pwd"));
	f.clickFKloginbutton();
	Thread.sleep(2000);
	
	s.setFKsearchserch();
	Thread.sleep(2000);
	s.clickFKsearchsericon();
	s.moveFKsearchstar();
}
@AfterMethod
public void closeFK(ITestResult ele) throws IOException, InterruptedException
{
	if(ele.getStatus()==ITestResult.SUCCESS)
	{
		Thread.sleep(2000);
	Utilityclass.capturescreenshot(driver, tcid);
	}
}
@AfterClass
public void logoutfk()
{
	driver.quit();
}


	
}
