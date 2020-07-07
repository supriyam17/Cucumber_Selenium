package pageObjects;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
 
public class HomePage {
 WebDriver driver;
 
 public HomePage(WebDriver driver) {
 this.driver = driver;
 PageFactory.initElements(driver, this);
 }

 public void navigateTo_HomePage() {
 driver.get("http://demo.guru99.com/v4/");
 }
 
}