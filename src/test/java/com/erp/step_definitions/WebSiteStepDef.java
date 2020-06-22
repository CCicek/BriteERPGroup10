package com.erp.step_definitions;

import com.erp.pages.InvoicingPage;
import com.erp.pages.WebSitePage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class WebSiteStepDef {

    WebSitePage webSitePage = new WebSitePage();

    @When("the user navigates to module {string}")
    public void the_user_navigates_to_module(String moduleName) {
        webSitePage.navigateTo(moduleName);

        BrowserUtils.waitFor(3);
    }


    @Then("the system should display {string} subtitle")
    public void the_system_should_display_subtitle(String expectedSubtitle) {

        new WebSitePage().lastWeek.click();

        System.out.println("lastWeek is on screen");


        String actualPageSubTitle = webSitePage.getPageSubTitle();
        System.out.println("actualPageSubTitle = " + actualPageSubTitle);
        Assert.assertEquals("Verify the page subtitle", expectedSubtitle,actualPageSubTitle );

    }
}
