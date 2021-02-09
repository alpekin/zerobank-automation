package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationStepDef {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String linkName) {
    new AccountSummaryPage().clickLink(linkName).click();

    }

    @Then("the {string} page should be displayed")
    public void the_Account_Activity_page_should_be_displayed(String expectedTabName) {

        Assert.assertEquals(expectedTabName, new AccountSummaryPage().tabName.getText());
    }
    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedSelection) {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        Select isSelected= new Select(accountActivityPage.accountDropdown);
        String actualSelection= isSelected.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedSelection,actualSelection);
    }
}
