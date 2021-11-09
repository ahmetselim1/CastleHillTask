package SwagLabsAutomation;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseDriver {

    public  static RemoteWebDriver driver;

    public static void initializeDriver(String desiredDriver) throws MalformedURLException {

        desiredDriver = desiredDriver.toLowerCase();
        switch (desiredDriver){
            case "chrome":

                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
                break;

            default:
                throw new IllegalStateException("unexpected value: "+desiredDriver);
        }
    }
}
