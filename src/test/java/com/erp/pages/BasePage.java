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
        waitTheTitleContains(modul);
    }


    public void waitTheTitleIs(String title){
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.titleIs(title));
    }

    public void waitTheTitleContains(String title){
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.titleContains(title));
    }

    public String getPageSubTitle(){return pageSubTitle.getText();}

}