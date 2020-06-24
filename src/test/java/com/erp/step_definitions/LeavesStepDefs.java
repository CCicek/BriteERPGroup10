package com.erp.step_definitions;

import com.erp.pages.LeavesPage;
import com.erp.pages.LoginPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

public class LeavesStepDefs {
LeavesPage leavesPage=new LeavesPage();
LoginPage loginPage=new LoginPage();

    @When("the user login with {string} and {string}")
    public void the_user_login_with_and(String string, String string1) {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.LoginWithString(string,string1);
       BrowserUtils.waitFor(5);
    }

    @When("the user creates a new Leaves using following info")
    public void the_user_creates_a_new_Leaves_using_following_info() {
        LeavesPage leavesPage = new LeavesPage();
        leavesPage.descrpbtn.sendKeys("Description");
        leavesPage.leavetype.sendKeys("Leave Type");
        leavesPage.duration1.sendKeys("Duration");
        leavesPage.duration2.sendKeys("Duration");
        leavesPage.employee.sendKeys("Employee");
        leavesPage.depart.sendKeys("Department");

    }

        @Then("the user should  see the {string} message")
    public void the_user_should_see_the_message(String expmsg) {
        String actualmsg= leavesPage.msg.getText();
        Assert.assertEquals("Verifying the created leaves",expmsg,actualmsg);

    }

}
