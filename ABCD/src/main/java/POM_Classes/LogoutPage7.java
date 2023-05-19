package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage7 {
@FindBy(xpath="//span[text()='Log Out']")private WebElement logoutbtn;
public LogoutPage7(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void logoutbtn22() {
	logoutbtn.click();
}
}
