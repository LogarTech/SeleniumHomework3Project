package com.uiTestPractice.tests;

import com.uiTestPractice.pages.Test7TaskPage;
import com.uiTestPractice.pages.YoutubePage;
import org.testng.annotations.Test;
import utils.DriverHelper;

import static utils.DriverHelper.driver;
@Test
public class Test7TaskTest {

    public void clickToStart() {
        driver = DriverHelper.getDriver();
        driver.get("http://uitestpractice.com/");

        Test7TaskPage test7TaskPage = new Test7TaskPage(driver);
        test7TaskPage.toYoutube();
        YoutubePage youtubePage = new YoutubePage(driver);
        youtubePage.switchToYoutube();
//      youtubePage.rejectMethod();
        youtubePage.validateTitle();
        youtubePage.getLinkText();


    }

}
