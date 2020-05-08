package com.tech.selenium.tests;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.GoogleSearchPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


/**
 * Created by Sridhar Bandi on 5/9/18.
 * Updated on 26/01/19
 */
public class RunTest {

    private WebDriver driver;
    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @Before
    public void setUp(){
        driver = DriverFactory.getBrowser();
        googleSearchPage = new GoogleSearchPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @Test
    public void exampleTest(){
        //Write your test here
        googleSearchPage.openURL();
        googleSearchPage.searchFor("john.smith@gmail.com","john");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
