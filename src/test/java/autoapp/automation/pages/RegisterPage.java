package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;


public class RegisterPage extends BasePage {

    public static String signIn_xpath = "//a[@title='Log in to your customer account']";
    public static String email_id = "email_create";
    public static String createAccount_xpath = "//form[@id='create-account_form']//span[1]";
    public static String EmailIderror_xpath = "//*[@id='create_account_error']/ol/li";

    public RegisterPage(BrowserDriver driver) {
        super(driver);
    }

    public static void openApplicaiton() {
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    public static void clickSignIn() {
        driver.findElement(By.xpath(signIn_xpath)).click();
    }

    public static void createAccount(String emailid) {
        // emailid= emailid.replaceAll("Random", Integer.toString(generateRandomIntIntRange(00000, 99999)));
        driver.findElement(By.id(email_id)).sendKeys(emailid);
        System.out.println("email is " + emailid);
        driver.findElement(By.xpath(createAccount_xpath)).click();
    }

    public static void EmailErrorValidation(String errorMessage) {
        Assert.assertEquals(driver.findElement(By.xpath(EmailIderror_xpath)).getText(), errorMessage);
    }
}
