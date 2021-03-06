package com.erp.pages;

import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='o_loading']")
    public WebElement loadingDisplay;

    @FindBy(css = ".breadcrumb>li")
    public WebElement pageSubTitle;



    public void navigateTo(String modul) {
        String locator = "(//span[normalize-space()='"+modul+"' and @class='oe_menu_text'])[1]";
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath(locator)));
    }


    public void waitTheTitleIs(String title){
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.titleIs(title));
    }

    public void waitTheTitleContains(String title){
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.titleContains(title));
    }

    public String getPageSubTitle() {
        return pageSubTitle.getText();
    }



    public void navigateToModules(String modules) {

        String xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//span[normalize-space(text())='"+modules+"']";

        Driver.get().findElement(By.xpath(xpath)).click();

    }


    public String getPageSubTitle(String moduleName){

        BrowserUtils.waitFor(1);

        String titlePath="//li[contains(text(),'"+moduleName+"') and contains(@class,'active')]";

        String titleStr = Driver.get().findElement(By.xpath(titlePath)).getText();

        return titleStr;
    }



}