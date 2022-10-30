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

public class InValidLogIn extends TestBase {


    @And("^I enter correct username$")
    public void iEnterCorrectUsername() {
        driver.findElement(By.name("email")).sendKeys("lanre_april@gmail.com");
    }

    @And("^I enter incorrect password$")
    public void iEnterIncorrectPassword() {
        driver.findElement(By.id("passwd")).sendKeys("test");
    }

    @When("^I clicked the login button$")
    public void iClickedTheLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should get the error message$")
    public void iShouldGetTheErrorMessage() {
        String ExpectedErrorMessage = "Invalid password.";
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);

        //driver.quit();
    }
}
