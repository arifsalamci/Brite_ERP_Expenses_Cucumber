package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setup(){
        //Anything that you want to run before each Scenario

    }
    //For Hooks @After must come from cucucmber!!!! not Junit!!!
    // We want to run it after every scenario, not after each test

    @After
    public void tearDown(Scenario scenario){

        //checking if our Scenario is failed
        if(scenario.isFailed()){

            //takes screenshot
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            // attach the scenario to the report
            scenario.embed(screenshot,"image/png");
        }
        Driver.quitDriver();
    }

}
