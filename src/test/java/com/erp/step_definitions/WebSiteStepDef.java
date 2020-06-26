package com.erp.step_definitions;

import com.erp.pages.InvoicingPage;
import com.erp.pages.SalesPage;
import com.erp.pages.WebSitePage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebSiteStepDef {

    WebSitePage webSitePage = new WebSitePage();

    @When("the user navigates to the button {string}")
    public void the_user_navigates_to_button(String LastWeek) {

        webSitePage.lastWeek.click();

    }

    @Then("the system should display the {string} table title")
    public void the_system_should_display_the_table_title(String expectedTableTitle) {
        BrowserUtils.waitFor(2);
        String actualTableTitle = webSitePage.tableTitle.getText();

        System.out.println("actualTableTitle = " + actualTableTitle);

        Assert.assertEquals(expectedTableTitle, actualTableTitle);


    }

    @When("the user navigates to the module. {string}")
    public void the_user_navigates_to_the_module(String Orders) {

        webSitePage.navigateTo(Orders);
        BrowserUtils.waitFor(3);
    }

    @When("user click {string}")
    public void user_click(String tableButton) {
        webSitePage.clickTableBut(tableButton);

    }

    @Then("the table title should contain {string}")
    public void the_table_title_should_contain(String tableButton) {
        tableButton = tableButton.toUpperCase();
        String actualTableTitle = webSitePage.tableTitle.getText();

        System.out.println("actualTableTitle = " + actualTableTitle);

        Assert.assertTrue(actualTableTitle.contains(tableButton));

    }

    @Then("the system should display the {string} subtitle.")
    public void the_system_should_display_the_subtitle(String expectedSubtitle) {
        WebSitePage webSitePage = new WebSitePage();
        String actualPageSubtitle = webSitePage.getPageSubTitle();
        System.out.println("expectedSubtitle = " + expectedSubtitle);
        Assert.assertEquals("verify the page subtitle", expectedSubtitle, actualPageSubtitle);

    }

    @Then("user click goes to Order-Create section")
    public void user_click_Order_button() {
        WebSitePage webSitePage = new WebSitePage();
        webSitePage.ordersBut.click();
        BrowserUtils.waitFor(2);
        webSitePage.ordersCreateBut.click();
        BrowserUtils.waitFor(2);

    }

    @When("user clicks the create button.")
    public void user_clicks_the_create_button() {
        WebSitePage webSitePage = new WebSitePage();
        webSitePage.ordersCreateBut.click();
        BrowserUtils.waitFor(2);

    }

    @When("user fills the following blanks.")
    public void user_fills_the_following_blanks() {


    }


}

