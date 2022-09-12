package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.lang.String;
public class Main_PIM_Page {
    WebDriver driver;

    public Main_PIM_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class = \"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")
    WebElement pimTop;
    @FindBy(xpath = "//a[@href = \"/web/index.php/directory/viewDirectory\"]")
    WebElement directoryBtn;

    @FindBy(xpath = "//*[@class= \"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")
    WebElement openProfileOptionsBtn;

    @FindBy(xpath = "//*[@href= \"/web/index.php/auth/logout\"]")
    WebElement logoutBtn;

    @FindBy(xpath = "//input[not(@placeholder) and not(@type)]")
    WebElement idSearchTB;

    @FindBy(xpath = "//*[@type = \"submit\"]")
    WebElement searchBtn;

    @FindBy(xpath = "//*[@class = \"oxd-text oxd-text--span\"]")
    WebElement recordFoundLbl;

    @FindBy(xpath = "//*[contains(text(), 'Add Employee')]")
    WebElement addEmployeeBtn;

    @FindBy(xpath = "//*[@class = \"oxd-input oxd-input--active orangehrm-firstname\"]")
    WebElement firstNameTB;

    @FindBy(xpath = "//*[@class = \"oxd-input oxd-input--active orangehrm-lastname\"]")
    WebElement lastNameTB;

    @FindBy(xpath = "//*[@class = \"oxd-input oxd-input--active orangehrm-middlename\"]")
    WebElement middleNameTB;

    @FindBy(xpath = "//*[@class = \"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
    WebElement saveEmployeeBtn;

    @FindBy(xpath = "//*[@class = \"oxd-text oxd-text--h6 orangehrm-main-title\"]")
    WebElement addEmployeeLbl;

    @FindBy(xpath = "//*[contains(text(), 'Personal Details')]")
    WebElement personalDetailsLbl;

    @FindBy(xpath = "//*[@class = \"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]")
    WebElement requiredLbl;
    public void clickDirectoryBtn(){directoryBtn.click();}

    public boolean verifyPIM(){return pimTop.isDisplayed();}

    public void clickOnProfileOptions(){openProfileOptionsBtn.click();}

    public void clickLogoutBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
        logoutBtn.click();
    }

    public void setIdSearchTB(String id){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(idSearchTB));
        idSearchTB.sendKeys(id);}

    public void clickSearchBtn(){searchBtn.click();}

    public boolean verifySearchResult(String id){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(recordFoundLbl));
        WebElement searchResul = driver.findElement(By.xpath("//*[contains(text(), '"+id +"')]"));
        return searchResul.isDisplayed();
    }

    public void clickAddEmployeeBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addEmployeeBtn));
        addEmployeeBtn.click();
    }

    public void setFirstNameTB(String firstName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addEmployeeLbl));
        firstNameTB.sendKeys(firstName);
    }

    public void setLastNameTB(String lastName){lastNameTB.sendKeys(lastName);}

    public void setMiddleNameTB(String middleName){middleNameTB.sendKeys(middleName);}

    public void clickSaveEmployeeBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.elementToBeClickable(saveEmployeeBtn));
        saveEmployeeBtn.click();}

    public boolean verifyPersonalDetailsLbl(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.elementToBeClickable(personalDetailsLbl));
        return personalDetailsLbl.isDisplayed();}

    public boolean verifyRequiredLbl(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.elementToBeClickable(requiredLbl));
        return requiredLbl.isDisplayed();
    }
}
