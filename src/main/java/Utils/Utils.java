package Utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Utils {
	
	
	WebDriver driver;
	public String Parent ;
	
	public Utils(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void waittime(int i)
	{
		try
		{
			Thread.sleep(i*1000);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public String parentWindow()
	{
		Parent = driver.getWindowHandle();
		return Parent;
	}
	
	
	public void swichToChildWindow()
	{
		Set<String> child = driver.getWindowHandles();
		for(String child_Window: child)
		{
			if(!parentWindow().equals(child_Window))
			{
				driver.switchTo().window(child_Window);
			}
				
		}
		
		
	}
	

}
