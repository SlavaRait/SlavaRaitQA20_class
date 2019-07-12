import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://trello.com");
        login("slavarait@gmail.com", "sr232323");
    }

    @AfterMethod
    public void teardown()
    {
        wd.quit();
    }

    void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    void confirmLogin() {
        click(By.id("login"));
    }

    void click(By locator) {
        wd.findElement(locator).click();
    }

    public void fillLoginForm(String email, String pwd) {

        type(By.name("user"),email);
        type(By.name("password"),pwd);
    }

    void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void clickLoginButton() {
        click(By.xpath("//a[@class='btn btn-sm btn-link text-white']"));
    }
    public void login(String email,String pwd) throws InterruptedException {
        clickLoginButton();
        fillLoginForm(email,pwd);
        pause(3000);
        confirmLogin();
        pause(5000);
    }

    public void confirmBoardCreation()
    {
        click(By.cssSelector("[data-test-id=\"header-create-board-submit-button\"]"));
    }

    void typeBoardName(String boardName) {
        type(By.cssSelector("[data-test-id='header-create-board-title-input']"),boardName);
    }

    void selectCreateBoardFromDSropDown() {
        click(By.cssSelector("[data-test-id='header-create-board-button']"));
    }

    void clickOnPlusButtonOnHeader() {
        click(By.cssSelector("[name=add]"));
    }
     public boolean isElemenetPresent(By locator)
     {
         return wd.findElements(locator).size()>0;

     }
     public boolean isUserLogIn()
     {

     return isElemenetPresent(By.cssSelector("[href='/']"));
     }

      //"slavarait@gmail.com","sr232323"
}
