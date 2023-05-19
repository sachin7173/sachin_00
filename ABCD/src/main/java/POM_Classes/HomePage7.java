package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage7 {
	@FindBy(xpath="//div[@class='x78zum5 x1n2onr6']")private WebElement accountbtn;
	@FindBy(xpath="//span[text()='Sachin Kolhe']")private WebElement verifyusername;
	public HomePage7(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void accountbtn22() {
		accountbtn.click();
	}
	public String verifyusername22() {
		String actResult = verifyusername.getText();
		return actResult;
		
	}
}
