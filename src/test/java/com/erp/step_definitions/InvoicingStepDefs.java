package com.erp.step_definitions;

import com.erp.pages.InvoicingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InvoicingStepDefs {


    InvoicingPage invoicingPage = new InvoicingPage();

    @When("the user navigates to module {string}")
    public void the_user_navigates_to_module(String moduleName) {
        invoicingPage.navigateTo(moduleName);
    }

    @Then("the system should display {string} subtitle")
    public void the_system_should_display_subtitle(String expectedSubtitle) {
        String actualPageSubTitle = invoicingPage.getPageSubTitle();
        System.out.println("actualPageSubTitle = " + actualPageSubTitle);
        Assert.assertEquals("Verify the page subtitle", expectedSubtitle,actualPageSubTitle );
    }






}
