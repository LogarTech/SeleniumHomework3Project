package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class Project3 {


    /*

     */
    @Test

    public void task1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://uitestpractice.com/Students/Index");


        WebElement createButton = driver.findElement(By.xpath("//a[contains(text(), 'Create New')]"));
        createButton.click();

       // WebElement closeAlert= driver.findElement(By.xpath("//span[contains(text(), 'Close')]"));
       // closeAlert.click();






    }


}
