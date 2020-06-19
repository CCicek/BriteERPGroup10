package com.erp.step_definitions;

import com.erp.pages.LoginPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Loginstepdef {
    LoginPage loginPage=new LoginPage();

    @When("user login with right {string} and {string}")
    public void user_login_with_right_and(String string, String string2) {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.Login(string,string2);
    }

    @Then("use must see title as {string}")
    public void use_must_see_title_as(String expectedTitle) {
        BrowserUtils.waitFor(5);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user login with wrong {string} and {string}")
    public void user_login_with_wrong_and(String string, String string2) {
        Driver.get().get(ConfigurationReader.get("url"));
      loginPage.LoginWithString(string,string2);
    }

    @Then("user get error message {string}")
    public void user_get_error_message(String expectedResult) {
        String actualResult=loginPage.alertMessage.getText();
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("user in the main page")
    public void user_in_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.Login();

    }

}
