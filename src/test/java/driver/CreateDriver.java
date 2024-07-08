package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDriver {


private static ThreadLocal<WebDriver> driverThreadLocal= new ThreadLocal<>();
    private static CreateDriver INSTANCE;
   private CreateDriver(){

    }

    public static CreateDriver getInstance(){

       if(INSTANCE ==null){

           INSTANCE= new CreateDriver();
       }
        return INSTANCE;
    }

    public void setDriver(String browser){

        driverThreadLocal.set(DriverManager.getBrowserManager(browser).driver());
    }

    public WebDriver getDriver(){
       return driverThreadLocal.get();
    }

}
