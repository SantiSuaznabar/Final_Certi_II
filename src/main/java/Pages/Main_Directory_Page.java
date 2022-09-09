package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Directory_Page {

    WebDriver driver;

    public Main_Directory_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class =\"oxd-text oxd-text--span\"]")
    WebElement recordsFoundLbl;

    public boolean verifyRecordsLabel(){return recordsFoundLbl.isDisplayed();}

}
