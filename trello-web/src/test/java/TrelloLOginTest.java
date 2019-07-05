import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TrelloLOginTest extends  TestBase
{

    @Test
    public void loginTest() throws InterruptedException {
        //click login button
        wd.findElement(By.xpath("//a[@class='btn btn-sm btn-link text-white']")).click();
        Thread.sleep(10000);
        //type email
        wd.findElement(By.name("user")).sendKeys("slavarait@gmail.com");
        Thread.sleep(10000);
        //type password
        wd.findElement(By.name("password")).sendKeys("sr232323");
        //confirm login
        Thread.sleep(10000);
        wd.findElement(By.id("login")).click();
        Thread.sleep(10000);


    }

}
