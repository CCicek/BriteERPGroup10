package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscussPage extends BasePage {

    @FindBy(xpath = "//div[@class='o_mail_chat_sidebar']//div[3]//span[1]")
    public WebElement addButton;

    @FindBy(xpath = "//input[@placeholder='Add a channel']")
    public WebElement addChannel;

    @FindBy(xpath = "//*[@title='Channel 10']")
    public WebElement channel10;



    @FindBy(xpath = "//span[@xpath='1']")
    public WebElement addMailButton;

    @FindBy(xpath = "//input[@xpath='1']")
    public WebElement directMessages;

    @FindBy(xpath = "//div[@class='o_main_content']//div[8]//span[1]")
    public WebElement clickmessageButton;

    @FindBy(xpath = "//input[@placeholder='User name']")
    public WebElement sendTo;

    @FindBy(xpath = "//*[@title='EventsCRMManager101']")
    public WebElement message;

    @FindBy(xpath = "//textarea[@xpath='1']")
    public WebElement textMessage;

    @FindBy(xpath = "//button[@xpath='5']")
    public WebElement attachment;

    @FindBy(xpath = "//button[@tabindex='4']")
    public WebElement emoji;

    @FindBy(xpath = "//button[@tabindex='3']")
    public WebElement sendButton;

}


