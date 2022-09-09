package stepDefinitions;

import Pages.Login_Page;
import Pages.Main_PIM_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DriverManager;
import java.lang.String;

public class Main_PIM_Page_Steps {
    Main_PIM_Page mainPimPage = new Main_PIM_Page(DriverManager.getDriver().driver);

    @Then("I should be in the PIM section in the Main Page")
    public void verifyPIMTag() {
        Assert.assertTrue(mainPimPage.verifyPIM());
    }

    @Given("I Click the Directory Button")
    public void openDirectory() {
        mainPimPage.clickDirectoryBtn();
    }

    @Given("I click the profile settings")
    public void openProfileSettings(){mainPimPage.clickOnProfileOptions();}

    @And("I click the Logout Button")
    public void clickLogout(){mainPimPage.clickLogoutBtn();}

    @Given("I set the ID field with {string}")
    public void setID(String id){mainPimPage.setIdSearchTB(id);}

    @And("I click the search button")
    public void clickSearchBtn(){mainPimPage.clickSearchBtn();}

    @Then("I should see a result with {string}")
    public void verifyIdResult(String id){Assert.assertTrue(mainPimPage.verifySearchResult(id));}

}