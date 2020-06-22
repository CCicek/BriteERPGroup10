package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscussPage extends BasePage {

    @FindBy(xpath = "//div[@class='o_mail_chat_sidebar']//div[3]//span[1]")
    public WebElement addButton;

    @FindBy(xpath = "//input[@placeholder='Add a channel']")
    public WebElement addChannel;

    @FindBy(xpath = "//em[contains(text(),'\"#Channel 10\"')]")
    public WebElement channel10;



    @FindBy(xpath = "//span[@xpath='1']")
    public WebElement addMailButton;

    @FindBy(xpath = "//input[@xpath='1']")
    public WebElement directMessages;

}


