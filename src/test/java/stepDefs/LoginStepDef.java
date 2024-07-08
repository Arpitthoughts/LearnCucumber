package stepDefs;

import di.Context;
import driver.CreateDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.List;
import java.util.Map;
public class LoginStepDef {
private WebDriver driver;
    LoginPage loginPage;
    private Context context;
    public LoginStepDef(Context context){

        CreateDriver.getInstance().setDriver("chrome");
       this.driver= CreateDriver.getInstance().getDriver();
       driver.manage().window().maximize();
        this.context=context;
    }

    @Given("user has launched url {string}")
    public void LaunchURL(String url) {
        CreateDriver.getInstance().getDriver().get(url);

    }


   /* @And("user has entered credentials")
    public void enterCredentials(DataTable table) {
        List<Map<String,String >> credentials=table.asMaps(String.class,String.class);
        String userName=credentials.get(0).get("Username");
       String password =credentials.get(0).get("Password");
       driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);

    }*/

    @And("user has entered credentials")
    public void user_has_entered_credentials(Map<String,String> map){
        loginPage=new LoginPage(driver);
        loginPage.getUserName().sendKeys(map.get("username"));
        loginPage.getPassword().sendKeys(map.get("password"));

    }



    @And("user has entered username {string} and password {string}")
    public void enterCredentials(String userName, String password) {
        loginPage=new LoginPage(driver);
        loginPage.getUserName().sendKeys(userName);
        loginPage.getPassword().sendKeys(password);
    }


    @When("User click on Login")
    public void userClicksLogin() {
    loginPage.getLoginButton().click();
    }
    @Then("user verify {string} on dashboard")
    public void userVerifyDashboard(String element) {
       Assert.assertTrue(CreateDriver.getInstance().getDriver().findElement(By.xpath("//span[@class='title']")).isDisplayed());
    }
}
