package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage7 {
	@FindBy(xpath="//input[@id='email']")private WebElement UN;
	@FindBy(xpath="//input[@id='pass']")private WebElement PWD;
	@FindBy(xpath="//button[@name='login']")private WebElement loginbtn;
	public LoginPage7(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void username22(String username) {
		UN.sendKeys(username);
	}
	public void password22(String password) {
		PWD.sendKeys(password);
	}
	public void loginbt22() {
		loginbtn.click();
		
	}
}
