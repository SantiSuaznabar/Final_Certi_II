package stepDefinitions;

import Pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DriverManager;

public class LoginSteps{

    Login_Page loginPage = new Login_Page(DriverManager.getDriver().driver);

    @Given("I set the user name with {string}")
    public void setUserName(String usrName){loginPage.setUsernameTB(usrName);}

    @And("I set the password field with {string}")
    public void setPassword(String pass){loginPage.setPasswordTB(pass);}

    @When("I click the Login Button")
    public void clickLoginBtn(){loginPage.clickLoginBtn();}

    @Then("An error message should be displayed")
    public void verifyErrorMsg(){
        Assert.assertTrue(loginPage.verifyErrorMSG());}

    @Then("I should be in the login page again")
    public void verifyLoginPage(){Assert.assertTrue(loginPage.verifyLoginLabel());}
}
