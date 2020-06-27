package com.erp.step_definitions;

import com.erp.pages.InvoicingPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class InvoicingStepDefs {


    InvoicingPage invoicingPage = new InvoicingPage();

    @When("the user navigates to module {string}")
    public void the_user_navigates_to_module(String moduleName) {
        invoicingPage.navigateTo(moduleName);

        BrowserUtils.waitFor(3);
    }


    @Then("the system should display {string} subtitle")
    public void the_system_should_display_subtitle(String expectedSubtitle) {

        List<String> rows = invoicingPage.getCustomerInvoicesTableRows();
        System.out.println(rows);


        String actualPageSubTitle = invoicingPage.getPageSubTitle();
        System.out.println("actualPageSubTitle = " + actualPageSubTitle);
        Assert.assertEquals("Verify the page subtitle", expectedSubtitle,actualPageSubTitle );

    }

    @When("the user navigates to tab {string} and {string}")
    public void the_user_navigates_to_tab_and(String tabName, String subTabName) {
        invoicingPage.navigateToTab(tabName, subTabName);
    }

    @When("the user creates a new Customer Invoice using following info")
    public void the_user_creates_a_new_Customer_Invoice_using_following_info(Map<String,String> map) {

        invoicingPage.createNewCustomerInvoices(map.get("Customer Name"), map.get("Payment Type"),
                map.get("Invoice date"),map.get("Product Name"));
    }

    @Then("the user should see the {string} message")
    public void the_user_should_see_the_message(String expectedMessage) {
        String actualMessage = invoicingPage.invoiceCreated.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals("Verifying the created invoice",expectedMessage,actualMessage);
    }



}
