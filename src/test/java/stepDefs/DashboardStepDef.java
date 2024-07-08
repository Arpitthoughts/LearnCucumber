package stepDefs;

import driver.CreateDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class DashboardStepDef {
private WebDriver driver;

    public DashboardStepDef(){
    this.driver= CreateDriver.getInstance().getDriver();
    }

    @Then("user verify following product are visible on dashboard")
    public void verifyproductsarevisible(List<String> products){

        for (String product : products){

          boolean isAvailable= driver.findElement(By.xpath("//div[@class='inventory_item']//div[@class='inventory_item_label']/a/div[text()='"+product+"']")).isDisplayed();

          Assert.assertTrue(isAvailable);
        }
    }

    @And("user verify following tag price of following product")
    public void verifyproducttagprice(List<List<String>> listoflist){

    for (int i=0;i<listoflist.size();i++){
       WebElement product= driver.findElement(By.xpath("//div[@class='inventory_item']//div[@class='inventory_item_label']/a/div[text()='"+listoflist.get(0).get(0)+"']"));
Assert.assertEquals(listoflist.get(i).get(1),product.findElement(By.xpath("")));

    }

    }
}
