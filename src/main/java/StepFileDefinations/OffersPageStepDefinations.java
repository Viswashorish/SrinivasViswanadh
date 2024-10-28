package StepFileDefinations;


import org.testng.Assert;

import PageFactory.OffersPage;
import TestContextPage.TestContextPage;
import io.cucumber.java.en.*;

public class OffersPageStepDefinations  {

	public OffersPage offersPage;
	public String expVegName;
	public TestContextPage test;
	
	public OffersPageStepDefinations(TestContextPage test) 
	{
		this.test = test;
	}

	
	
	@Then("^Again Search with vegetable name (.+) and capture the filtered details.$")
	public void again_search_with_vegetable_name_and_capture_the_filtered_details(String vegName) 
	{
		test.existingMethods.swichToChildWindow(); 
		test.existingMethods.waittime(3);
		offersPage = test.page.getoffersPage();
		offersPage.searchVegName(vegName);
		test.existingMethods.waittime(3);
		expVegName = offersPage.getVegName();
	    
	}
	@Then("validate the landing page and Offers Page filter details.")
	public void validate_the_landing_page_and_offers_page_filter_details() 
	{
	    Assert.assertEquals(test.getVegname, expVegName);
	}

}
