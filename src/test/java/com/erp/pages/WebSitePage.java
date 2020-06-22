package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebSitePage extends BasePage{

    // in this page i defined locators of website section..but the page is strange my friends..
    //anlayan beri gelsin..who can understand come closer guys
    // non facile amici..

    @FindBy(xpath = "//span[contains(text(),'Website')]")
    public WebElement websiteButton;

    @FindBy(xpath = "//div[@class='o_inner_box o_primary']")
    public WebElement gotoWebsiteButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default js_date_range active']")
    public WebElement lastWeek;

    @FindBy(xpath = "//button[contains(text(),'Last Month')]")
    public WebElement lastMonth;

    @FindBy(xpath = "//button[contains(text(),'Last Year')]")
    public WebElement lastYear;










}

