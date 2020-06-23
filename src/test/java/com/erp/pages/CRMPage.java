package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRMPage extends BasePage {
    //create button
    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm o-kanban-button-new'])")
    public WebElement create;

}