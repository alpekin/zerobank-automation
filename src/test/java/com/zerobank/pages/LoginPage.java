package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id ="signin_button")
    public WebElement signinButton;

    @FindBy(id="user_login")
    public WebElement username;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        signinButton.click();
        username.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        //Driver.get().navigate().back();
    }
}
