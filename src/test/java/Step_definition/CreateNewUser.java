package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CreateNewUserPage;

public class CreateNewUser extends TestBase {
    //public WebDriver driver;

    //@Given("^I get on the homescreen$")
    //public void iGetOnTheHomescreen() {
    //  System.setProperty("webdriver.chrome.driver",  "C:\\drivers\\chromedriver.exe");
    //  driver = new ChromeDriver();
    //  driver.manage().window().maximize();
    //  driver.navigate().to("http://automationpractice.com/index.php");
    //}

    //@When("^I get on the login screen$")
    //public void iGetOnTheLoginScreen() {
    //  CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
    //  page.ClickHomePageSignIn();
    //}

    @And("^I enter email address for new account$")
    public void iEnterEmailAddressForNewAccount() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.EnterEmailToCreateNewUser();
    }

    @And("^I click the create account button$")
    public void iClickTheCreateAccountButton() throws InterruptedException {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickAnAccountButton();
    }

    @When("^I enter all required details$")
    public void iEnterAllRequiredDetails() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.SelectGenger();
        page.EnterUserFirstName();
        page.EnterCustomerLastname();
        page.EnterPasswd();
        page.SelectDobDay();
        page.SelectDobMonth();
        page.SelectDobYear();
        page.EnterAddress1();
        page.EnterCity();
        page.SelectState();
        page.EnterPostcode();
        page.EnterMobilePhone();
        page.EnterAlias();
    }

    @And("^I click the register button$")
    public void iClickTheRegisterButton() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickRegisterButton();
    }

    @Then("^My account should be successfully created$")
    public void myAccountShouldBeSuccessfullyCreated() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.AssertLoggedInUser();


        //driver.quit();
    }
}
