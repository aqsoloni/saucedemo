package SAUCE_DEMO.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("user is on the login page")
    public void user_is_on_the_login_page(){
        driver = new ChromeDriver();
        driver.get(baseUrl);

        // assertion
        //String LoginPageAssert = driver.findElement(By.id())

    }

    @When("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("clicks the login button")
    public void clicks_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user should be redirected to the home page")
    public void userShouldBeRedirectedToTheHomePage() {
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        driver.findElement(By.id("user-name")).sendKeys("standarduser");
        driver.findElement(By.id("password")).sendKeys("secret_sauces");
    }

    @Then("user should see an error message")
    public void user_should_see_an_error_message() {
    }
}
