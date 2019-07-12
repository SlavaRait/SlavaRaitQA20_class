import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTest extends  TestBase
{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException
    {
        if(!isUserLogIn())
        {
            login("slavarait@gmail.com","sr232323");
        }

    }

    @Test

    public void testBoardCreationFromHeader() throws InterruptedException {

        int before=getPersonalBoardsCount();
        clickOnPlusButtonOnHeader();
        selectCreateBoardFromDSropDown();
        pause(5000);
        typeBoardName("qa20");
        confirmBoardCreation();
        pause(12000);
        returnToHomePage();
        int after=getPersonalBoardsCount();
        Assert.assertEquals(after, before+1);


    }

    public void returnToHomePage() {
        click(By.name("house"));
    }

    public int getPersonalBoardsCount()
    {

        return wd.findElements(By.xpath("//span[@class=\"icon-lg icon-member\"]/../../..//li")).size()-1;
    }

}
