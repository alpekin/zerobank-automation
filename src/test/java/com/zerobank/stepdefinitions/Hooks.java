package com.zerobank.stepdefinitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void setUp() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @After
    public void tearDown() {

        Driver.closeDriver();
    }
}
