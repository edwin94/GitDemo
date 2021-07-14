package test.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    static WebDriver driver;

    public static WebDriver getChrome(){
        if(driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;
    }

    @Given("^The user is on page$")
    public void the_user_is_on_page(){
        driver = getChrome();
        System.out.println("The user is on page");
    }

    @When("^The user enter values$")
    public void the_user_enter_values(){
        System.out.println("The user enter values");
    }

    @Then("^The user is logged$")
    public void the_user_is_logged(){
        System.out.println("The user is logged");
    }
}
