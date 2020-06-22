package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebSitePage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Website')]")
    public WebElement websiteButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default js_date_range active']")
    public WebElement lastWeek;



    /*
    @FindBy(css = ".btn.btn-primary.btn-sm.o_list_button_add")
    public WebElement createBtn;

    @FindBy(className = "btn btn-sm btn-default o_button_import")
    public WebElement importBtn;

    @FindBy(xpath = "//label[normalize-space(text())='Customer']/..//following-sibling::td//input")
    public WebElement customerName;

    @FindBy(xpath = "//span[normalize-space(text())='Create']")
    public WebElement confirmation;

    @FindBy(xpath = "(//button[normalize-space(text())='Save'])[1]")
    public WebElement saveBtn;
    @FindBy(linkText = "Create and Edit...")
    public WebElement createEdit;
    @FindBy(xpath = "//input[normalize-space(@name)='name']")
    public WebElement name;

    @FindBy(css = ".fa.fa-chevron-right")
    public WebElement nextBtn;

     */

}

