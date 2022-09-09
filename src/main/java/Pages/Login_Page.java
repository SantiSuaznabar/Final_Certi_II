package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_Page {

    //https://opensource-demo.orangehrmlive.com/web/index.php
    //div[text()='Current Employees Only']
//label[text()='Employee Name']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/div/div/div/input
    //label[text()='Supervisor Name']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/div/div/div/input

    // //label[text()='Employment Status']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/div/div/div/div[text()='-- Select --']
    WebDriver driver;

    public Login_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name = \"username\"]")
    WebElement usernameTB;

    @FindBy(xpath = "//input[@name = \"password\"]")
    WebElement passwordTB;

    @FindBy(xpath = "//*[@class= \"oxd-text oxd-text--p oxd-alert-content-text\"]")
    WebElement invalidText;

    @FindBy(xpath = "//button[@type = \"submit\"]")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@class= \"oxd-text oxd-text--h5 orangehrm-login-title\"]")
    WebElement loginLbl;

    public void setUsernameTB(String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(usernameTB));
        usernameTB.sendKeys(username);}
    public void setPasswordTB(String pass){passwordTB.sendKeys(pass);}
    public void clickLoginBtn(){loginBtn.click();}

    public boolean verifyErrorMSG(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(usernameTB));
        return invalidText.isDisplayed();}

    public boolean verifyLoginLabel(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginLbl));
        return loginLbl.isDisplayed();}
}
