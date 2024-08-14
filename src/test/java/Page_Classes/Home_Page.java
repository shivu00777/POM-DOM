package Page_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Page {
	
WebDriver driver;

Select s;
	
	//Create a constructor 
	public Home_Page(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver , this);

	}
	
	//------------Your Personal Details---------------
	@FindBy(id = "AccountFrm_firstname")
	private WebElement firstname;

	@FindBy(id = "AccountFrm_lastname")
	private WebElement lastname;

	@FindBy(id = "AccountFrm_email")
	private WebElement email;
	
	//-------------Your Address----------------------
	@FindBy(id = "AccountFrm_address_1")
	private WebElement address1 ;

	@FindBy(id = "AccountFrm_city")
	private WebElement city;

	@FindBy(id = "AccountFrm_zone_id")
	private WebElement state;

	@FindBy(id = "AccountFrm_postcode")
	private WebElement postcode;

	@FindBy(id = "AccountFrm_country_id")
	private WebElement country ;

	//------------Login Details---------------------------
	@FindBy(id = "AccountFrm_loginname")
	private WebElement loginname;
	
	@FindBy(id = "AccountFrm_password")
	private WebElement loginpassword ;
	
	@FindBy(id = "AccountFrm_confirm")
	private WebElement conformpassword;
	
	//-----------Newsletter-------------------------
	@FindBy(id = "AccountFrm_newsletter0")
	private WebElement noradiobtn;

	@FindBy(id = "AccountFrm_agree")
	private WebElement checkbox;
	
	@FindBy(css = "[title='Continue']")
	private WebElement continuebtn;
	

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getLoginname() {
		return loginname;
	}

	public WebElement getPassword() {
		return loginpassword;
	}

	public WebElement getConformpassword() {
		return conformpassword;
	}

	public WebElement getNoradiobtn() {
		return noradiobtn;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	
	public void PersonalDetails(String firstname , String lastname , String email) {
		
		this.firstname.sendKeys(firstname);
		this.lastname.sendKeys(lastname);
		this.email.sendKeys(email);
		
	}
	
	public void YourAddress(String address1 , String city , String country ,String state, String postcode ) {
		
		this.address1.sendKeys(address1);
		this.city.sendKeys(city);
		
		s= new Select(this.country);
		s.selectByVisibleText(country);
		
		s = new Select(this.state);
		s.selectByVisibleText(state);
		
		this.postcode.sendKeys(postcode);
		
		
	}
	
	public void LoginDetails(String Loginname, String Password, String Conformpassword ) {
		
		loginname.sendKeys(Loginname);
		loginpassword.sendKeys(Password);
		conformpassword.sendKeys(Conformpassword);
		
	}
	
	public void NewsLetter() {
		this.noradiobtn.click();
		this.checkbox.click();
		this.continuebtn.click();
	}
}