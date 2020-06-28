package com.erp.pages;

import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesPage extends BasePage{

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

    @FindBy(css = ".o_notification_title")
    public WebElement notificationTitle;

    @FindBy(css = ".o_notification_content")
    public WebElement notificationContent;

    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> listOfQuotations;



    public void clickQuatationNumber(String quatation){
        BrowserUtils.waitFor(2);
        List<String> elementsText = BrowserUtils.getElementsText(listOfQuotations);
        // System.out.println("elementsText = " + elementsText);
        while(!elementsText.contains(quatation)){
            nextBtn.click();
            BrowserUtils.waitFor(2);
            List<String> elementsText1 = BrowserUtils.getElementsText(listOfQuotations);
            System.out.println("elementsText1 = " + elementsText1);
            if(elementsText1.contains(quatation)){
                String xpath = "//td[contains(text(),'"+quatation+"')]";
                Driver.get().findElement(By.xpath(xpath)).click();
                BrowserUtils.waitFor(2);
                break;
            }

        }

    }

}
