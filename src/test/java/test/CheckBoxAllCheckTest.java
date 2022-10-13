package test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.ListOfCheckBoxPage;
import util.BrowserFactory;

public class CheckBoxAllCheckTest {
WebDriver driver;
ListOfCheckBoxPage listOfCheckBoxPage;

//WebElement
@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
WebElement CheckAllBox ;

@Before
public void checkBoxTest() {
	driver = BrowserFactory.init();
	listOfCheckBoxPage = PageFactory.initElements(driver, ListOfCheckBoxPage.class);
}
@Test
public void toggleAllCheckBoxIsOn() {
	listOfCheckBoxPage.checkToggleAll();
	Assert.assertTrue(CheckBoxIsSelected(CheckAllBox));
}

private boolean CheckBoxIsSelected(WebElement listCheckBoxElementos) {
	List<WebElement> list = driver.findElements(By.xpath("//input[@name='allbox']"));
	for(int i=0;i<list.size();i++) {
		if(list.get(i).isSelected()) {
			
		}
	}
	return true;
}

/*@After
public void tearDown() {
	driver.close();
	driver.quit();
}*/
}
