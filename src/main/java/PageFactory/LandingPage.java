package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage 
{
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search_field = By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/form/input");
	
	By search_BTN = By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/form/button");
	
	By vegname_get = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/h4");
	
	By link = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[2]");
	
	public void searchVegName(String vegName)
	{
		driver.findElement(search_field).sendKeys(vegName);
	}
	
	public void search_BTN()
	{
		driver.findElement(search_BTN).click();
	}
	
	public String getVegName()
	{
		return driver.findElement(vegname_get).getText();
	}
	
	public void clickonLink()
	{
		driver.findElement(link).click();
	}


}
