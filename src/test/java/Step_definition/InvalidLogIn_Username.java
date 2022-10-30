package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogIn_Username extends TestBase {


    @When("^I enter wrong username$")
    public void iEnterWrongUsername() {
        driver.findElement(By.name("email")).sendKeys("lanre_@gmail.com");
    }

    @And("^I enter correct password$")
    public void iEnterCorrectPassword() {
        driver.findElement(By.id("passwd")).sendKeys("testing");
    }

    @When("^I click the button to login$")
    public void iClickTheButtonToLogin() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should grt the right error message$")
    public void iShouldGrtTheRightErrorMessage() {
        String ExpectedErrorMessage = "Authentication failed.";
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);


        //driver.quit();
    }
}
