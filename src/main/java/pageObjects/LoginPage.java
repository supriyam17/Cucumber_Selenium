package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }	 
	 @FindBy(xpath="//INPUT[@name='uid']")
	 private WebElement txt_username;
	 
	@FindBy(xpath="//INPUT[@name='password']") 
	 private WebElement txt_password;
	
	@FindBy(xpath="//INPUT[@name='btnLogin']")
	private WebElement btn_login;
	 
	 public void enter_credential(String username, String password) {
		 txt_username.sendKeys(username);
		 txt_password.sendKeys(password);
	 }
	 
	 public void clickOn_Button() {
	    btn_login.click();
	 }
	 

}