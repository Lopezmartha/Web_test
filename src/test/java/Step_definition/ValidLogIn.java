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

public class ValidLogIn extends TestBase {

    @And("^I enter valid username$")
    public void iEnterValidUsername() {
        driver.findElement(By.name("email")).sendKeys("lanre_april@gmail.com");
    }

    @And("^I enter valid password$")
    public void iEnterValidPassword() {
        driver.findElement(By.id("passwd")).sendKeys("testing");
    }

    @When("^I click the login button$")
    public void iClickTheLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should be logged in sucessfully$")
    public void iShouldBeLoggedInSucessfully() {
        String ExpectedLoggedInUser = "Dorice Mbonde";
        String ActualLoggedInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
        //driver.quit();
    }
}
