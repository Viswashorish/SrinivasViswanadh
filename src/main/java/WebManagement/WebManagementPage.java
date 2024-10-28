package WebManagement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebManagementPage 
{
	
	WebDriver driver;
	
	
	public WebDriver webManagement() throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//main//Resources//app.properties");
		Properties pr = new Properties();
		pr.load(file);
		 String URL = pr.getProperty("QAURL");
		 if(driver==null)
		 {
			 if(pr.getProperty("browser").equalsIgnoreCase("chrome"))
			 {
				 driver = new ChromeDriver();
			 }
			 
			 else if(pr.getProperty("browser").equalsIgnoreCase("edge"))
			 {
				 driver = new EdgeDriver();
			 }
			 
			 driver.get(URL);
			 driver.manage().window().maximize();
		 }
		 return driver;
		
	}
	
}
