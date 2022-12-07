package com.uiTestPractice.tests;

import com.uiTestPractice.pages.ClickTwoTimesPage;
import com.uiTestPractice.pages.DragAndDropPage;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import utils.DriverHelper;

import static utils.DriverHelper.driver;

@Test
public class ClickTwoTimesTest extends BrowserUtils {

    public void doubleClick() {
        driver = DriverHelper.getDriver();
        driver.get("http://uitestpractice.com/");

        ClickTwoTimesPage clickTwoTimesPage = new ClickTwoTimesPage(driver);
        clickTwoTimesPage.clickTwice();
        clickTwoTimesPage.alert("Double Clicked !!");
    }
}
