package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends BasePage {

    @FindBy(css = "th.fc-day-header.fc-widget-header")
    public List<WebElement> daysOfWeek;


    public void dateRange(String range){

        String rangePath="//button[.='"+range+"']";

        Driver.get().findElement(By.xpath(rangePath)).click();
    }



}
