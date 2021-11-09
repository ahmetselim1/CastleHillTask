package SwagLabsAutomation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSwagLabSteps extends BaseDriver {


    public LoginSwagLabSteps() {

    }

    @Given("I am on the Sauce Demo Login Page")
    public void i_am_on_the_Sauce_Demo_Login_Page() {

        PageObjectBase.driver.get("https://www.saucedemo.com/");
        System.out.println(driver.getCurrentUrl());
    }

    @When("I fill the account information for account StandardUser into the {string} field and the {string} field")
    public void i_fill_the_account_information_for_account_StandardUser_into_the_field_and_the_field(String username, String password) {
        PageObjectBase.getUserName().sendKeys(username);
        PageObjectBase.getPassword().sendKeys(password);
    }

    @When("I click the Login Button")
    public void i_click_the_Login_Button() {
        PageObjectBase.getLoginbutton().click();
    }

    @Then("I am redirected to the Sauce Demo Main Page")
    public void i_am_redirected_to_the_Sauce_Demo_Main_Page() {

        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
    }

    @Then("I verify the App Logo exists")
    public void i_verify_the_App_Logo_exists() {

        Assert.assertEquals(PageObjectBase.getAppLogo().isDisplayed() , true);
    }

    @When("I fill the account information for account LockedOutUser into the {string} field and the {string} field")
    public void i_fill_the_account_information_for_account_LockedOutUser_into_the_field_and_the_field(String username1, String password1) {
        PageObjectBase.getUserName().sendKeys(username1);
        PageObjectBase.getPassword().sendKeys(password1);
    }

    @Then("I verify the Error Message contains the text {string}")
    public void i_verify_the_Error_Message_contains_the_text(String errorMessage) {
        String expected = errorMessage;
        String actual = PageObjectBase.getErrormessage().getText();
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        Assert.assertEquals(actual, expected);
    }
}

