
public class FrameworkOverviewPOM {
	/*
	 * Type of Framework: 

In our project, we are using Data-driven Framework by using Page Object Model design pattern with Page Factory.

POM: 

As per the Page Object Model, we have maintained a class for every web page. Each web page has a separate class and that class holds the functionality and members of that web page. 

Packages: 

We have separate packages for Pages and Tests. All the web page related classes come under the Pages package and all the tests related classes come under Tests package.

Test Base Class: 

Test Base class (TestBase.java) deals with all the common functions used by all the pages. This class is responsible for loading the configurations from properties files, Initializing the WebDriver, Implicit Waits, Extent Reports, 

Utility Class (AKA Functions Class): 

Utility class (TestUtil.java) stores and handles the functions which can be commonly used across the entire framework. The reason behind creating a utility class is to achieve reusability

Properties file: 

This file (config.properties) stores the information that remains static throughout the framework such as browser-specific information, application URL, screenshots path, etc

Screenshots:  

Screenshots will be captured and stored in a separate folder and also the screenshots of failed test cases will be added to the extent reports.

For the reporting purpose, we are using Extent Reports. It generates beautiful HTML reports. We use the extent reports for maintaining logs and also to include the screenshots of failed test cases in the Extent Report.

All the test data will be kept in an excel sheet (controller.xlsx). By using ‘controller.xlsx’, we pass test data and handle data-driven testing. We use Apache POI to handle excel sheets.

We use TestNG for Assertions, Grouping, and Parallel execution.

We use Git as a repository to store our test scripts.	

By using Jenkins CI (Continuous Integration) Tool, we execute test cases on a daily basis and also for nightly execution based on the schedule.
	 */

}
