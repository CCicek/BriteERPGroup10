package com.erp.step_definitions;

import com.erp.pages.RepairsPage;
import io.cucumber.java.en.*;

import java.util.Map;

public class RepairsStepDefs {

    RepairsPage repairsPage = new RepairsPage();

    @Given("the user should click create Button")
    public void the_user_should_click_create_Button() {

        repairsPage.createBtn.click();

    }


    @When("the user creates a new Repair Order using following info")
    public void the_user_creates_a_new_Repair_Order_using_following_info(Map<String,String> table) {

        repairsPage.createNewRepairsOrder(table.get("Product to Repair"), table.get("Customer"),
                table.get("Delivery Address"),table.get("Product date"));
    }
}
