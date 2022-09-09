package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.DriverManager;

public class CommonSteps {

    @Given("Im in OrangeHRM page")
    public void goToOrangeHRMPage() {
        DriverManager.getDriver().driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
        DriverManager.getDriver().driver.manage().window().maximize();
    }
}
