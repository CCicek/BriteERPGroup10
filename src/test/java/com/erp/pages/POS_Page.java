package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class POS_Page extends BasePage {

    //================================================Orders==================================================
    @FindBy(className = "o_searchview_input")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@data-menu-parent=\"484\"]//li")
    public WebElement tabOptions;

    @FindBy(xpath = "//table//th")
    public List<WebElement> tableHeaders;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> tableRows;

    @FindBy(css = ".o_pager_next")
    public WebElement nextPageButton;

    @FindBy(css = ".o_pager_previous")
    public WebElement prevPageButton;

    @FindBy(xpath = "//p[contains(text(),'Use this menu to browse')]")
    public WebElement otherSearchMeassage;

    public void navigateToTab(String tab) {
        String  num = "";

        switch (tab.toLowerCase()) {
            case "orders":
                num = "1";
                break;
            case "sessions":
                num = "2";
                break;
            case "products":
                num = "3";
                break;
            case "pricelists":
                num = "4";
                break;
            case "orders analysis":
                num = "5";
                break;
            case "sales details":
                num = "6";
                break;
            case "point of sale":
                num = "7";
                break;
            case "products categories":
                num = "8";
                break;
        }

        String xpath = "(//div[@data-menu-parent=\"484\"]//li)["+num+"]";

        Driver.get().findElement(By.xpath(xpath)).click();

    }

    public String orderCellData(){

        String xpath = "//table//tbody/tr[1]/td[2]";

        return Driver.get().findElement(By.xpath(xpath)).getText();

    }

    public List<String> headerNames() {
        List<String> actualHeaders = new ArrayList<>();
        for (WebElement header : tableHeaders) {
            if(!header.getText().isEmpty()) {
                actualHeaders.add(header.getText());
            }
        }
        return actualHeaders;
    }

  //  ============================================SESSIONS================================================

    @FindBy(xpath = "//a[@name='config_id']")
    public WebElement posText;

    @FindBy(css = ".btn.btn-primary.btn-sm.o_form_button_edit")
    public WebElement editButton;

    @FindBy(css = ".fa.fa-external-link.btn.btn-default.o_external_button")
    public WebElement posEdit;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']//span[contains(text(),'Save')]")
    public WebElement posEditSave;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement posSave;

    public WebElement rowInfo(String posName){

    String xpath = "//td[contains(text(),'"+posName+"')]";

    return Driver.get().findElement(By.xpath(xpath));
    }











}