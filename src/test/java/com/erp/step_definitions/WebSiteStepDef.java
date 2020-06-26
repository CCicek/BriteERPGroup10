package com.erp.step_definitions;

import com.erp.pages.LoginPage;
import com.erp.pages.WebSitePage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    public void the_user_navigates_to_the_module(String Website) {

        webSitePage.navigateTo(Website);
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

    @Then("user click Order button")
    public void user_click_Order_button() {
        WebSitePage webSitePage = new WebSitePage();
        webSitePage.ordersBut.click();
        BrowserUtils.waitFor(2);
        //webSitePage.ordersCreateBut.click();
       // BrowserUtils.waitFor(2);

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
    @Given("user login with true {string} and {string}")
    public void user_login_with_true_and(String userName, String password) {

        //STEP_1 login to system
        // there is login method but i wrote here extra..
        // check LoginStepDef for better understanding

        //Driver.get().get(ConfigurationReader.get("url"));
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(2);
        LoginPage loginPage = new LoginPage();
        //WebSitePage webSitePage = new WebSitePage();

        loginPage.userName.sendKeys(ConfigurationReader.get("usernamePM3"));
        loginPage.password.sendKeys(ConfigurationReader.get("password"));
        loginPage.loginButton.click();
        //STEP 2 go to WebSite Module
        // now we go to WebSite module



    }

    @When("user enter {string} module")
    public void user_enter_module(String expectedSubtitle) {

        WebSitePage webSitePage = new WebSitePage();

        webSitePage.websiteBut.click();
        String actualPageSubtitle = webSitePage.getPageSubTitle();
        expectedSubtitle = "Dashbo";
        System.out.println("expectedSubtitle = " + expectedSubtitle);
        Assert.assertEquals("verify the page subtitle", expectedSubtitle, actualPageSubtitle);


    }

    @When("user open {string} page")
    public void user_open_page(String string) {

    }

    @Then("user click {string} button")
    public void user_click_button(String string) {

    }



}

