package com.erp.step_definitions;

import com.erp.pages.CalendarPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarStepDef {

    CalendarPage calendarPage=new CalendarPage();

    @Then("the page subTitle should be {string}")
    public void the_page_subTitle_should_be(String expectedTitle) {
        String actualTitle = calendarPage.getPageSubTitle(expectedTitle);
    }

    @When("the user click to {string} date range")
    public void the_user_click_to_date_range(String range) {
        calendarPage.dateRange(range);
        BrowserUtils.waitFor(3);
    }


    public String getExpectedDate(String dateStr){
        Date now=new Date();
        DateFormat df=new SimpleDateFormat(dateStr);
        return df.format(now);
    }




    @Then("the current date should be displayed in the subTitle according to {string}")
    public void the_current_date_should_be_displayed_in_the_subTitle_according_to(String dateType) {

        String str = dateType.equals("Day") ? "d" : dateType.equals("Week") ? "w" : "MMM";

        String exDate = getExpectedDate(str);

        String acDate = calendarPage.getPageSubTitle("Meeting");

        BrowserUtils.waitFor(1);
        Assert.assertTrue(acDate.contains(exDate));
    }



}
