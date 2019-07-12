import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTest extends  TestBase
{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException
    {
        if(!app.isUserLogIn())
        {
            app.login("slavarait@gmail.com","sr232323");
        }

    }

    @Test

    public void testBoardCreationFromHeader() throws InterruptedException {

        int before= app.getPersonalBoardsCount();
        app.clickOnPlusButtonOnHeader();
        app.selectCreateBoardFromDSropDown();
        app.pause(5000);
        app.typeBoardName("qa20");
        app.confirmBoardCreation();
        app.pause(12000);
        app.returnToHomePage();
        int after= app.getPersonalBoardsCount();
        Assert.assertEquals(after, before+1);


    }

}
