package Test_Classes;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Classes.BaseClass7;
import POM_Classes.HomePage7;
import POM_Classes.LoginPage7;
import POM_Classes.LogoutPage7;
import POM_Classes.UtilityClass7;

public class Test_Class_1 extends BaseClass7 {

	LoginPage7 login;
	HomePage7 home;
	LogoutPage7 logout;
	
	@BeforeClass
	public void openBrowser23() throws IOException, InterruptedException {
		openBrowser();
		login =new LoginPage7(driver);
		home =new HomePage7(driver);
		logout =new LogoutPage7(driver);
		
	}
	@BeforeMethod
	public void login23() throws IOException, InterruptedException {
	login.username22(UtilityClass7.getPropertyFile("username"));
	login.password22(UtilityClass7.getPropertyFile("password"));
     login.loginbt22();
     Thread.sleep(2000);
     home.accountbtn22();
	}
	@Test
	public void verifyusername22() throws IOException {
		String expResult = UtilityClass7.getPropertyFile("username1");
		String actResult = home.verifyusername22();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actResult, expResult,"act and exp resul is different");
		soft.assertAll();
	}
	@AfterMethod
	public void logout22(ITestResult result) throws IOException, InterruptedException {
		if(result.getStatus()==ITestResult.FAILURE) {
			int TCID=4533;
			UtilityClass7.CaptureScreenshot(driver, TCID);
			Thread.sleep(2000);
		}
		logout.logoutbtn22();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
