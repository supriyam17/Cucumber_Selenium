package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	 public RegisterPage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }	 
	 @FindBy(linkText="New Customer")
	 private WebElement new_customer_link;
	 
	 @FindBy(xpath="(//INPUT[@name='name'])[1]")
	 private WebElement txt_name;
	 
	 @FindBy(xpath="(//INPUT[@type='radio'])[2]")
	 private WebElement gender;
	 
	 @FindBy(xpath="(//INPUT[@name='dob'])")
	 private WebElement txt_dob;
	 
	 @FindBy(xpath="//TEXTAREA[@rows='5']")
	 private WebElement txt_addr;
	 
	 @FindBy(xpath="(//INPUT[@name='city'])")
	 private WebElement txt_city ;
	 
	 @FindBy(xpath="(//INPUT[@name='state'])")
	 private WebElement txt_state;
	 
	 @FindBy(xpath="(//INPUT[@name='pinno'])")
	 private WebElement txt_pinno;
	 
	 @FindBy(xpath="(//INPUT[@name='telephoneno'])")
	 private WebElement txt_phone;
	 
	 @FindBy(xpath="(//INPUT[@name='emailid'])")
	 private WebElement txt_email;
	 
	 @FindBy(xpath="(//INPUT[@name='password'])")
	 private WebElement txt_password;
	 
	 @FindBy(xpath="(//INPUT[@name='sub'])")
	 private WebElement submit;
	 
	 public void click_register_link() 
	 	{
		 new_customer_link.click();
		 }
	 public void enter_Name(String name) {
		 txt_name.sendKeys(name);
		 }
		 
		 public void select_gender() {
		 gender.click();
		 }
		 
		 public void enter_dob(String dob) {
		 txt_dob.sendKeys(dob);
		 }
		 
		 public void enter_Address(String addr) {
		 txt_addr.sendKeys(addr);
		 }
		 
		 public void enter_City(String city) {
		 txt_city.sendKeys(city);
		 }
		 
		 public void enter_State(String state) {
		 txt_state.sendKeys(state);
		 }
		 
		 public void enter_Pinno(String pinno) {
		 txt_pinno.sendKeys(pinno);
		 }
		 
		 public void enter_Telephoneno(String telephoneno) {
		 txt_phone.sendKeys(telephoneno);
		 }
		 
		 public void enter_Email(String emailid) {
		 txt_phone.sendKeys(emailid);
		 }
		 
		 public void enter_Password(String password) {
		 txt_phone.sendKeys(password);
		 }
		 
		 public void click_submit()
		 {
			 submit.click();
		 }
		 public void fill_PersonalDetails() {
			 click_register_link();
			 enter_Name("Supriya");
			 select_gender();
			 enter_dob("17-01-1997");
			 enter_Address("nagpur");
			 enter_City("Nagpur");
			 enter_State("Maharashtra");
			 enter_Pinno("440022");
			 enter_Telephoneno("3908839712");
			 enter_Email("supiee@gmail.com");
			 enter_Password("yreydgfh");
			 click_submit();
			 
			 }
	 
	 
	 
	 
	 
}