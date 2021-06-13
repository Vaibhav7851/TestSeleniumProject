package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage= new LoginPage();
		homepage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	@Test(priority =1)
	public void verifyHomePageTitle() {
		String homepageTile = homepage.verifyHomePageTitle();
		Assert.assertEquals(homepageTile, "CRMPRO","HomePage Title is not matched");
		
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		testUtil.switchToFrame();
		Assert.assertTrue(homepage.userNameLable());
	}
	
	@Test(priority=3)
	public void verifyContactsLinkTest() {
		testUtil.switchToFrame();
		contactsPage =homepage.ClickOnContactsLink();
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
