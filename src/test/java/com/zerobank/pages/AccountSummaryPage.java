package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage{

    public WebElement clickLink(String link){
        String linkPath= "//a[contains(text(),'"+link+"')]";
        return Driver.get().findElement(By.xpath(linkPath));
    }

//    public WebElement getActualTabName (String tabName){
//        String actualTabName= "//a[contains(text(),'"+tabName+"')]";
//        return actualTabName.
//    }





}

