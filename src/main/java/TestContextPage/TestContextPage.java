package TestContextPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageManagement.PageManagement;
import Utils.Utils;
import WebManagement.WebManagementPage;

public class TestContextPage 
{

	WebDriver driver;
	public PageManagement page;
	public WebManagementPage web;
	public Utils existingMethods;
	public String getVegname;
	public TestContextPage() throws IOException
	{
		web = new WebManagementPage();
		page = new PageManagement(web.webManagement());
		existingMethods = new Utils(web.webManagement());
	}
}
