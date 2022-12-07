package com.uiTestPractice.tests;

import com.uiTestPractice.pages.IframePage;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import utils.DriverHelper;

import static utils.DriverHelper.driver;
import static utils.DriverHelper.getDriver;

public class IframeTest extends BrowserUtils {

    @Test
    public void clickIframe() {
        driver = getDriver();
        driver.get("http://uitestpractice.com/");
        IframePage iframePage = new IframePage(getDriver());

        iframePage
                .switchFrame()
                .enterName("Valodea")
                .switchToParentFrame()
                .clickLink()
                .switchFrame()
                .assertionFinal();
    }
}
