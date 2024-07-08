package hooks;

import driver.CreateDriver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {

    @Before
    public void setUp(){
        //CreateDriver.getInstance().setDriver("chrome");
     //driver=  CreateDriver.getInstance().getDriver();


    //driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown(Scenario scenario){

        CreateDriver.getInstance().getDriver().quit();
    }

    @BeforeStep
    public void beforeeachstep(){
        System.out.println("before each step");
    }

    @AfterStep
    public void aftereachstep(Scenario scenario){



            TakesScreenshot takesScreenshot = (TakesScreenshot) CreateDriver.getInstance().getDriver();
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", screenshot.toString());
            System.out.println("after each step");

    }

}
