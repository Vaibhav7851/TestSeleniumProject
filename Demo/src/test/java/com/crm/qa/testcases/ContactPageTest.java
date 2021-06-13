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

public class ContactPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public ContactPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		//contactsPage = homePage.ClickOnContactsLink();
	}

	@Test(priority=1)
	public void verifyContactLable() {
		contactsPage = homePage.ClickOnContactsLink();
		Assert.assertTrue(contactsPage.verifyContactsLable(),"Contacts Lable is Missing On Page");
	}
	
	@Test(priority=2)
	public void selectContactsText()
	{
		contactsPage = homePage.ClickOnContactsLink();
		contactsPage.selectContactsByName("AMSTERDAM AMS");
	}
	
	
	@Test(priority=3)
	public void validateCreateNewContact()
	{
		homePage.ClickOnNewContactLink();
		
		contactsPage.createNameContact("Mr.", "Vaibhav", "Sinha", "Google");
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
