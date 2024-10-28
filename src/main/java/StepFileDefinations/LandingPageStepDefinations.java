package StepFileDefinations;

import org.openqa.selenium.WebDriver;

import PageFactory.LandingPage;
import TestContextPage.TestContextPage;
import io.cucumber.java.en.*;

public class LandingPageStepDefinations{

	
	WebDriver driver;
	public LandingPage landingpage;
	public String getVegname;
	public TestContextPage test;
	
	public LandingPageStepDefinations(TestContextPage test)  {
		this.test = test;
		
	}
	
	
	@Given("greenkart application should open.")
	public void greenkart_application_should_open() 
	{
	 System.out.println("Open the GreenKart Application");  
	}
	@When("^Search with vegetable name (.+)$")
	public void search_with_vegetable_name(String vegName) 
	{
	  landingpage = test.page.getlandingPage();
	  landingpage.searchVegName(vegName);
	  test.existingMethods.waittime(1);
	  landingpage.search_BTN();
	  test.existingMethods.waittime(1);
	 
	  
	  
	}
	@When("Capture the filterDetails and then click on the Link.")
	public void capture_the_filter_details_and_then_click_on_the_link() 
	{
		test.getVegname =  landingpage.getVegName().split("-")[0].trim();
		 System.out.println(test.getVegname);
		 test.existingMethods.waittime(1);
		 String parent = test.existingMethods.parentWindow();
		 System.out.println(parent);
		 test.existingMethods.waittime(1);
		 landingpage.clickonLink();
		 
	}
	

}
