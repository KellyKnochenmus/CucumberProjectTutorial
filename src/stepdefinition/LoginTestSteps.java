package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTestSteps {

    static WebDriver driver;

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
        System.setProperty("webdriver.chrome.driver", "/Applications/selenium-2.53.1/chromedriver");
        driver = new ChromeDriver();
        String baseURL = "http://www.letskodeit.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @When("^User Enters valid UserName and Password$")
    public void user_Enters_valid_UserName_and_Password() throws InterruptedException {
        WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
        signupLink.click();
        WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
        loginLink.click();
        WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
        emailField.sendKeys("test@email.com");
        WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
        passwordField.sendKeys("abcabc");
    }

    @When("^Clicks Go button$")
    public void clicks_Go_button() throws InterruptedException {
        WebElement goButton =driver.findElement(By.cssSelector("#memberLoginDialogoklink"));
        goButton.click();
        Thread.sleep(3000);
    }

    @Then("^He can visit the practice page$")
    public void he_can_visit_the_practice_page() {
        WebElement practicePage = driver.findElement(By.cssSelector("#DrpDwnMn05label"));
        practicePage.click();
    }

    @Then("^A message is displayed$")
    public void a_message_is_displayed() {
        System.out.println("Login Successful");
    }


    @When("^User logs out from the Application$")
    public void user_logs_out_from_the_Application() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^He cannot visit the practice page$")
    public void he_cannot_visit_the_practice_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
