package SAUCE_DEMO.cucumber.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class addtocart {
    WebDriver driver;

    String baseUrl = "https://www.saucedemo.com/";

    @Given("the user is logged in on SauceDemo")
    public void the_user_is_logged_in_on_sauce_demo() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("the user adds a product to the cart")
    public void the_user_adds_a_product_to_the_cart() {
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
    }

    @Then("the cart displays the added item count")
    public void the_cart_displays_the_added_item_count() {
        WebElement cartItemCount = driver.findElement(By.className("shopping_cart_link"));
        assertEquals("1", cartItemCount.getText());

    }
}
