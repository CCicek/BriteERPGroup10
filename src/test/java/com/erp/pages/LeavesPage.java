package com.erp.pages;

import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.lv.Un;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeavesPage extends BasePage {
    @FindBy(xpath = "(//span[normalize-space()='Leaves Summary'])")
    public WebElement LeavesSum;
    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement create;
    @FindBy(css = ".o_field_char.o_field_widget.o_input")
    public WebElement descrpbtn;
    @FindBy(css = "div[name='holiday_status_id']>div>input")
    public WebElement leavetype;
    @FindBy(css = "div[name='date_from']>div>input")
    public WebElement duration1;
    @FindBy(css = "div[name='date_to']>div>input")
    public WebElement duration2;
    @FindBy(css = "div[name='employee_id']>div>input")
    public WebElement employee;
    @FindBy(className = "ui-menu-item")
    public List<WebElement> Unpaid;
    @FindBy(css = "div[name='department_id']>div>input")
    public WebElement depart;
    @FindBy (xpath = "//button[normalize-space()='Discard']/preceding-sibling::button")
    public  WebElement save;
    @FindBy(xpath = "//span[contains(text(),'David Samson on Unpaid : 2.00 day(s)')]")
    public WebElement msg;
     public void navigateToTab(String tabName,String subTabName){
         LeavesSum.click();
         String xpath = "//div[normalize-space()='"+tabName+"']/following-sibling::ul[1]//span[normalize-space()='"+subTabName+"']";
         Driver.get().findElement(By.xpath(xpath)).click();
          create.click();
          BrowserUtils.waitFor(2);

     }
     public void createNewLeaves(String Description,String leaveType,String duration1,String duration2,String employe,String department){
         create.click();
         BrowserUtils.waitFor(3);
         descrpbtn.click();
         this.employee.click();
         for (WebElement unp : Unpaid) {
             if(unp.getText().equals(employee)){
                 unp.click();
                 break;
             }
             for (WebElement dpr : Unpaid) {
                 if(dpr.getText().equals(department)){
                     dpr.click();
                     break;
                 }

             }
             save.click();

         }
     }

}
