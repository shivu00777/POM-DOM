package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Test {
	
	// we have to create Before class and After class in this page
	

	protected WebDriver driver;
	
	protected String Uname;
	protected String Pwd;
	
	@BeforeClass
	
	
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	
		
		
		Properties pr = new Properties();
		
		
		FileInputStream file = new FileInputStream("/Users/shivamsharma/eclipse-workspace/POM_NOP/src/test/resources/Config.properties");
		
		
		pr.load(file);
		
		
		String Url = pr.getProperty("url");
		
		driver.get(Url);
		
		
		Uname = pr.getProperty("email");
		Pwd = pr.getProperty("pasword");	
		
	}
	
	@AfterClass
	
	public void tearDown() {
		
		driver.quit();
		
	}

}
