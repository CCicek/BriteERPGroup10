package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InvoicingPage extends BasePage{


    @FindBy(xpath = "//div[@class='oe_secondary_menu'][@data-menu-parent='199']/div/following-sibling::ul/li//li//span")
    public List<WebElement> tabElements;

    public void navigateToTab(String tabName, String subTabName){

        Driver.get().findElement(By.xpath("(//span[normalize-space()='Master Data'])[1]")).click();
        Driver.get().findElement(By.xpath("(//span[normalize-space()='Master Data'])[2]")).click();
        Driver.get().findElement(By.xpath("(//span[normalize-space()='Documents'])[2]")).click();


        String xpath = "//div[normalize-space()='"+tabName+"']/following-sibling::ul[1]//span[normalize-space()='"+subTabName+"']";
        Driver.get().findElement(By.xpath(xpath)).click();

        waitTheTitleContains(subTabName);
    }







}
