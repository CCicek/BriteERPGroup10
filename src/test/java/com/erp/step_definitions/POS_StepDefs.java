package com.erp.step_definitions;

import com.erp.pages.POS_Page;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

public class POS_StepDefs {

    POS_Page pos = new POS_Page();

    @Given("the user selects {string} tab")
    public void the_user_selects_tab(String tabName) {

        pos.navigateToTab(tabName);
        BrowserUtils.waitFor(3);
    }

    @When("the user searches")
    public void the_user_searches(Map<String,String> search) {
        pos.searchBox.sendKeys(search.get("Order Ref") + Keys.ENTER);
        BrowserUtils.waitFor(6);
    }




    @Then("the result shows details of")
    public void the_result_shows_details_of(Map<String,String> searchResult) {
             String actualResult = pos.orderCellData();
             Assert.assertEquals("verify search",searchResult.get("Order Ref"),actualResult);
        }


    @Then("the table display has the following headers")
    public void the_table_display_has_the_following_headers(List<String> expectedHeaders) {
        List<String> actualHeaderNames = pos.headerNames();
        Assert.assertEquals("verify headers",expectedHeaders,actualHeaderNames);

    }


    @Then("the user should be able to click the {string}")
    public void the_user_should_be_able_to_click_the(String expectedPosName) {
        pos.rowInfo(expectedPosName).click();
        String actualText = pos.posText.getText();
        BrowserUtils.waitFor(3);
        Assert.assertEquals("verify the pos client Name",expectedPosName,actualText);
    }


    @Then("should also be able to edit and save")
    public void should_also_be_able_to_edit_and_save() {
    pos.editButton.click();
    BrowserUtils.waitFor(2);
    pos.posEdit.click();
    BrowserUtils.waitFor(2);
    pos.posEditSave.click();
    BrowserUtils.waitFor(2);
    pos.posSave.click();
    }



}











