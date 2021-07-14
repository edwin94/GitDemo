package test.StepDefinition;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static test.StepDefinition.LoginSteps.getChrome;

public class Hooks {

    WebDriver driver = getChrome();

    @AfterStep
    public void addScreenshot(Scenario scenario){
        //if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        //}
    }
}
