package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SeleniumLoginTest {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/selenium-2.53.1/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://www.letskodeit.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);

        WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
        signupLink.click();

        WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
        loginLink.click();

        WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
        emailField.sendKeys("test@email.com");

        WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
        passwordField.sendKeys("abcabc");

       // WebElement goButton = driver.findElement(By.id("memberLoginDialogsubmitButton"));
        //goButton.click();

// With recent webdriver and FF update, there might be issues in clicking the goButton.
// If you also encouter the issues, please comment the above code for goButton and un-comment the below code

		WebElement goButton =driver.findElement(By.cssSelector("#memberLoginDialogoklink"));
		goButton.click();
		//Actions action = new Actions(driver);
		//action.moveToElement(goButton).click().perform();

        Thread.sleep(3000);

        WebElement practicePage = driver.findElement(By.cssSelector("#DrpDwnMn05label"));
        practicePage.click();
        System.out.println("Login Successful");
    }
}
