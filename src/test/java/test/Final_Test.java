package test;

import org.testng.annotations.Test;

import Page_Classes.Log_in;
import generics.Base_Test;

public class Final_Test extends Base_Test{

	Log_in page;
	
	
	
	// The base should be parent class of all the test classes
	
	
	@Test
	public void log_in_test() {
		
		 page = new Log_in(driver); 
		 
		 page.log_in(Uname, Pwd);
		 
		 
		 
		 
		 
		 
	}
	
	
}
