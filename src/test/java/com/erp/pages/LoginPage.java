package com.erp.pages;

import com.erp.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "login")
    public WebElement userName;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;
    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement alertMessage;

    public void Login() {
        userName.sendKeys(ConfigurationReader.get("usernameSM1"));
        password.sendKeys(ConfigurationReader.get("passwordSM"));
        loginButton.click();
    }

    public void Login(String username1, String password1) {
        userName.sendKeys(ConfigurationReader.get(username1));
        password.sendKeys(ConfigurationReader.get(password1));
        loginButton.click();
    }

    public void LoginWithString(String s1, String s2) {
        userName.sendKeys(s1);
        password.sendKeys(s2);
        loginButton.click();
    }

}
