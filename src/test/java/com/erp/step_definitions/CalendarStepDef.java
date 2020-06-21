package com.erp.step_definitions;

import com.erp.pages.CalendarPage;
import io.cucumber.java.en.Then;

public class CalendarStepDef {

    CalendarPage calendarPage=new CalendarPage();

    @Then("the page subTitle should be {string}")
    public void the_page_subTitle_should_be(String expectedTitle) {
        String actualTitle = calendarPage.getPageTitle(expectedTitle);
    }

}
