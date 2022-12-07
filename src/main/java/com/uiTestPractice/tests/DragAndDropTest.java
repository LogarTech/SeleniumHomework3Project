package com.uiTestPractice.tests;

import com.uiTestPractice.pages.DragAndDropPage;
import org.testng.annotations.Test;
import utils.DriverHelper;

import static utils.DriverHelper.driver;

@Test
public class DragAndDropTest {

    public void validateDragAndDrop() {
        driver = DriverHelper.getDriver();
        driver.get("http://uitestpractice.com/");

        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        dragAndDropPage.dragDrop("Dropped!");
    }
}
