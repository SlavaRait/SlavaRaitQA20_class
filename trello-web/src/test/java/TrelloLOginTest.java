import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TrelloLOginTest
{
    WebDriver wd;

    @BeforeMethod
    public void setUp()
    {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://trello.com");
    }
    @Test
    public void loginTest()
    {
        //click login button
        wd.findElement(By.cssSelector("href=\'/login\'")).click();
        //type email
        wd.findElement(By.id("user")).sendKeys("slavarait@gmail.com");
        //type password
        wd.findElement(By.name("password")).sendKeys("sr232323");
        //confirm login
        wd.findElement(By.id("login")).click();


    }

    @AfterMethod
    public void teardown()
    {
        wd.quit();
    }

 }
