package stepDefs;

import di.Context;
import driver.CreateDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartStepDef {
    private WebDriver driver;
    private Context context;

    public AddToCartStepDef(Context context){
    this.driver= CreateDriver.getInstance().getDriver();
    this.context=context;
    }

    @When("user add {string} item to cart")
    public void user_add_item_to_cart(String item) {

        driver.findElement(By.xpath("//div[@class='inventory_item'] //div[text()='"+item+"']/parent::a/parent::div/following-sibling::div/button")).click();

        context.setContext("itemName",item);
    }


    @Then("user verify the item is removed from cart")
    public void verifyItemInCart() {

        Assert.assertEquals("Add to cart",this.context.getContext("addToCartText"));


    }


}
