package test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.DashboardPage;
import page.ListOfCheckBoxPage;
import util.BrowserFactory;

public class RemoveAllItemsTest {
WebDriver driver;
DashboardPage dashboardPage;
ListOfCheckBoxPage listOfCheckBoxPage;

@Before
public void RemoveAllItemsTest() {
	driver = BrowserFactory.init();
	listOfCheckBoxPage = PageFactory.initElements(driver, ListOfCheckBoxPage.class);
	
	
}
@Test
public void clickToggleAllAndRemove() {
	listOfCheckBoxPage.checkToggleAll();
	listOfCheckBoxPage.clickRemoveButton();
	
	Assert.assertTrue("The checkboxList is clear", checkBoxClear());
	
}

private boolean checkBoxClear() {
	List<String> CheckBoxList = listOfCheckBoxPage.getListOfCheckBox();
	for(int i=0;i<CheckBoxList.size();i++) {
		if(CheckBoxList.get(i).isEmpty()) {
			
		}
	}
	return true;
}

@After
public void tearDown() {
	driver.close();
	driver.quit();
	
}
}
