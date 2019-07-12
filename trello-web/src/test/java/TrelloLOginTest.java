import org.testng.annotations.Test;

public class TrelloLOginTest extends  TestBase
{

    @Test
    public void loginTest() throws InterruptedException {

        app.clickLoginButton();
        app.fillLoginForm("slavarait@gmail.com", "sr232323");
        app.pause(3000);
        app.confirmLogin();
        app.pause(5000);

//-----------------------------------------------------------
    }

}
