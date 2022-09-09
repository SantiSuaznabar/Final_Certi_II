package stepDefinitions;

import Pages.Main_Directory_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import utilities.DriverManager;

public class Directory_Page_Steps {

    Main_Directory_Page directory_page = new Main_Directory_Page(DriverManager.getDriver().driver);

    @Then("I should be in the Directory page")
    public void verifyDirectoryPage(){Assert.assertTrue(directory_page.verifyRecordsLabel());}


}
