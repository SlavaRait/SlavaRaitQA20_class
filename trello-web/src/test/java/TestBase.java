import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    ApplicationManager app = new ApplicationManager();
    WebDriver wd;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        app.init();
    }

    @AfterMethod
    public void teardown()
    {
        app.stop();
    }

    //"slavarait@gmail.com","sr232323"
}
