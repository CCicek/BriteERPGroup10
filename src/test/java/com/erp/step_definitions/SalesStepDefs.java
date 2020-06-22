package com.erp.step_definitions;

import com.erp.pages.SalesPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

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
            BrowserUtils.waitFor(5);

        }
    }
}