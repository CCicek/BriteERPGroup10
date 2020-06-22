package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebSitePage extends BasePage{

    // in this page i defined locators of website section..but the page is strange my friends..


    @FindBy(xpath = "//span[contains(text(),'Website')]")
    public WebElement websiteBut;

    @FindBy(xpath = "//div[@class='o_inner_box o_primary']")
    public WebElement gotoWebsiteBut;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default js_date_range active']")
    public WebElement lastWeek;

    @FindBy(xpath = "//button[contains(text(),'Last Month')]")
    public WebElement lastMonth;

    @FindBy(xpath = "//button[contains(text(),'Last Year')]")
    public WebElement lastYear;

    @FindBy(xpath = "//li[@class='active']//span[@class='oe_menu_text'][contains(text(),'Orders')]")
    public WebElement ordersBut;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement ordersCreateBut;

    @FindBy(id = "o_field_input_434")
    public WebElement newCustomer;

    @FindBy(id = "o_field_input_436")
    public WebElement newInvoce;

    @FindBy(id = "o_field_input_437")
    public WebElement newDelivery;

    @FindBy(id = "o_field_input_440")
    public WebElement newPricelist;





















}

