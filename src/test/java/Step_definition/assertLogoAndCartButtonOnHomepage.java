package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertLogoAndCartButtonOnHomepage extends TestBase {
    //public WebDriver driver;

    //@Given("^I lunch a browser$")
    //public void iLunchABrowser() {
    //  System.setProperty("webdriver.chrome.driver",  "C:\\drivers\\chromedriver.exe");
    //  driver = new ChromeDriver();
    //  driver.manage().window().maximize();
    //}

    //@And("^I enter application url$")
    //public void iEnterApplicationUrl() {
    //  driver.navigate().to("http://automationpractice.com/index.php");
    //}

    @When("^I wait for (\\d+) seconds$")
    public void iWaitForSeconds(int arg0) throws InterruptedException {
        Thread.sleep(5000);
    }

    @Then("^I should see application logo and add to cart button$")
    public void iShouldSeeApplicationLogoAndAddToCartButton() {
        driver.findElement(By.id("header_logo")).isDisplayed();
        driver.findElement(By.className("shopping_cart")).isDisplayed();

        //driver.quit();
    }
}
