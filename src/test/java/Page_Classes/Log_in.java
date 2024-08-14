package Page_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_in {

	
	WebDriver driver;
	
	
	public  Log_in(WebDriver driver){
	
		
	this.driver = driver;
	
	
	PageFactory.initElements(driver, this);
	
	
		
	}
	
	
			@FindBy(linkText ="Login or register")
			private WebElement clickLinkorRegister;
			

			@FindBy(css="[name=\"loginname\"]")
			private WebElement loginname;
			
			
			@FindBy(css="[name=\"password\"]")
			private WebElement password;
			
			
			@FindBy(css="[title=\"Login\"]")
			private WebElement loginButton;
			
			
			@FindBy (linkText="Forgot your password?")
			private WebElement forgot;
	
				
			@FindBy(css="[title=\"Continue\"]")
			private WebElement Continue;
	
	

			
	
			public WebElement getClickLinkorRegister() {
				return clickLinkorRegister;
			}





			public WebElement getLoginname() {
				return loginname;
			}





			public WebElement getPassword() {
				return password;
			}





			public WebElement getLoginButton() {
				return loginButton;
			}





			public WebElement getForgot() {
				return forgot;
			}





			public WebElement getContinue() {
				return Continue;
			}





			public void log_in(String email, String pasword) {

				clickLinkorRegister.click();
				
				loginname.sendKeys(email);
				
				password.sendKeys(pasword);
				
				loginButton.click();
				
			}
			
	
}
