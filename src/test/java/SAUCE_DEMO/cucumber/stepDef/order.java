package SAUCE_DEMO.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class order {

    WebDriver driver;


    @Given("user is logged in page")
    public void user_is_logged_in_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("adds a product to cart")
    public void adds_a_product_to_cart() {
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCartButton.click();
    }

    @And("clicks cart")
    public void clicks_cart() {
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
        cartIcon.click();
    }

    @And("clicks checkout")
    public void clicks_checkout() {
        try {
            Thread.sleep(2000); // Memberikan jeda selama 2 detik
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();
    }

    @And("fills first name, last name, and postal code")
    public void fills_first_name_last_name_and_postal_code() {
        driver.findElement(By.id("first-name")).sendKeys("Aqsoso");
        driver.findElement(By.id("last-name")).sendKeys("A.");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
    }

    @And("clicks continue")
    public void clicks_continue() {
        try {
            Thread.sleep(2000); // Memberikan jeda selama 2 detik
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

    }

    @And("clicks finish")
    public void clicks_finish() {
        try {
            Thread.sleep(2000); // Memberikan jeda selama 3 detik
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();
    }

    @Then("directed to Checkout Complete")
    public void directed_to_checkout_complete() {
        WebElement completeHeader = driver.findElement(By.cssSelector(".complete-header"));
        assertEquals("Thank you for your order!", completeHeader.getText());

        WebElement completeText = driver.findElement(By.cssSelector(".complete-text"));
        assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", completeText.getText());

        //WebElement backToProductsButton = driver.findElement(By.id("back-to-products"));
        //backToProductsButton.click();

        // Close the browser after completing the test
       // driver.quit();
    }
}