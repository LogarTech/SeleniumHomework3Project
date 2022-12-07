package com.uiTestPractice.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverHelper;

import java.time.Duration;

public class TestBaseUi  {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = DriverHelper.getDriver();
        driver.get("http://uitestpractice.com/Students/Index");
    }

    @AfterMethod
    public void teardown(){
       // driver.quit();
    }


}
