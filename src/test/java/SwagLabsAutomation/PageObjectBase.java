package SwagLabsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectBase extends BaseDriver {

    static By username = By.id("user-name");
    static By password = By.id("password");
    static By loginButton = By.id("login-button");
    static By appLogo = By.xpath("//button[@class='error-button']");
    static By errorMessage = By.xpath("//h3[@data-test='error']");

    public static WebElement getUserName() { return retryFindElement(username);}
    public static WebElement getPassword() { return retryFindElement(password);}
    public static WebElement getLoginbutton() { return retryFindElement(loginButton);}
    public static WebElement getAppLogo() { return retryFindElement(appLogo);};
    public static WebElement getErrormessage() { return retryFindElement(errorMessage);}

    public static WebElement waitToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement retryFindElement(By by){
        WebElement element = null;
        int attempts = 0;
        while(attempts<3){
            try{
                element = waitToBeClickable(driver.findElement(by));
                if(element!=null){
                    break;
                }
            }catch (org.openqa.selenium.StaleElementReferenceException e){
                element = waitToBeClickable(driver.findElement(by));
            }
            attempts++;
        }
        return element;
    }



}