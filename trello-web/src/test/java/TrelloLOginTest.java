import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TrelloLOginTest extends  TestBase
{

    @Test
    public void loginTest() throws InterruptedException {

        clickLoginButton();
        fillLoginForm("slavarait@gmail.com", "sr232323");
        pause(3000);
        confirmLogin();
        pause(5000);

//-----------------------------------------------------------
    }

}
