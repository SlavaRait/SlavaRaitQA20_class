import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTest extends  TestBase
{
    @BeforeMethod
    public void login() throws InterruptedException {
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

    @Test

    public void testBoardCreationFromHeader() throws InterruptedException {
        //clickOnPlusButtonHaeder
      wd.findElement(By.cssSelector("[name=add]")).click();
      //selectCreateBoardFromDSropDown
      wd.findElement(By.cssSelector("[data-test-id='header-create-board-button']")).click();
      Thread.sleep(10000);
      //TypeBOardName
      wd.findElement(By.cssSelector("[data-test-id='header-create-board-title-input']")).click();
      wd.findElement(By.cssSelector("[data-test-id='header-create-board-title-input']")).sendKeys("qa20");





    }

}
