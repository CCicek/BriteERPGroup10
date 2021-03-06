package com.erp.pages;

import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//h2")
    public WebElement tableTitle;

    @FindBy(xpath = "//button[contains(text(),'Last Month')]")
    public WebElement lastMonth;

    @FindBy(xpath = "//button[contains(text(),'Last Year')]")
    public WebElement lastYear;

    @FindBy(xpath = "(//span[@class='oe_menu_text'][contains(text(),'Orders')])[5]")
    public WebElement ordersBut;

    @FindBy(linkText = "Orders")
    public WebElement orderLink;

    @FindBy(css = "body > div.o_main > div.o_sub_menu > div.o_sub_menu_content > div:nth-child(7) > ul:nth-child(3) > li.active > a > span")
    public WebElement ordersBut1;

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



    public void navigateToTab(String tabName, String subTabName){

        lastWeek.click();
        lastMonth.click();
        lastYear.click();

        String xpath = "//div[normalize-space()='"+tabName+"']/following-sibling::ul[1]//span[normalize-space()='"+subTabName+"']";
        Driver.get().findElement(By.xpath(xpath)).click();

        waitTheTitleContains(subTabName);


    }

    public void clickTableBut(String buttonName) {
        String xpath = "//button[text()='"+buttonName+"']";
        Driver.get().findElement(By.xpath(xpath)).click();
        BrowserUtils.waitFor(1);
    }


}

