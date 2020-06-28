package com.erp.step_definitions;

import com.erp.pages.SalesPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class SalesStepDefs {

    @When("user clicks the create button")
    public void user_clicks_the_create_button() {
        SalesPage salesPage = new SalesPage();
        salesPage.createBtn.click();
        BrowserUtils.waitFor(2);

    }

    @Then("user fills the following blanks")
    public void user_fills_the_following_blanks(DataTable dataTable) {
        SalesPage salesPage = new SalesPage();

        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);

        System.out.println("maps.size() = " + maps.size());

        System.out.println("maps.get(0).keySet() = " + maps.get(0).keySet());

        System.out.println("Customer" + maps.get(0).values());

        for (int i = 0; i < maps.size(); i++) {
            maps.get(i).get("Customer");
            Driver.get().switchTo().activeElement().sendKeys(maps.get(i).get("Customer") + Keys.ESCAPE, Keys.TAB);
            Driver.get().switchTo().activeElement().sendKeys(maps.get(i).get("Invoice Adress") + Keys.ESCAPE, Keys.TAB);
            Driver.get().switchTo().activeElement().sendKeys(maps.get(i).get("Delivery Adress") + Keys.ESCAPE, Keys.TAB);
            Driver.get().switchTo().activeElement().sendKeys(maps.get(i).get("Expiration Date") + Keys.ESCAPE, Keys.TAB);
            Driver.get().switchTo().activeElement().sendKeys(maps.get(i).get("Pricelist") + Keys.ESCAPE, Keys.TAB);
            Driver.get().switchTo().activeElement().sendKeys(maps.get(i).get("Payment Terms") + Keys.ESCAPE, Keys.TAB);
            salesPage.saveBtn.click();
            new WebDriverWait(Driver.get(),5).until(ExpectedConditions.visibilityOf(
                    salesPage.notificationContent
            ));

        }
    }

    @Then("the system should display the {string} subtitle")
    public void the_system_should_display_the_subtitle(String expectedSubtitle) {
        SalesPage salesPage = new SalesPage();
        String actualPageSubTitle = salesPage.getPageSubTitle();
        //System.out.println("actualPageSubTitle = " + actualPageSubTitle);
        Assert.assertEquals("Verify the page subtitle", expectedSubtitle,actualPageSubTitle );
        List<String> elementsText = BrowserUtils.getElementsText(salesPage.listOfQuotations);




    }

    @When("the user navigates to the module {string}")
    public void the_user_navigates_to_module(String moduleName) {
        SalesPage salesPage = new SalesPage();
        salesPage.navigateToModules(moduleName);
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.titleContains("Quotations"));

    }

    @Then("user get the error message {string}")
    public void user_get_error_message(String expectedResult) {
        SalesPage salesPage = new SalesPage();
        String notificationTitleText=salesPage.notificationTitle.getText();
        String notificationContentText = salesPage.notificationContent.getText();

        System.out.println("Text = "+ notificationContentText);
        System.out.println("Text = "+ notificationTitleText);
    }

    @Then("user click the {string}")
    public void user_click_the(String string) {
        SalesPage salesPage = new SalesPage();


        salesPage.clickQuatationNumber(string);

    }
}