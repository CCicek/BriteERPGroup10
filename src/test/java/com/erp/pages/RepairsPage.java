package com.erp.pages;

import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepairsPage extends BasePage{

    @FindBy (xpath = "//button[contains(@accesskey,'c')]")
    public WebElement createBtn;

    @FindBy (xpath = "//button[.='Confirm Repair']")
    public WebElement confirmBtn;

    @FindBy (xpath = "//button[contains(@accesskey,'s')]")
    public WebElement saveBtn;

    @FindBy (xpath = "//a[.='Repair Orders']")
    public WebElement repairOrdersLink;

    @FindBy (xpath = "//li[@class='ui-menu-item'][3]")
    public WebElement xxxx;

    @FindBy (xpath = "(//input[contains(@class,'o_input ui-autocomplete-input')])[1]")
    public WebElement productInput;

    @FindBy (xpath = "(//input[contains(@class,'o_input ui-autocomplete-input')])[4]")
    public WebElement customerInput;

    @FindBy (xpath = "(//input[contains(@class,'o_input ui-autocomplete-input')])[5]")
    public WebElement deliveryAddInput;

    @FindBy (xpath = "//input[contains(@class,'o_datepicker_input o_input')]")
    public WebElement dateInput;

    @FindBy (xpath = "//button[contains(@name,'action_done')]/span")
    public WebElement confirmPopUpButton;

    @FindBy (xpath = "(//button[contains(@class,'btn btn-sm btn-primary')]/span)[1]")
    public WebElement createCustomerPopButton;

    @FindBy (xpath = "((//button[contains(@class,'btn btn-sm btn-primary')]/span)[3]")
    public WebElement createAddPopButton;

    @FindBy (xpath = "(//button[contains(@class,'btn btn-sm btn-primary')]/span)[1]")
    public WebElement createProdPopButton;

    @FindBy (linkText = "Add an item")
    public WebElement addanItem;

    @FindBy (css = "div[name='product_id']>div>input")
    public WebElement prodInputBox;


    public void createNewRepairsOrder(String productRepair,String customer, String productDate){

        prodInputBox.click();

        String xpath = "//li[@class='ui-menu-item']/a[contains(text(),'"+productRepair+"')]";

        Driver.get().findElement(By.xpath(xpath)).click();

        customerInput.click();

        xpath = "//li[@class='ui-menu-item']/a[contains(text(),'"+customer+"')]";

        customerInput.sendKeys(xpath+Keys.ENTER);

        dateInput.sendKeys(productDate);

        BrowserUtils.waitFor(1);

        confirmBtn.click();

        confirmPopUpButton.click();

        saveBtn.click();
    }




}

