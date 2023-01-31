package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;
//MY first test
public class FirstTest extends BaseClass {

	@Test
	public void firstTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.handleChildBrowser();
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		demoApp.mouseHoverToCourseTab(web);
		demoApp.clickSeleniumTraining();
		soft.assertTrue(selenium.getPageHeader().isDisplayed());
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handlesAlert();
		web.screenShot(null);
		soft.assertAll();
		
		
		
	}
}
