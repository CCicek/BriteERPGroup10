package com.erp.pages;

import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class InvoicingPage extends BasePage{

    @FindBy (xpath = "(//span[normalize-space()='Master Data'])[1]")
    public WebElement salesMasterData;
    @FindBy (xpath = "(//span[normalize-space()='Master Data'])[2]")
    public WebElement purchasesMasterData;
    @FindBy (xpath = "(//span[normalize-space()='Documents'])[2]")
    public WebElement purchasesDocuments;

    //the elements of the Customer Invoices Table
    @FindBy (xpath = "//tbody//tr/td[2]")
    public List<WebElement> customerNames;
    @FindBy (xpath = "//tbody//tr/td[3]")
    public List<WebElement> invoiceDates;
    @FindBy (xpath = "//tbody//tr/td[5]")
    public List<WebElement> salesPersons;
    @FindBy (xpath = "//tbody//tr")
    public List<WebElement> customerInvoicesTableRows;

    @FindBy (xpath = "//button[normalize-space()='Create']")
    public WebElement createBtn;
    @FindBy (css = "div[name='partner_id']>div>input")
    public WebElement customerInputBox;
    @FindBy (css = "div[name='payment_term_id']>div>input")
    public WebElement paymentTermsInputBox;
    @FindBy (name = "date_invoice")
    public WebElement invoiceDateInputBox;
    @FindBy (linkText = "Add an item")
    public WebElement addItem;
    @FindBy (css = "div[name='product_id']>div>input")
    public WebElement productInputBox;
    @FindBy (xpath = "//button[normalize-space()='Discard']/preceding-sibling::button")
    public WebElement saveBtn;
    @FindBy (css = ".o_thread_message_content>p")
    public WebElement invoiceCreated;





    public void navigateToTab(String tabName, String subTabName){

        salesMasterData.click();
        purchasesMasterData.click();
        purchasesDocuments.click();

        String xpath = "//div[normalize-space()='"+tabName+"']/following-sibling::ul[1]//span[normalize-space()='"+subTabName+"']";
        Driver.get().findElement(By.xpath(xpath)).click();

        waitTheTitleContains(subTabName);
    }

    public List<String> getCustomerInvoicesTableRows(){
        return BrowserUtils.getElementsText(customerInvoicesTableRows);

    }

    public void myWait(){
        WebElement loading = Driver.get().findElement(By.className("o_loading"));
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.attributeContains(loading, "style","display: none;"));
    }

    public void createNewCustomerInvoices(String customerName, String paymentType, String invoiceDate, String productName){
        createBtn.click();
        BrowserUtils.waitForClickablility(customerInputBox,2);
        customerInputBox.click();
        Driver.get().findElement(By.xpath("//li[@class='ui-menu-item'][2]")).click();

        paymentTermsInputBox.sendKeys(paymentType+Keys.ENTER+Keys.TAB+invoiceDate+Keys.TAB+invoiceDate);

        addItem.click();
        BrowserUtils.waitForVisibility(productInputBox,2);
        productInputBox.sendKeys(productName);
        Driver.get().findElement(By.xpath("//a[contains(text(),'phone')]")).click();
        saveBtn.click();
    }







}
