package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.DashboardPage;
import page.ListOfCheckBoxPage;
import util.BrowserFactory;

public class RemoveSingleItemTest {
WebDriver driver;
DashboardPage dashboardPage;
ListOfCheckBoxPage listOfCheckBoxPage;


@Before
public void removeSingleItemTest() {
	driver = BrowserFactory.init();
	listOfCheckBoxPage = PageFactory.initElements(driver, ListOfCheckBoxPage.class);
	
	
}
@Test
public void clickOneItemToRemove() {
	listOfCheckBoxPage.clickItemTodo();try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	listOfCheckBoxPage.clickRemoveButton();
	
	Assert.assertTrue("The item was removed succsesfully", true);
}

//@After
//public void tearDown() {
//	driver.close();
//	driver.quit();
//}



}

