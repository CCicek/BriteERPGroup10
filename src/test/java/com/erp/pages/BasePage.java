package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='o_loading']")
    public WebElement loadingDisplay;





    public void navigateTo(String modul) {
        Driver.get().findElement(By.xpath("//span[contains(text(),'" + modul + "')]")).click();
    }
}