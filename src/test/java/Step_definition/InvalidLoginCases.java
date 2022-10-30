package Step_definition;

import Base.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginCases extends TestBase {
    //public WebDriver driver;

    //@Given("^I land on the homepage$")
    //public void iLandOnTheHomepage() {
    //System.setProperty("webdriver.chrome.driver",  "C:\\drivers\\chromedriver.exe");
    //driver = new ChromeDriver();
    //driver.manage().window().maximize();
    //driver.navigate().to("http://automationpractice.com/index.php");
    // }

    //@And("^I press the sign$")
    //public void iPressTheSign() {
    //  driver.findElement(By.linkText("Sign in")).click();
    //}

    @And("^I Type \"([^\"]*)\"$")
    public void iType(String Username) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(Username);
    }

    @When("^I Input \"([^\"]*)\"$")
    public void iInput(String Password) throws Throwable {
        driver.findElement(By.name("passwd")).sendKeys(Password);

    }

    @When("^I click the login$")
    public void iClickTheLogin() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should get the correct \"([^\"]*)\"$")
    public void iShouldGetTheCorrect(String error) throws Throwable {
        String ExpectedErrorMessage = error;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);


    }
}
