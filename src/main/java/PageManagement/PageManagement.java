package PageManagement;

import org.openqa.selenium.WebDriver;

import PageFactory.LandingPage;
import PageFactory.OffersPage;

public class PageManagement 
{
	
	WebDriver driver;
	
	public LandingPage landingpage;
	public OffersPage offersPage;

	
	public PageManagement(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public LandingPage getlandingPage()
	{
		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	public OffersPage getoffersPage()
	{
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	
	
	

}
