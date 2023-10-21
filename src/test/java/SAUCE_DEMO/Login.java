package SAUCE_DEMO;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;


public class Login {
    @Test //tag untuk running script
    public void open_browser() {
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        //String title = driver.getTitle();
        //System.out.println(title);

        // Input username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Input password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Klik tombol login
        driver.findElement(By.xpath("//login-button[@type='submit']")).click();

        // quit
        driver.close();


        // Input username
        //WebElement usernameInput = driver.findElement(By.id("user-name"));
        //usernameInput.sendKeys("standard_user");

        // Input password
        //WebElement passwordInput = driver.findElement(By.id("password"));
        //passwordInput.sendKeys("secret_sauce");

        // Klik tombol login
        //WebElement loginButton = driver.findElement(By.id("login-button"));
        //loginButton.click();



    }
}
