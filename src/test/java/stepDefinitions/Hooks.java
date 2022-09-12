package stepDefinitions;

import Pages.Main_PIM_Page;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import org.monte.screenrecorder.ScreenRecorder;
import utilities.DriverManager;



public class Hooks {

    private static ScreenRecorder screenRecorder;
    Main_PIM_Page main_pim_page = new Main_PIM_Page(DriverManager.getDriver().driver);

    @AfterAll
    public static void afterAll() {
        DriverManager.getDriver().driver.close();
    }

    @After("@NeedLogout")//->Ponerle a los test cases que lo necesiten
    public void afterScenario(){
        //System.out.println("Need Logout AfterTag");
        main_pim_page.clickOnProfileOptions();
        main_pim_page.clickLogoutBtn();
    }

}