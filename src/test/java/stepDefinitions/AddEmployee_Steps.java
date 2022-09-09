package stepDefinitions;

import Pages.Main_PIM_Page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DriverManager;

import java.util.List;

public class AddEmployee_Steps {
    Main_PIM_Page main_pim_page = new Main_PIM_Page(DriverManager.getDriver().driver);

    @And("I click the \"Add Employee\" Button")
    public void clickAddEmployeeBtn(){main_pim_page.clickAddEmployeeBtn();}

    @And("I fill the Employee information with")
    public void fillEmployeeInfo(DataTable employeeInfo)
    {
        List<String> info = employeeInfo.transpose().asList(String.class);
        main_pim_page.setFirstNameTB(info.get(0));
        main_pim_page.setMiddleNameTB(info.get(1));
        main_pim_page.setLastNameTB(info.get(2));
    }

    @And("I click the Save Button")
    public void clickSaveEmployeeBtn(){main_pim_page.clickSaveEmployeeBtn();}

    @Then("The we should see the personal detail")
    public void verifyDetails(){
        Assert.assertTrue(main_pim_page.verifyPersonalDetailsLbl());
    }

}
