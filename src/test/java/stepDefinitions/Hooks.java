package stepDefinitions;

import Pages.Main_PIM_Page;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.monte.media.Format;
import org.monte.media.FormatKeys;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import utilities.DriverManager;

import java.awt.*;
import java.io.IOException;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;


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