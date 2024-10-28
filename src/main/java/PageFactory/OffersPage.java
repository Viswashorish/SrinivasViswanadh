package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage 
{

	WebDriver driver;
	
	public OffersPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search_field = By.xpath("//*[@id=\"search-field\"]");
	
	By vegname_get = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/table/tbody/tr/td[1]");
	
	
	
	public void searchVegName(String vegName)
	{
		driver.findElement(search_field).sendKeys(vegName);
	}
	
	
	public String getVegName()
	{
		return driver.findElement(vegname_get).getText();
	}
	
	
	
}
