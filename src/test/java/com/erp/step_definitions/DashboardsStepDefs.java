package com.erp.step_definitions;

import com.erp.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardsStepDefs {

    DashboardPage dashboardPage=new DashboardPage();

    @When("able to click My Dashboard")
    public void able_to_click_My_Dashboard() {
       dashboardPage.myDashboardButton.click();
    }

    @Then("user must see in the page {string}")
    public void user_must_see_in_the_page(String expectedResult) {
       String actualMessage= dashboardPage.pageMessage.getText();
        Assert.assertEquals(expectedResult,actualMessage);
    }

}
