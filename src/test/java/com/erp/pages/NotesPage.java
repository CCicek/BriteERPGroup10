package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesPage extends BasePage {
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createButton;
    @FindBy(xpath = "//div[@class='note-editable panel-body']//p")
    public WebElement writingPad;
    @FindBy(xpath = "o_input ui-autocomplete-input")
    public WebElement tagSelect;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;
    @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement discardButton;
    @FindBy(xpath = "//div[@class='o_readonly']")
    public WebElement notesPano;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importbutton;
    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadFile;
    @FindBy(xpath = "//input[@placeholder='No file chosen...']")
    public WebElement choosePath;
    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;
}
