package Step_definition;

import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import pages.CreateNewUserPage;

import java.io.IOException;

public class common extends TestBase {


      @Before
      public void setup() throws IOException{
          initialize();
      }

    @Given("^I am on the app homepage$")
    public void iAmOnTheAppHomepage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @And("^I click on SignIn$")
    public void iClickOnSignIn() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickHomePageSignIn();

    }
}
