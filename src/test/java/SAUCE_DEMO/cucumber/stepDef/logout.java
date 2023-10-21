package SAUCE_DEMO.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.Assert.assertTrue;


public class logout {
    WebDriver driver;

    String baseUrl = "https://www.saucedemo.com/";

    @Given("User is logged in")
    public void User_is_logged_in() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("User clicks on the menu button")
    public void User_clicks_on_the_menu_button() {

        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();
    }

    @And("User clicks on the logout button")
    public void User_clicks_on_the_logout_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        logoutButton.click();
        //driver.findElement(By.id("logout_sidebar_link")).click();
    }

    @Then("User should be logged out successfully")
    public void User_should_be_logged_out_successfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
    }
}