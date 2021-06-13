package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath="//td[contains(text(),'User: group automation')]")
	WebElement userNameLable;
	

	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement taskLink;
	
	@FindBy(xpath="//a[@title='New Contact']")
	WebElement newContactLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage ClickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public void ClickOnNewContactLink()  {
		
		
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
		System.out.println("Pass");
		
	}
	
	public TaskPage ClickOnLinkPage() {
		taskLink.click();
		return new TaskPage();
	}
	
	public boolean userNameLable() {
		return userNameLable.isDisplayed();
		
	}
	
	
}
