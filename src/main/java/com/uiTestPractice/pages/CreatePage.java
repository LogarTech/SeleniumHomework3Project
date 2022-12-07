package com.uiTestPractice.pages;

import com.uiTestPractice.tests.TestBaseUi;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatePage extends TestBaseUi {


   public static List<String> info = new ArrayList<>();
    public CreatePage(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "FirstName")
    WebElement firstName;

    @FindBy(id = "LastName")
    WebElement lastName;

    @FindBy(id = "EnrollmentDate")
    WebElement enrollmentDate;

    @FindBy(xpath = "//input[contains(@value, 'Create')]")
    WebElement createButton;
    
    public void createStudent(String firstName1, String lastName1, String enrollmentDate1){
        //closeAd.click();
        firstName.sendKeys(firstName1);
        info.add(firstName1);
        lastName.sendKeys(lastName1);
        info.add(lastName1);
        enrollmentDate.sendKeys(enrollmentDate1);
        info.add(enrollmentDate1);
        createButton.click();
        
    }



}
