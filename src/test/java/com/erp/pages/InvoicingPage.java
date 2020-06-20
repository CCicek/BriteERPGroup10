package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InvoicingPage extends BasePage{

    @FindBy (xpath = "(//span[normalize-space()='Master Data'])[1]")
    public WebElement salesMasterData;
    @FindBy (xpath = "(//span[normalize-space()='Master Data'])[2]")
    public WebElement purchasesMasterData;
    @FindBy (xpath = "(//span[normalize-space()='Documents'])[2]")
    public WebElement purchasesDocuments;

    public void navigateToTab(String tabName, String subTabName){

        salesMasterData.click();
        purchasesMasterData.click();
        purchasesDocuments.click();

        String xpath = "//div[normalize-space()='"+tabName+"']/following-sibling::ul[1]//span[normalize-space()='"+subTabName+"']";
        Driver.get().findElement(By.xpath(xpath)).click();

        waitTheTitleContains(subTabName);
    }







}
