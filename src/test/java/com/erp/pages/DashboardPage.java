package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'My Dashboard')]")
    public WebElement myDashboardButton;
    @FindBy(xpath = "//b[contains(text(),'Your personal dashboard is empty.')]")
    public WebElement pageMessage;

}
